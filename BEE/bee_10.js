// let a= 50;

// console.log("value of a = ", a);

// console.log("value of a = " + a);


// // Template Literal

// console.log(`value of a = ${a}`)

// console.log(`value of a = ${500 + 500}`)




//////////////////////////////////////////////////////////////////////////////////
// const express = require("express")
// const app = express();
// let port = 8072

// let users = [];
// /*{
//     username: value,
//     password: value,
//     security key: 

// } */

// // get users
// app.get("/user",(req,res)=>{
//     res.json({
//         message: "List of all users in the database",
//         users
//     })
// } )

// app.post("/user", (req,res)=>{
//     console.log(req.body);
//     let userObj = {};
//     userObj.username = req.body.username,
//     userObj.password = req.body.password,
//     userObj.securityKey = req.body.securityKey

//     users.push(userObj)

//     res.json({
//         message : "user added successfully",
//         users
//     })




// })

// app.listen(port, ()=>{
//     console.log(`server started on port number = ${port}`);

// })


////////////////////////////////////////////////////////////
const express = require("express")
const app = express();
let port = 8076

app.use(express.json());
app.use(express.urlencoded())
let users = [];
/*{
    username: value,
    password: value,
    security key: 

} */

// get users
app.get("/user",(req,res)=>{
    res.json({
        message: "List of all users in the database",
        users
    })
} )

app.post("/user", (req,res)=>{
    console.log(req.body);
    let userObj = {};
    userObj.username = req.body.username,
    userObj.password = req.body.password,
    userObj.securityKey = req.body.securityKey

    users.push(userObj)

    res.json({
        message : "user added successfully",
        users
    })




})

app.delete("/user", (req,res)=>{
    
})

app.listen(port, ()=>{
    console.log(`server started on port number = ${port}`);

})