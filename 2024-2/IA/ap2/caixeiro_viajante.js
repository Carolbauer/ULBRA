const tamanhoPopulacao = 500;
const mutationRate = 0.01;
const geracoes = 1000;

//coordenadas das cidades
let cidades = [
    [-5,-5],//curitiba
    [-2,-3],
    [3,-3 ],
    [-3,-2],
    [1,0],
    [4,2],
    [5,5],
    [2,4],
    [-5,5]

];

//calculo entre os pontos, distancia entre as cidades
function calculoDistancia(cidadeA, cidadeB){
    let d = Math.sqrt(Math.pow((cidadeB[0] - cidadeA[0]), 2) +  Math.pow((cidadeB[1] - cidadeA[1]),2));
    return d;
}

//função para criar uma rota aleatoria
function criarIndividuo(){
    let individuo = [];
    let listaCidades = JSON.parse(JSON.stringify(cidades));
    for (let i = 0; i < cidades.length; i++) {
       cidadeEscolhida = Math.floor(Math.random() * listaCidades.length);
         individuo.push(listaCidades[cidadeEscolhida]);
         listaCidades.splice(cidadeEscolhida, 1);         
    }

    return individuo;
}

//função para criar um conjunto de elementos
function criarPopulacao(tamanho){
    const populacao = [];
    for (let i = 0; i < tamanho; i++) {
        populacao.push(criarIndividuo());
    }

    return populacao;
}

//função fitness
function aptidao(individuo){
    let distancia = 0.0;
    for (let i = 0; i < individuo.length - 1; i++) {
        let proximoIndice = i + 1;
        if (proximoIndice >= individuo.length) {
            proximoIndice = 0;
        }
        distancia += calculoDistancia(individuo[i], individuo[proximoIndice]);
    }
    return 1000/distancia;
}

let individuos = criarPopulacao(500);

individuos.forEach(individuo => {
    let resultado = aptidao(individuo);
    console.log(resultado);
});

//função para escolher um elemento aleatório
function escolhaAleatoria(lista){
    return lista[Math.floor(Math.random() * lista.length)];
}

//função de seleção
function selecao(populacao) {
    populacao.sort((a, b) => aptidao(b) - aptidao(a));
    return [populacao[0], populacao[1]];
}


//função de cruzamento
function cruzamento(individuo1, individuo2) {
    const inicio = Math.floor(Math.random() * individuo1.length);
    const fim = inicio + Math.floor(Math.random() * (individuo1.length - inicio));
    
    const filho = individuo1.slice(inicio, fim);

    individuo2.forEach(cidade => {
        if (!filho.includes(cidade)) {
            filho.push(cidade);
        }
    });

    return filho;
}


//função de mutação
function mutacao(individuo) {
    if (Math.random() < mutationRate) {
        const indice1 = Math.floor(Math.random() * individuo.length);
        const indice2= Math.floor(Math.random() * individuo.length);
        [individuo[indice1], individuo[indice2]] = [individuo[indice1], individuo[indice2]];
    }
    return individuo;
}

function algoritmoGenetico() {
    let populacao = criarPopulacao(tamanhoPopulacao);

    for (let geracao = 0; geracao < geracoes; geracao++) {
        // Ordena a população pela aptidão para identificar o melhor indivíduo
        populacao.sort((a, b) => aptidao(b) - aptidao(a));
        console.log(`Geração ${geracao + 1}, Melhor aptidão: ${aptidao(populacao[0])}`);
        
        // Verifica se encontrou uma solução ótima (opcional)
        if (aptidao(populacao[0]) >= 1000 / 1.5) { // ajuste a condição conforme necessário
            console.log("Solução encontrada!");
            break;
        }
        
        // Gera uma nova população
        const novaPopulacao = [];
        while (novaPopulacao.length < tamanhoPopulacao) {
            // Seleção
            const [pai, mae] = selecao(populacao);
            // Cruzamento
            let filho = cruzamento(pai, mae);
            // Mutação
            filho = mutacao(filho);
            // Adiciona o filho à nova população
            novaPopulacao.push(filho);
        }

        populacao = novaPopulacao;
    }

    // Exibe a melhor solução encontrada
    populacao.sort((a, b) => aptidao(b) - aptidao(a));
    console.log("Melhor rota encontrada:", populacao[0]);
    console.log("Distância da melhor rota:", 1000 / aptidao(populacao[0]));
}

algoritmoGenetico();
