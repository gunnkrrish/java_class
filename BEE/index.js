const express = require('express')
const app = express()

const port = 3001

app.get("/",(req,res)=>{
    res.send("hiiee world...")
})
app.get("/about",(req,res)=>{
    res.send("About page")
})
app.listen(port,()=>{
    console.log("server running...")
})

//run by localhost:3001


//to install write npm i nodemon 
// nodemon : isse hme baar baar server start krne ki bjaye direct changes dikhte jayneg ni hme changes krke baar baar server on krna pdega