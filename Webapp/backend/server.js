const express = require('express');
const bodyParser = require('body-parser');
const cors = require('cors');

const app = express();
const port = process.env.PORT || 5001;

// Middleware
app.use(cors());
app.use(bodyParser.json());

// Example route
app.get('/', (req, res) => {
    res.send('Hello, World!');
});

// Start server
app.listen(port, () => {
    console.log(`Server is running on port ${port}`);
});
