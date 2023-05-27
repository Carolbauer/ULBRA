public class Main {
    public static void main(String[] args) {
        Livro livro  = new Livro("Harry Potter", 30.99, 250, "J.K.Rowling", 2);
        livro.calcularPreco();
        livro.exibirDetalhes();

        System.out.println("");

        Roupa roupa = new Roupa("Jaqueta", 299.90, "M", true,"Jeans", 3);
        roupa.calcularPreco();
        roupa.exibirDetalhes();

        System.out.println("");

        Eletronicos eletronicos = new Eletronicos("Iphone 12", 7999.00, "Celular", "Apple", 2);
        eletronicos.calcularPreco();
        eletronicos.exibirDetalhes();
    }



}
