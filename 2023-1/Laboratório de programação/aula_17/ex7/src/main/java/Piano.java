public class Piano implements Musical{
    public void tocar() {
        System.out.println("Tocar Piano");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar Piano");
    }

    @Override
    public void parar() {
        System.out.println("Parar Piano");
    }
}
