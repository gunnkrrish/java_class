/* var types : primitive  (no further division eg: Number,String,Boolean,null,symbol) 
non primitve: array,objects

Note: in js everything is  an object , array also,function also

*/

for(let i =0;i<=10;i++){
    console.log(i);
}

//variable types:-
//primitive types: number, string, boolean, null, symbol
//non primitive types: object, array


//note:in js everything is an object
//array-object
//function-object

//loop
// for(let i=0;i<10;i++){
//     console.log(i);
// }

//is prime??
let number=13
let flag=true;
for(let div=2;div<number;div++){
    if(number%div==0){
        flag=false;
        break;
    }
}
if(flag==true){
    console.log(number,"Prime");
}
else{
    console.log(number,"Not Prime");
}





//  Set-ExecutionPolicy -Scope Process -ExecutionPolicy Bypass 