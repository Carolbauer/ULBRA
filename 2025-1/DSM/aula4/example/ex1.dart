class Pessoa {
  String nome;
  int idade;

  Pessoa({required this.nome, required this.idade});

  // Factory constructor para criar uma instância a partir de um JSON
  factory Pessoa.fromJson(Map<String, dynamic> json) {
    return Pessoa(
        nome: json['nome'],
        idade: json['idade']
    );
  }
}

void main() {
  // Criando uma instância manualmente
  var pessoa = Pessoa(nome: 'João', idade: 30);
  print('Nome: ${pessoa.nome}');
  print('Idade: ${pessoa.idade}');

  // Criando uma instância a partir de um JSON
  Map<String, dynamic> json = {'nome': 'Maria', 'idade': 25};
  var pessoaFromJson = Pessoa.fromJson(json);

  print('Nome: ${pessoaFromJson.nome}');
  print('Idade: ${pessoaFromJson.idade}');
}
