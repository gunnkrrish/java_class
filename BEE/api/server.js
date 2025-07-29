const express = require("express");
const path = require("path");
const app = express();
const port = 8008;

// Tell Express where to find the views folder
app.set("views", path.join(__dirname, "../views"));
app.set("view engine", "ejs");

// Serve static files
app.use(express.static(path.join(__dirname, "../public")));

app.get("/", (req, res) => {
    res.render("home");
});

app.listen(port, () => {
    console.log(`Server is running on port ${port}`);
});

module.exports = app;



//git koi empty folder ka track ni rkhta(and u want ki dikahye to .gitkeep ka use krna pdega) ni use extesnion auto gitkeep