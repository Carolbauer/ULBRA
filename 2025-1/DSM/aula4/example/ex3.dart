class Pessoa{
  final String nome;
  final int idade;
  final String cpf;

  Pessoa({required this.nome, required this.idade, required this.cpf});
}

void main(){
  var pessoa = Pessoa(nome: 'João', idade: 30, cpf: '123.456.789-00');
  print('Nome: ${pessoa.nome}');
  print('Idade: ${pessoa.idade}');
  print('CPF: ${pessoa.cpf}');
}