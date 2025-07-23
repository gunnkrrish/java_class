//functions : first class citizens , we can return a function, we can pass a function

//anonymous function
// let a = function(){
//     console.log("i am a new function");
// }
// console.log(a());

// you need to run above by node bee_7.js


//IIFI -> immediatelvy invoke function expression
// (function kuchBhi(){
//     console.log("mai");
// })() 

// ARROW FUNCTION  -> use when 1 line st only
// let a = function(v1,v2){
// return v1+v2;
// }

// let a = (v1,v2) => {
// return v1 + v2;
// }

 //let a = (v1,v2) => v1+v2;  //implicit return

//  let a = (v1,v2) =>  return v1+v2 ;  // it will give error as return is implicit
 //let a = (v1,v2) => { return v1+v2 }; 

// console.log(a(20,30));

// function returning a function

function demo(){
    console.log("hello")
    return function(){
        console.log("i am returnd");
        return function(){
            console.log("i am nested");
        }
    }
}
// console.log(demo()) // see output

let rval = demo();
console.log(rval())
let rrval = rval();
// console.log(rrval());
// rrval();  isse undefined ni arhaa

