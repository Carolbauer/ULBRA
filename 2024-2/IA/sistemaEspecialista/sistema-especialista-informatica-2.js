let perguntas = [
    {
        identificador: "verificar-pc-liga",
        pergunta: "O computador liga ou da algum sinal que está ligado?",
        respostas: [
            {
                respostaPossivel: "Sim",
                redireciona: "liga-ou-da-tela-azul"
            },
            {
                respostaPossivel: "Não",
                
            },
            {
                respostaPossivel: "não sabe/Não tem certeza ",
                redireciona: "sabe-ligar-pc"
            },
        ]
    },
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
                redireciona: "Precisa ser uma pessoa com mais conhecimento para realizar o teste"
            },
        ]
    }
]