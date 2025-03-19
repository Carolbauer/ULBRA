abstract class Pessoa{
  void falar();
  void caminhar();
}

class Estudante implements Pessoa{
  @override
  void caminhar() {
    print('Estudante caminhando');
  }

  @override
  void falar() {
    print('Estudante falando');
  }
}

void main(){
  var estudante = Estudante();
  estudante.falar();
  estudante.caminhar();
}