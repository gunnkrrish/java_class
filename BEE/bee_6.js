/* req-response cycle also known as client server architecture
response is in the form of obj (it has status code ,type of file and many more)
req is also object

*/

//server
// let http = require('http');     //nodejs pe http app h to usko use krne keliye hmne likha yee

// http.createServer(function (req, res) {
//   res.writeHead(200, {'Content-Type': 'text/plain'}); //status code,content type
//   res.end('Hello World!');
// }).listen(8080);

//run by localhost:8080

// why localhost -> beca all site are hosted on a site to hum usko domain name se bulate h pr hmare pas domain ni h to humne local likha

//node js se server bnana mushkil h (lengthy , complicated ) so we create using express.js
//nodejs m npm package hota h(like playstore) and usko hum require likh ke use krenge
// yha application package.json m ati h or node modules m bhi
// package.json m refrence ajata h ki hmen express ko install kiyah

//and hum isko javascipt file m open kr skte h

//dependicies m version and whatever install ata h

//server

//req and res is also object
// req object se frontend se data bhjte hai wo sab ata h
// res object ke andr  jo ap send krte ho ooski puri info hoti hai
const express = require("express")
const app = express() //framework
app.get('/',(req,res)=>{       //callback function
  res.send("hello")
})
app.get('/testseries',(req,res)=>{       //callback function
  console.log("ok")
  res.send("hello testseries")
})
app.get('/testseriesEnd',(req,res)=>{       //callback function
  res.send("hello  gunn ok started")

  // agr hmne console.log likh diya too vo load hota rhega chrome par
})
app.get("/users",(req,res)=>{

    res.send("ALL users")
  })

app.listen(3000,()=>{
  console.log("server is running")
});

//evertym we need changes we need to restart everytym so we used nodemon(iise baarbaar restart ni krna pdega)

// GET REQUEST
// we always send get request from the searchbar pf browser

// POST REQUEST
// when we send information to the backend we send it through post request

//post can be of two types : through form , axios
//form -> avail ni h -> postman ka use krege or vha pr apka form replicate hoga

//ctrl + c = server close
// start by node<filename>


// '/' iske agge route hoga like localhost:3000/ (to ye route hoga)
// '/' isko home route bolte h or root route


