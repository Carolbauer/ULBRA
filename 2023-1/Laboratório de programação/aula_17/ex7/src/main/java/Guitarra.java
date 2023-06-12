public class Guitarra implements Musical{
    @Override
    public void tocar() {
        System.out.println("Tocar Guitarra");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar Guitarra");
    }

    @Override
    public void parar() {
        System.out.println("Parar Guitarra");
    }
}
