class Conta{
  double Saldo;
  String numeroConta;

  Conta({required this.Saldo, required this.numeroConta});

}

void main(){
  var conta = Conta(Saldo: 1000.0, numeroConta: '123456');
  print('Saldo: ${conta.Saldo}');
  print('Numero da conta: ${conta.numeroConta}');
}