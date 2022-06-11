/*Leia um valor e imprima os resultados: “É maior que 10” ou “Não é maior que 10” ou ainda “É igual a 10”*/
alert("Parte 1");
var valor=prompt("Digite um valor qualquer:");
var valor = parseInt(valor);

if (valor >10){
    alert(valor + "é maior que 10");
}else if(valor < 10){
    alert(valor +"é menor que 10");
}else{
    alert(valor +"é igual à 10");
}

/*Some dois valores lidos e imprima o resultado*/
alert ("Parte 2");
var num1 = prompt("Primeiro valor:");
var num2 = prompt("segundo valor:");

num1 = parseInt(num1);
num2 = parseInt(num2);

alert (num1+num2);

/*Leia 2 valores e a operação a ser realizada (+, -, * ou /) e imprima o resultado (use um switch)*/
alert ("Parte 3");
var num1 = parseInt(prompt("Digite o primeiro numero:"));
var num2 = parseInt(prompt("Digite o segundo numero:"));
var operacao = prompt("Digite a operação a ser realizada(+,_,*,/):");

switch(operacao){
    case '+':
        alert = (num1+num2);
        break;
        case'-':
        alert =(num1-num2);
        break;
        case '*':
        alert (num1 * num2);
        break;
        case '/':
        alert (num1 / num2);
        break;
        default:
        alert ("ERRO! OPERAÇÃO INVALIDA");
        break;
}

    /*Leia um nome e um valor n e imprima o nome n vezes usando o laço for*/
    alert ("Parte 4");
    var nome = prompt("Nome:");
    var n = prompt ("numero de vezes para repetir:");
    n= parseInt(n);

    for (var i = 1; i <= n; i++){
        alert(nome);
    }

    /*Leia um nome, endereço e e-mail, armazene em um array, depois imprima na tela*/
    alert ("Parte 5 com array");
    var variavel = [];

    variavel[0]=prompt("Digite seu nome:");
    variavel[1]=prompt("Digite seu endereço:");
    variavel[2]=prompt("Digite seu email:");
    
    alert (variavel[0]);
    alert (variavel[1]);
    alert (variavel[2]);

    alert ("Parte 5.1 com objeto");

    var a =prompt("Digite seu nome:");
    var b =prompt("Digite seu endereço:");
    var c =prompt("Digite seu email:");

    var objeto = {nome:a, endereco:b, email:c}

    alert (objeto.nome);
    alert (objeto.endereco);
    alert (objeto.email);

