let btn1 = document.getElementById("btn1");
let btn2 = document.getElementById("btn2");

let box1 = document.getElementById("box1");
let box2 = document.getElementById("box2");
let box3 = document.getElementById("box3");
let box4 = document.getElementById("box4");

btn1.addEventListener("click", () => {
    box2.className = "margin1"
    box3.className = "margin2"
    box4.className = "margin3"
})

btn2.addEventListener("click", () => {
    $("div").css('border-radius', '0 50% 0 50%')
})