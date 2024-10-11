let perguntas = [
    {
        identificador: "sabe-ligar-pc",
        pergunta: "Você sabe ligar o computador?",
        respostas: [
            {
                respostaPossivel: "Sim",
                redireciona: "verificar-pc-liga"
            },
            {
                respostaPossivel: "Não",
                redireciona: "verificar-cabo-energia"
            },
            {
                respostaPossivel: "não tem certeza ",
                redireciona: "sabe-ligar-pc"
            },
        ]
    },
    {
        identificador: "verificar-pc-liga",
        pergunta: "O computador liga ou da algum sinal que está ligado?",
        respostas: [
            {
                respostaPossivel: "Sim",
                
            },
            {
                respostaPossivel: "Não",
               
            },
            {
                respostaPossivel: "não tem certeza ",
                redireciona: "sabe-ligar-pc"
            },
        ]
    }
];