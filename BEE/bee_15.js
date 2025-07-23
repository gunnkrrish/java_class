const express = require('express');
const chalk = require('chalk');
const app = express();
const port = 8080;
app.set('view engine','ejs')

app.listen(port,()=>{
    console.log(chalk.blue(`server is running at localhost: ${port}`));
})

// app.get("/",(req,res)=>{
//     res.send('<div><h1>Welcome to the express server!</h1><ul><li>list 1 item</li> list 2 item<li></li></ul></div>')
// })

// / ejs se hme ese ek line m html likhne ki need ni h


app.get("/",(req,res)=>{
     res.render("1_index.ejs");
    // res.render("1_index");

})

// app.get("/home/:name",(req,res)=>{
//     const name = req.params.name;
//     res.render("1_index",{name:name});

// })