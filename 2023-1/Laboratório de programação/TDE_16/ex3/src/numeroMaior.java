public class numeroMaior {
    public static void main(String[] args) {
        int[] valores = {23, 1, 34, 89, 2};
        int i= 0;
        int maior = valores[i];

        for (i = 0; i < valores.length; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
            }
        }
        System.out.println("O valor maior é:" + maior);
    }


}
