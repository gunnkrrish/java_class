//objects - key value pair
// let chapris = {
//     a:"Deepak kalal",
//     b: "thara bha ig=jogi",
//     c: "ok",
//     d:true

// }
// console.log(chapris.c);

//everything is ijs is object
//everything is classes and objects

// let hostel = 
//     {
//         name: "ok",
//         age: 19,
//         hostelinfo:{
//             name:"ngh",
//             warden: "bali",
//             work: {
//                 degree:"CSE",
//                 favdestinations: "banur" 
//             }
//         }
//     }

//     let obj2 = hostel;
//     hostel.warden = "haha";
//     // obj2.myname = "okieeee";             ye bhi affect kregaaa

// console.log(hostel);
// console.log(obj2);


//spread operator { ... }   //shallow copy
// let hostel = 
//     {
//         name: "ok",
//         age: 19,
//         hostelinfo:{
//             name:"ngh",
//             warden: "bali",
//             work: {
//                 degree:"CSE",
//                 favdestinations: "banur" 
//             }
//         }
//     }
// let arr2 = {...hostel};
// hostel.favdestinations= "iit  jhansla"
// hostel.hostelinfo.favwork = "sman fekna";
// console.log(hostel);
// console.log(arr2);


//deep copy


let hostel = 
    {
        name: "ok",
        age: 19,
        hostelinfo:{
            name:"ngh",
            warden: "bali",
            work: {
                degree:"CSE",
                favdestinations: "banur" 
            }
        }
    }
let obj2 = JSON.parse(JSON.stringify(hostel));
hostel.favdestinations= "iit  jhansla"
hostel.hostelinfo.favwork = "sman fekna";
console.log(hostel);
console.log(obj2);