const perguntas = [
    {
        pergunta: "É uma pessoa famosa?",
        subElemento: {
            sim: {
                pergunta: "Essa pessoa é conhecida por esportes?",
                subElemento: {
                    sim: {
                        pergunta: "Ele joga futebol?",
                        subElemento: {
                            sim: "Neymar",
                            nao: {
                                pergunta: "Ele é um piloto?",
                                subElemento: {
                                    sim: "Ayrton Senna",
                                    nao: "Michael Jordan"
                                }
                            }
                        }
                    },
                    nao: {
                        pergunta: "Ela é conhecida por atuação?",
                        subElemento: {
                            sim: {
                                pergunta: "Ela é brasileira?",
                                subElemento: {
                                    sim: "Fernanda Montenegro",
                                    nao: {
                                        pergunta: "Ela fez filmes de ação?",
                                        subElemento: {
                                            sim: "Angelina Jolie",
                                            nao: "Meryl Streep"
                                        }
                                    }
                                }
                            },
                            nao: {
                                pergunta: "Ela é uma cantora?",
                                subElemento: {
                                    sim: "Beyoncé",
                                    nao: "Adele"
                                }
                            }
                        }
                    }
                }
            },
            nao: {
                pergunta: "É um personagem fictício?",
                subElemento: {
                    sim: {
                        pergunta: "É de um desenho animado?",
                        subElemento: {
                            sim: {
                                pergunta: "Ele é de Dragon Ball?",
                                subElemento: {
                                    sim: "Goku",
                                    nao: "Naruto"
                                }
                            },
                            nao: {
                                pergunta: "É um super-herói?",
                                subElemento: {
                                    sim: "Homem-Aranha",
                                    nao: "Sherlock Holmes"
                                }
                            }
                        }
                    },
                    nao: {
                        pergunta: "É um animal?",
                        subElemento: {
                            sim: {
                                pergunta: "É um animal doméstico?",
                                subElemento: {
                                    sim: "Cachorro",
                                    nao: "Leão"
                                }
                            },
                            nao: "Um objeto inanimado"
                        }
                    }
                }
            }
        }
    }
];


const arrayDeRespostasPossiveis = [
    "Neymar", "Ayrton Senna", "Michael Jordan", "Fernanda Montenegro", 
    "Angelina Jolie", "Meryl Streep", "Beyoncé", "Adele", 
    "Goku", "Naruto", "Homem-Aranha", "Sherlock Holmes", 
    "Cachorro", "Leão"
];

//Informa o usuário para pensar sobre as opções válidas
console.log("Pense em uma das opções abaixo para eu tentar adivinhar:");
arrayDeRespostasPossiveis.forEach(resposta => {
    console.log(resposta);
});

const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

// Função recursiva para percorrer a árvore de perguntas
async function fazPergunta(elemento) {
    
    if (typeof elemento === 'string') {
        console.log("A resposta é: " + elemento);
        rl.close();
        return;
    }

   
    let resposta = await new Promise((resolve) => {
        rl.question(`${elemento.pergunta} (1 para SIM, 2 para NÃO)\n`, resolve);
    });

    if (resposta == 1 && elemento.subElemento.sim) {
        fazPergunta(elemento.subElemento.sim); 
    } else if (resposta == 2 && elemento.subElemento.nao) {
        fazPergunta(elemento.subElemento.nao); 
    } else {
        console.log("Resposta inválida. Tente novamente.");
        fazPergunta(elemento); 
    }
}

// Função para iniciar as perguntas
async function iniciarPerguntas(perguntas) {
    for (let pergunta of perguntas) {
        let resposta = await new Promise((resolve) => {
            rl.question(`${pergunta.pergunta} (1 para SIM, 2 para NÃO)\n`, resolve);
        });

        if (resposta == 1) {
            fazPergunta(pergunta.subElemento.sim);
            break;
        } else if (resposta == 2) {
            continue; 
        } else {
            console.log("Resposta inválida. Tente novamente.");
            iniciarPerguntas(perguntas); 
            break;
        }
    }
}

iniciarPerguntas(perguntas);
