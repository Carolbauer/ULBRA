let perguntas = [
    {
      identificador: "verificar-consciencia",
      pergunta: "a pessoa está consciente? Tente falar com ela e ver se ela responde.",
      respostas: [
        {
          respostaPossivel: "sim",
          resposta: "O paciente está consciente. Fique com ele e monitore até a chegada do socorro.",
         
        },
        {
          respostaPossivel: "não",
          redireciona: "verificar-respiracao"
        }
      ]
    },
    {
      identificador: "verificar-respiracao",
      pergunta: "a pessoa está respirando? Coloque a mão no peito dela e veja se ela está respirando.",
      respostas: [
        {
          respostaPossivel: "sim",
          resposta: "O paciente está respirando. Fique com ele e monitore até a chegada do socorro.",
          
        },
        {
          respostaPossivel: "não",
          redireciona: "chamar-emergencia-agora-iniciar-rcp"
        },
        {
          respostaPossivel: "não sei",
          redireciona: "chamar-socorro"
        }
      ]
    },
    {
      identificador: "chamar-emergencia-agora-iniciar-rcp",
      pergunta: "Chame o socorro imediatamente (192) e inicie a RCP (compressões torácicas). Você sabe como fazer compressões torácicas?",
      respostas: [
        {
          respostaPossivel: "sim",
          resposta: "Inicie a RCP e monitore até a chegada do socorro.",
          redireciona: "fim"
        },
        {
          respostaPossivel: "não",
          resposta: "Deite a vítima de barriga para cima sobre uma superfície firme. Confira se as vias aéreas estão desobstruídas. Coloque as duas mãos sobre o centro do tórax do indivíduo, deixe os seus braços esticados e os dedos cruzados. Inicie as compressões torácicas, com uma frequência de 100 a 120 compressões por minuto. A cada 30 compressões, faça duas ventilações. Continue a RCP até a chegada do socorro."
        }
      ]
    },
    {
      identificador: "chamar-socorro",
      pergunta: "Chame o socorro agora. Você sabe como fazer a RCP?",
      respostas: [
        {
          respostaPossivel: "sim",
          resposta: "Inicie a RCP e monitore até a chegada do socorro.",
          redireciona: "fim"
        },
        {
          respostaPossivel: "não",
          resposta: "Ligue para o socorro e siga as instruções do operador."
        }
      ]
    },
    {
      identificador: "realizar-compressoes",
      pergunta: "Continue com as compressões até a chegada da ajuda. O paciente voltou a respirar ou se movimentar?",
      respostas: [
        {
          respostaPossivel: "sim",
          resposta: "Pare as compressões e monitore a vítima até a chegada do socorro.",
          redireciona: "fim"
        },
        {
          respostaPossivel: "não",
          redireciona: "continuar-compressoes"
        }
      ]
    }
  ];
  
  const readline = require('readline');
  
  const respostaInterface = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });
  
  async function fazPergunta(pergunta) {
    return new Promise((resolve) => {
      respostaInterface.question(pergunta + " (1 para SIM, 2 para NÃO, 3 para NÃO SEI)\n", (resposta) => {
        resolve(parseInt(resposta) - 1); 
      });
    });
  }
  
  async function processNode(node) {
    let opcoes = "\n";
    for (let i = 0; i < node.respostas.length; i++) {
      opcoes += `${i + 1} - ${node.respostas[i].respostaPossivel}\n`;
    }
    let respostaEscolhida = await fazPergunta(node.pergunta + opcoes);
  

    if (respostaEscolhida < 0 || respostaEscolhida >= node.respostas.length) {
      console.log("Opção inválida. Por favor, escolha uma opção válida.");
      return await processNode(node); 
    }
  
    if (node.respostas[respostaEscolhida].hasOwnProperty('resposta')) {
      console.log(node.respostas[respostaEscolhida].resposta);
    }
  

    if (node.respostas[respostaEscolhida].hasOwnProperty('redireciona')) {
      let identificador = node.respostas[respostaEscolhida].redireciona;
      if (identificador === 'fim') {
        return false; 
      }
      let otherNode = perguntas.find(item => item.identificador === identificador);
      return await processNode(otherNode);
    }
  }
  
  async function iniciarPerguntas(perguntas) {
    await processNode(perguntas[0]);
    respostaInterface.close();
    console.log("Atendimento encerrado.");
  }
  
  iniciarPerguntas(perguntas);
  