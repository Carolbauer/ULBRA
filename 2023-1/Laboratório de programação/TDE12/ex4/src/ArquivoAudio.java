public class ArquivoAudio extends Arquivo{
    String nome;

    public ArquivoAudio(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo o arquivo" + nome);

    }

    @Override
    public void fechar() {
        System.out.println("Fechando o arquivo" + nome);
    }
}
