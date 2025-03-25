// const express = require('express');
// const fs = require('fs');
// const app = express();
// const PORT = 3001;

// app.use(express.json());

// const DATA_FILE = 'data.json';

// const getContacts = () => {
//     if (!fs.existsSync(DATA_FILE)) return [];
//     return JSON.parse(fs.readFileSync(DATA_FILE));
// };

// const saveContacts = (contacts) => {
//     fs.writeFileSync(DATA_FILE, JSON.stringify(contacts, null, 2));
// };

// app.get('/contacts', (req, res) => {
//     res.json(getContacts());
// });

// app.post('/contacts', (req, res) => {
//     let contacts = getContacts();
//     const { name, phone } = req.body;
//     const id = Date.now().toString();
//     contacts.push({ id, name, phone });
//     contacts.sort((a, b) => a.name.localeCompare(b.name));
//     saveContacts(contacts);
//     res.json({ message: 'Contact added successfully' });
// });

// app.put('/contacts/:id', (req, res) => {
//     let contacts = getContacts();
//     const { id } = req.params;
//     const { name, phone, image } = req.body;
//     contacts = contacts.map(contact => contact.id === id ? { id, name, phone, image } : contact);
//     saveContacts(contacts);
//     res.json({ message: 'Contact updated successfully' });
// });

// app.delete('/contacts/:id', (req, res) => {
//     let contacts = getContacts();
//     contacts = contacts.filter(contact => contact.id !== req.params.id);
//     saveContacts(contacts);
//     res.json({ message: 'Contact deleted successfully' });
// });

// app.get('/contacts/search', (req, res) => {
//     const { name, phone } = req.query;
//     let contacts = getContacts();
//     if (name) contacts = contacts.filter(contact => contact.name.includes(name));
//     if (phone) contacts = contacts.filter(contact => contact.phone.includes(phone));
//     res.json(contacts);
// });

// app.listen(PORT, () => console.log(`Server running on port ${PORT}`));
