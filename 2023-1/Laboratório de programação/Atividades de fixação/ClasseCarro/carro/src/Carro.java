/*Crie uma classe chamada "Carro" que representará um carro. Esta classe deve ter:
Três atributos privados: "marca" (String), "modelo" (String) e "ano" (int).
Métodos públicos para obter (get) e definir (set) os valores dos atributos.*/

public class Carro {
    private String marca;
    private  String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
