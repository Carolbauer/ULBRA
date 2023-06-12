public class Bateria implements Musical{
    public void tocar() {
        System.out.println("Tocar Bateria");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar Bateria");
    }

    @Override
    public void parar() {
        System.out.println("Parar Bateria");
    }
}
