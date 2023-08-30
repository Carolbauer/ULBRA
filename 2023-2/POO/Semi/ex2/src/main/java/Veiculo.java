public class Veiculo {
    private final String marca;
    private final String modelo;
    private final int ano;

    public Veiculo(final String marca, final String modelo, final int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void ligar() {
        System.out.println("Ligando veículo"+ " "+ this.marca +" "+ this.modelo +" "+ this.ano);

    }

    public void desligar() {
        System.out.println("Desligando veículo" +" "+ this.marca +" "+ this.modelo +" "+ this.ano);
    }
}
