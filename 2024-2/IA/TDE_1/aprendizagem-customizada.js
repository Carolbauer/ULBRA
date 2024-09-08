class Neuronio {
    constructor(numeroEntradas) {
        this.numeroEntradas = numeroEntradas;
        this.pesos = [];
        for (let i = 0; i < numeroEntradas; i++) {
            this.pesos.push(Math.random());
        }
        this.bias = Math.random();
        this.taxaAprendizagem = 0.1;
    }

    somar(entradas) {
        let somaPonderada = this.bias;
        for (let i = 0; i < this.numeroEntradas; i++) {
            somaPonderada += entradas[i] * this.pesos[i];
        }
        return somaPonderada;
    }

    ativacao(somaPonderada) {
        return somaPonderada < 0 ? 0 : 1;
    }

    processar(entradas) {
        let resultadoSoma = this.somar(entradas);
        return this.ativacao(resultadoSoma);
    }

    ajustar(erro, entradas) {
        for (let i = 0; i < this.numeroEntradas; i++) {
            this.pesos[i] += erro * entradas[i] * this.taxaAprendizagem;
        }
        this.bias += erro * this.taxaAprendizagem;
    }

    treinarRede(arrayTreinamento) {
        let ajustesNecessarios = true;

        while (ajustesNecessarios) {
            ajustesNecessarios = false;

            for (let i = 0; i < arrayTreinamento.length; i++) {
                const entrada = arrayTreinamento[i].entrada;
                const resultadoEsperado = arrayTreinamento[i].resultadoEsperado;
                const resultadoObtido = this.processar(entrada);
                const erro = resultadoEsperado - resultadoObtido;

                if (erro !== 0) {
                    ajustesNecessarios = true;
                    this.ajustar(erro, entrada);
                }
            }
        }
    }
}

const treinamento = [
    { entrada: [0, 0, 0], resultadoEsperado: 0 }, // laranja - Cítrico
    { entrada: [0, 0, 1], resultadoEsperado: 0 }, // abacaxi - Cítrico
    { entrada: [0, 1, 0], resultadoEsperado: 0 }, // morango - Cítrico
    { entrada: [0, 1, 1], resultadoEsperado: 0 }, // kiwi - Cítrico
    { entrada: [1, 0, 0], resultadoEsperado: 1 }, // Mamão - doce
    { entrada: [1, 0, 1], resultadoEsperado: 1 }, // Mamão - doce
    { entrada: [1, 1, 0], resultadoEsperado: 1 }, // Mamão - doce
    { entrada: [1, 1, 1], resultadoEsperado: 1 }  // Mamão - doce
];

neuronio = new Neuronio(3);
neuronio.treinarRede(treinamento);

let resultadoArray = ["Cítrico", "Doce"];

perguntaParaUsuario = true;
while (perguntaParaUsuario) {
    perguntaParaUsuario = false;
    console.log("Informe o código da fruta separado por vírgula: ");
}


