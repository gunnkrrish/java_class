/* browser se req kei server se response aya 
or jo inke bich m hota h usko hum middleware kehte h
unlimited middleware can be used
*/

const express = require("express")
const app = express();

// app.use(express.json())
app.use(express.urlencoded())

let users = [];

app.get("/user",(req,res)=>{
    res.send(users);
})
app.post("/user",(req,res)=>{
console.log(req.body);
// res.send("info recieved")
res.json({
    status: "received",
    info: req.body
})
})
//pehle hmesha middleware chlega
app.use(function(req,res,next){
    console.log("i am middleware 1");
    next();         // iske bina localhost chl hi ni rhaa kyuki hmne koi demand ni kri
})

app.use(function(req,res,next){
    console.log("i am middleware 2");
    next();         
})

app.get("/",(req,res)=>{
    res.send("hello world");
})

app.listen(8080,()=>{
    console.log("listening to port 8080");
})