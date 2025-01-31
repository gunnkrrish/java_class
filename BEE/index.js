const express = require('express')
const app = express()
app.use(express.json()); //this is a middleware between request and response
const port = 3001

app.get("/",(req,res)=>{
    res.send("hii world...")
})
app.get("/about",(req,res)=>{
    res.send("About page")
})

const users =[]
app.post("/register_user",(req,res)=>{

    //to uniquely identify
    let user_id ;
    if(users.length==0){
        user_id=1;
    }
    else{
        user_id = users[users.length-1].id + 1;
    }
})

app.listen(port,()=>{
    console.log("server running...")
})



//run by localhost:3001


//to install write npm i nodemon 
// nodemon : isse hme baar baar server start krne ki bjaye direct changes dikhte jayneg ni hme changes krke baar baar server on krna pdega
//nodemon ke bad run hoga npm start

// json m keys m inverted comma hote h 
// pr js object m inverted nhi hote
// json and javascript object are not same
// in json key data type is string 
// but in java it is not string 
// to convert javascript code in json we use json.stringify
//  to convert json to javascript object we use json.parse

// CRUD (create,read,update , delete)
/* request methods: 
Get (not secure) : isme sari values url m ajegi
post (secure) : isme nhi ati
put : updateion
patch : updateion
delete :  delete

STATUS CODE : 
1** : info
2** : success
3** : redirectional
4** : client side error
5** : server error

*/