// for(let i = 10; i >= 0; i--){

//     document.write(`${i} </br>`)
// }

// let valor_1 = Number(prompt("Primeiro valor: "));
// let valor_2 = Number(prompt("Segundo valor: "));
// let resultado = 0;

// for(let i = valor_2; i >= 1; i--){
//     resultado += valor_1;
// }

// console.log(resultado);

let valor_1 = Number(prompt("Primeiro valor: "));
let valor_2 = Number(prompt("Segundo valor: "));
let vezes = 0;
let contador = 0;

for(let i = 0; vezes <= valor_1; i++){
    vezes += valor_2;
    contador = i;
}

console.log(contador);
