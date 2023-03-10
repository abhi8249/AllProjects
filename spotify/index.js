
let b1=document.getElementById("btn1");
let d1=document.getElementById("drop1");
let d2=document.getElementById("drop2");
let d3=document.getElementById("drop3");
let d4=document.getElementById("drop4");
let l1=document.getElementById("l1");
let l2=document.getElementById("l2");
let l3=document.getElementById("l3");
let l4=document.getElementById("l4");
let i1=document.getElementById("i1");
let i2= document.getElementById("i2");
let i3= document.getElementById("i3");
let i4=document.getElementById("i4");
let xb=document.getElementById("xb");
let c=0;
let i=0;
let e=0;
let f=0;
b1.addEventListener('click',()=>{
    c++;
    if(c%2!==0)
    {
    d1.style.display="block";
    l1.style.height="144px";
    i1.classList.remove("fa-arrow-circle-down");
    i1.classList.add("fa-arrow-up");
  
    }
    else{
        
        d1.style.display="none";    
        l1.style.height="40px"; 
     i1.classList.remove("fa-arrow-up"); 
     i1.classList.add("fa-arrow-circle-down");
       
    }
 });
 //btn2
function two(){
    i++;
    if(i%2!==0)
    {
    d2.style.display="block";
    l2.style.height="144px";
    i2.classList.remove("fa-arrow-circle-down");
    i2.classList.add("fa-arrow-up");

    }
    else{
        d2.style.display="none";   
        l2.style.height="40px";   
        i2.classList.remove("fa-arrow-up"); 
        i2.classList.add("fa-arrow-circle-down");
    }
 }
 //btn3
 function three(){
    e++;
    if(e%2!==0)
    {
    d3.style.display="block";
    l3.style.height="144px";
    i3.classList.remove("fa-arrow-circle-down");
    i3.classList.add("fa-arrow-up");
    }
    else{
        d3.style.display="none"; 
        l3.style.height="40px";   
        i3.classList.remove("fa-arrow-up"); 
        i3.classList.add("fa-arrow-circle-down");  
    }
 }
 //btn4
 function four(){
    f++;
    if(f%2!==0)
    {
    d4.style.display="block";
    l4.style.height="144px";
    i4.classList.remove("fa-arrow-circle-down");
    i4.classList.add("fa-arrow-up");
    }
    else{
        d4.style.display="none"; 
        l4.style.height="40px"; 
        i4.classList.remove("fa-arrow-up"); 
        i4.classList.add("fa-arrow-circle-down");    
    }
 }
 //xb
 let act=document.getElementById("act");
 xb.addEventListener('click',()=>{
    act.style.display="none";
 })
 //login
 let login=document.getElementById("login");
 let form= document.getElementById("form");
 login.addEventListener('click',()=>{
    form.style.display="block";
 })
 //lxbtn
 let lxbtn=document.getElementById("lxbtn");
 lxbtn.addEventListener('click',()=>{
form.style.display="none";

 })
//  let loginbtn= document.getElementById("loginbtn");
//  loginbtn.addEventListener('click',()=>{

//    let n = document.getElementById("name").value;
//  let password = document.getElementById("password").value;
//  if(password == 1234)
//  {
//    alert(n);
//  }
//  else{
//    alert("please enter the password correctly");
//  }
// })
//clock
function time()
{
let clock = document.getElementById("clock");
let date = new Date();
let h = date.getHours();
let m = date.getMinutes();
let s= date.getSeconds();
if(h<10)
{
   h="0"+h;
}
if(m<10)
{
   m="0"+m;
}
if(s<10)
{
   s="0"+s;
}
clock.innerHTML="TIME:"+h+":"+m+":"+s;
setInterval(time,1000);
}
time();
//tab
let bar= document.getElementById("bar");
let nav=document.getElementById("nav");
let barc=0;
function myFunction(x) {
   x.classList.toggle("change");
   barc++;
   if(barc%2!=0)
   {
   nav.style.display="block";
   }
   else{
      nav.style.display="none";
   }
 }


