public class Main {
    public static void main(String[] args) {
        ArquivoTexto arquivoTexto = new ArquivoTexto("Computação");
        arquivoTexto.abrir();
        arquivoTexto.fechar();
        System.out.println();

        ArquivoImagem arquivoImagem = new ArquivoImagem("Fotos");
        arquivoImagem.abrir();
        arquivoImagem.fechar();
        System.out.println();

        ArquivoAudio arquivoAudio = new ArquivoAudio("Aula1");
        arquivoAudio.abrir();
        arquivoAudio.fechar();
    }
}
