const express = require('express');
const app = express();
const PORT = 3001;

app.use(express.json());

let books = [];
let nextId = 1;

app.post('/books', (req, res) => {
    const { title, author, price } = req.body;
    if (!title || !author || typeof price !== 'number' || price <= 0) {
        return res.status(400).json({ error: "All fields are required and price must be a positive number" });
    }
    
    const newBook = { id: nextId++, title, author, price };
    books.push(newBook);
    res.status(201).json(newBook);
});

app.get('/books', (req, res) => {
    res.status(200).json(books);
});

app.get('/books/:id', (req, res) => {
    const bookId = parseInt(req.params.id);
    const book = books.find(b => b.id === bookId);
    if (!book) {
        return res.status(404).json({ error: "Book not found" });
    }
    res.status(200).json(book);
});

app.put('/books/:id', (req, res) => {
    const bookId = parseInt(req.params.id);
    const { title, author, price } = req.body;
    
    if (!title || !author || typeof price !== 'number' || price <= 0) {
        return res.status(400).json({ error: "All fields are required and price must be a positive number" });
    }
    
    const bookIndex = books.findIndex(b => b.id === bookId);
    if (bookIndex === -1) {
        return res.status(404).json({ error: "Book not found" });
    }
    
    books[bookIndex] = { id: bookId, title, author, price };
    res.status(200).json(books[bookIndex]);
});

app.delete('/books/:id', (req, res) => {
    const bookId = parseInt(req.params.id);
    const bookIndex = books.findIndex(b => b.id === bookId);
    if (bookIndex === -1) {
        return res.status(404).json({ error: "Book not found" });
    }
    
    books.splice(bookIndex, 1);
    res.status(204).send();
});

app.listen(PORT, () => {
    console.log(`Server is running on http://localhost:${PORT}`);
});