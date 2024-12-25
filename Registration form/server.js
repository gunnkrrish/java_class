const http = require('http'); 
const fs = require('fs');
const { parse } = require('querystring');

// Create the server
const server = http.createServer((req, res) => {
    if (req.method === 'GET') {
        // Serve the registration form
        fs.readFile('index.html', (err, content) => {
            if (err) {
                res.writeHead(500, { 'Content-Type': 'text/plain' });
                res.end('Error loading the form');
            } else {
                res.writeHead(200, { 'Content-Type': 'text/html' });
                res.end(content);
            }
        });
    } else if (req.method === 'POST' && req.url === '/register') {
        // Handle form data
        req.on('data', (body) => {
            const parsedData = parse(body.toString()); // Parse the form data

            // Check if password and confirm password match
            if (parsedData.password !== parsedData.confirmpassword) {
                res.writeHead(400, { 'Content-Type': 'text/plain' });
                res.end('Error: Password and Confirm Password do not match.');
                return;
            }

            // Read existing data or initialize an empty array
            let users = [];
            try {
                const existingData = fs.readFileSync('users.json', 'utf8');
                users = JSON.parse(existingData);
            } catch (err) {
                console.log('Creating new users.json file.');
            }

            // Add the new user and save
            const { confirmpassword, ...userWithoutConfirmPassword } = parsedData; // Exclude confirm password
            users.push(userWithoutConfirmPassword);
            fs.writeFile('users.json', JSON.stringify(users, null, 2), (err) => {
                if (err) {
                    res.writeHead(500, { 'Content-Type': 'text/plain' });
                    res.end('Error saving data');
                } else {
                    res.writeHead(200, { 'Content-Type': 'text/plain' });
                    res.end('Registration successful!');
                }
            });
        });
    } else {
        res.writeHead(404, { 'Content-Type': 'text/plain' });
        res.end('Not Found');
    }
});

// Start the server
server.listen(3000, () => {
    console.log('Server running at http://localhost:3000');
});