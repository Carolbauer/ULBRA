function calcular() {
    var num1 = parseFloat(document.getElementById('num1').value)
    var num2 = parseFloat(document.getElementById('num2').value)

    var operacao = document.getElementById('operacao').value

    switch (operacao){
        case '+':
            resultado = num1+num2
        break;
        case '-':
            resultado = num1-num2
        break;
        case '*':
            resultado = num1*num2
        break;
        case '/':
            resultado = num1/num2
        break;

       
    }

    document.getElementById('resultado').innerHTML = 'O resultado é ' + resultado
}

function calcularConta(){
    var quantidade = parseFloat(document.getElementById('quantidade').value)
    var valor = parseFloat(document.getElementById("valor").value)
    var conta

    if (quantidade <=100) {
        conta = (quantidade * valor)

    }else if(quantidade > 100 && quantidade <=200){
        conta = (quantidade * valor) * 1.25
    }else{
        conta = (quantidade * valor) * 1.5
    }
    document.getElementById('resultado2').innerHTML = 'O valor da conta é:'+conta
}

function verificaMaior() {
    var numeros = document.getElementById('numeros'). value
    numeros = numeros.split(",")
    var maior = 0

    for(i=0; i< numeros.length; i++){
        var numeroAtual= parseFloat(numeros[i])
        if(maior < numeroAtual)
        maior = numeroAtual
    }
    document.getElementById('maiorNumero').innerHTML = 'O maior número é:' + maior
}
