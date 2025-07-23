const express = require("express");
const app = express();
const port = 8004

app.use(express.json())

let phone = [
    {
        company : "apple",
        model : "iphone 13",
        variant : "256 gb"
    },
    {
        company : "samsung",
        model : "note 9",
        variant : "256 gb"  
    },
    {
        company : "nothing",
        model : "one a",
        variant : "256 gb"
    },
    {
        company : "motorola",
        model : "pg40",
        variant : "120 gb"
    },
    

]
let phone2 =  {samsung:{
    variant: ["256gb","512gb", "1Tb"]
},apple:{
    variant:["10gb", "20gb", "30gb"]
}, motorolla:{
    variant:["70gb", "80gb","90gb"]
}}
app.listen(port, ()=>{
    console.log(`server running on ${port}`)
})

app.get("/searchingphone", (req,res)=>{
  console.log("welcome to phone search")

    console.log(req.query)

    let company = req.query.company;
   
    phone.forEach(ele => {
       if(ele.company == company){
        res.send(ele.variant);
      }
    })
      
    

    res.send("pls enter valid query ")
})