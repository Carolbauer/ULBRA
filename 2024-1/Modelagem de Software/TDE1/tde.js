class Aluno{
    constructor(nome, matricula, idade, curso){
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.curso = curso;
    }
mostrarInformações(){
    return "Informações do Aluno:"+"Nome: " + this.nome, "Matrícula: " + this.matricula, "Idade: " + this.idade, "Curso: " + this.curso;
}
const aluno1 = new Aluno("Maria", 123, 20, "Engenharia");
const informacoesAluno1 = aluno1.mostrarInformações();
console.log(informacoesAluno1);
}

class Praia{
    constructor(nome, localizacao, temperaturaAgua,tipoAreia){
        this.nome = nome;
        this.localizacao = localizacao;
        this.temperaturaAgua = temperaturaAgua;
        this.tipoAreia = tipoAreia;
        
    }
    mostrarInformaçõesPraia(){
        return "Informações da Praia:"+"Nome: " + this.nome, "Localização: " + this.localizacao, "Temperatura da Água: " + this.temperaturaAgua, "Tipo de Areia: " + this.tipoAreia;

}
const praia1 = new Praia("Praia do Forte", "Bahia", 28, "Branca");
const informacoesPraia1 = praia1.mostrarInformaçõesPraia();
console.log(informacoesPraia1);

}

class Voo{
    constructor(companhiaArea,origem, destino, dataPartida, precoPassagem){
        this.companhiaArea = companhiaArea;
        this.origem = origem;
        this.destino = destino;
        this.dataPartida = dataPartida;
        this.precoPassagem = precoPassagem;
      
    }
informarmacoesVoo(){
    return "Informações do Voo:"+"Companhia Aérea: " + this.companhiaArea, "Origem: " + this.origem, "Destino: " + this.destino, "Data de Partida: " + this.dataPartida, "Preço da Passagem: " + this.precoPassagem;
}
const voo1 = new Voo("Gol", "São Paulo", "Rio de Janeiro", "15/12/2021", 300);
const informacoesVoo1 = voo1.informarmacoesVoo();
console.log(informacoesVoo1);
}