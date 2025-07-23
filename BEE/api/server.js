const express = require('express');
const chalk = require('chalk');
const app = express();
const ejs = require('ejs');
const path = require('path');

app.set('view engine','ejs')

app.set("view",path.join(__dirname,"views"));

app.get("/home",(req,res)=>{
    const name = req.params.name;
    res.render("1_index",{name:name});

})

module.exports = app;