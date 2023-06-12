public class Usuario implements Persistente{
    @Override
    public void salvar() {
        System.out.println("Salvando usuário");
    }

    @Override
    public void buscar() {
        System.out.println("buscando usuário");

    }

    @Override
    public void atualizar() {
        System.out.println("Atualizando usuário");
    }

    @Override
    public void deletar() {
        System.out.println("Deletando usuário");
    }
}
