let num = document.getElementById("num");
let sum = document.getElementById("sum");
let sub = document.getElementById("sub");
let reset = document.getElementById("reset");

sum.addEventListener("click", () => {
    num.textContent = Number(num.textContent) + 1;
})

sub.addEventListener("click", () => {
    if (Number(num.textContent) != 0) {
        num.textContent = Number(num.textContent) - 1;
    }
})

reset.addEventListener("click", () => {
    num.textContent = 0;
})