$(document).ready(() => {
    function limpaErros() {
        $("#val-nome").text("")
        $("#val-email").text("")
        $("#val-telefone").text("")
        $("#val-assunto").text("")
    }

    function limpaCampos() {
        $("#nome-input").val("")
        $("#email-input").val("")
        $("#telefone-input").val("")
        $("#assunto-input").val("")
    }

    $('#enviar-form-button').click(function () {
        limpaErros()
        var erros = false

        if ($("#nome-input").val() == "") {
            $("#val-nome").text(" (Campo obrigatório)")
            erros = true
        }

        if ($("#email-input").val() == "") {
            $("#val-email").text(" (Campo obrigatório)")
            erros = true

        }

        if ($("#telefone-input").val() == "") {
            $("#val-telefone").text(" (Campo obrigatório)")
            erros = true
        }

        if ($("#assunto-input").val() == "") {
            $("#val-assunto").text(" (Campo obrigatório)")
            erros = true
        }

        if (!erros) {
            alert("Recebemos seu contato, em breve retornaremos!")
            limpaCampos()
        }
    });

})
