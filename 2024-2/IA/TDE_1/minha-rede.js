let x11 = 0, x12 = 0, result1 = 0;
let x21 = 0, x22 = 1, result2 = 0;
let x31 = 1, x32 = 0, result3 = 1;
let x41 = 1, x42 = 1, result4 = 1;

let p1 = -1, p2 = -1;

let soma, ajustes = 0, quantidadedeAjustesTotais = 0, repeticoes = 0;

do {
    ajustes = 0;
    verificaSeNeccessitaAjuste(x11, x12,result1);
    verificaSeNeccessitaAjuste(x21, x22,result2);
    verificaSeNeccessitaAjuste(x31, x32,result3);
    verificaSeNeccessitaAjuste(x41, x42,result4);
} while (ajustes != 0);

console.log("Teste de aprendizagem com rede neural\n");
console.log("\nPeso 1: " + p1);
console.log("\nPeso 2: " + p2);
console.log("\nForam necessários " + quantidadedeAjustesTotais + " ajustes para treinar a rede");

function somar(x1, x2) {
    return (x1 * p1) + (x2 * p2);
}

function transferencia(soma) {
    if (soma < 0) {
        return 0;
    }if (soma >1) {
        return 1;
    }
    return soma;
}

function ajustar(entrada1, entrada2, resultadoEsperado, resultadoObtido) {
    p1 = p1 + 1 * (resultadoEsperado - resultadoObtido) * entrada1;
    p2 = p2 + 1 * (resultadoEsperado - resultadoObtido) * entrada2;
}

function verificaSeNeccessitaAjuste(x1,x2,resultadoEsperado){
    soma = somar(x1, x2);
   resultadoObtido = transferencia(soma);
    if (resultadoObtido != resultadoEsperado) {
        ajustar(x1, x2, resultadoEsperado, resultadoObtido);
        ajustes++;
        quantidadedeAjustesTotais++;
    }
}