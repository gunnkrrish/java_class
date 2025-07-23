const express = require("express")
const app = express()

const port = 8080

app.use(express.json());
app.listen(port,()=>{
    console.log(`server is listenening at port = ${port}`)

})

let users = [
    {
        id:1,
        name: "namebtado1",
        age:1000,
        moto:"cse"
    },
    {
        id:2,
        name:"namebtado2",
        age:2000,
        moto:"ece"
    },
    {
        id:3,
        name:"namebtado3",
        age:3000,
        moto:"it"
    },
     {
        id:4,
        name:"namebtado4",
        age:4000,
        moto:"iit"
    }
]

app.patch("/user",(req,res)=>{
    // req.body se info ayegi
    // id-> jiska name updtae krna h  , name -> updtaed name

    users.forEach(user => {
        if(user.id == req.body.id){
            user.name = req.body.name
        }
    });

    res.json({
        message : "user updated with the info",
        users
    })
})

app.get("/user/:id",(req,res)=>{
    //req.params

    let id = parseInt(req.params.id)

    // const userinfo = users.filter(user => user.name == req.params.name)
    const userinfo = users.filter(user => user.id == id)


    res.json({
        message: "user information",
        userinfo
    })
})