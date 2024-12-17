const fs = require("fs");

//for creating a new file(txt)
//fs.writeFileSync("./test.txt","hey there gunn");


//creating file asynchronously
//fs.writeFile("./testAsync.txt","hey there async file", (err) => {});


//for reading data from other file
// const result = fs.readFileSync("./BEE/Name.txt","utf-8")
// console.log(result);


//for reading file data async
// fs.readFile("./BEE/Name.txt","utf-8",(err,result)=>{
//     if(err){
//         console.log("error",err);
//     }
//     else{
//         console.log(result);
//     }
// });


//for appending data in a file
//fs.appendFileSync("./BEE/Name.txt",new Date().getDate().toLocaleString());
//fs.appendFileSync("./BEE/Name.txt","Hey\n");



//if you want to make copy of the file (it will also create file)
//fs.cpSync("./BEE/Name.txt","test.txt");


//delete a file
//fs.unlinkSync("testAsync.txt");


//to see a file in stats
//console.log(fs.statSync("./BEE/Name.txt"));