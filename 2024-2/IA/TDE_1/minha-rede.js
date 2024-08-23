let x11 = 0, x12 = 0, result1 = 0;
let x21 = 0, x22 = 1, result2 = 0;
let x31 = 1, x32 = 0, result3 = 1;
let x41 = 1, x42 = 1, result4 = 1;

let p1 = -1, p2 = -1;

let soma, ajustes, quantidadedeAjustesTotais = 0;

do {
    ajustes = 0;

    soma = somar(x11, x12);
    y = transferencia(soma);

    if (y != result1) {
        ajustar(x11, x12, result1, y);
        ajustes++;
        quantidadedeAjustesTotais++;
    }

    soma = somar(x21, x22);
    y = transferencia(soma);

    if (y != result2) {
        ajustar(x21, x22, result2, y);
        ajustes++;
        quantidadedeAjustesTotais++;
    }

    soma = somar(x31, x32);
    y = transferencia(soma);

    if (y != result3) {
        ajustar(x31, x32, result3, y);
        ajustes++;
        quantidadedeAjustesTotais++;
    }

    soma = somar(x41, x42);
    y = transferencia(soma);

    if (y != result4) {
        ajustar(x41, x42, result4, y);
        ajustes++;
        quantidadedeAjustesTotais++;
    }

} while (ajustes != 0);

console.log("Teste de aprendizagem com rede neural\n");
console.log("\nPeso 1: " + p1);
console.log("\nPeso 2: " + p2);
console.log("\nForam necessários " + quantidadedeAjustesTotais + " ajustes para treinar a rede");

function somar(x1, x2) {
    return (x1 * p1) + (x2 * p2);
}

function transferencia(soma) {
    if (soma <= 0) {
        return 0;
    }
    return 1;
}

function ajustar(entrada1, entrada2, resultadoEsperado, resultadoObtido) {
    p1 = p1 + 1 * (resultadoEsperado - resultadoObtido) * entrada1;
    p2 = p2 + 1 * (resultadoEsperado - resultadoObtido) * entrada2;
}
