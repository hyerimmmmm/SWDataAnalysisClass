let ipt = document.getElementById("ipt");
let btn1 = document.getElementById("btn1");
let btn2 = document.getElementById("btn2");
let output = document.getElementById("output");
let title = document.getElementById("title")

let data = "";


btn1.addEventListener("click", () => {
    data = Number(ipt.value);
    ipt.value = "";
    title.textContent = "for 문을 이용한 구구단"
    for(let i = 1; i <= 9; i++) {
        output.innerHTML += `<p>${data} X ${i} = ${data * i}</p>`;
    }    
})

btn2.addEventListener("click", () => {
    data = Number(ipt.value);
    ipt.value = "";
    title.textContent = "while 문을 이용한 구구단"
    let i = 1;
    while(i <= 9) {
        output.innerHTML += `<p>${data} X ${i} = ${data * i}</p>`;
        i++;
    }  
})
