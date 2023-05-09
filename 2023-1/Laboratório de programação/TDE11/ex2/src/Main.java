public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        veiculo.marca = "renault";
        veiculo.modelo = "Sandero";

        Carro carro = new Carro();
        carro.marca = "Citroen";
        carro.modelo = " C3";
        carro.numPassageiros = 2;

        System.out.println("Marca:" + veiculo.marca + " " + "Modelo: " + veiculo.modelo );
        System.out.println("Marca:" + carro.marca + " " + "Modelo: " + carro.modelo + " " + "Numero de Passageiros:" + carro.numPassageiros );
    }
}
