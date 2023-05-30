public class Main {
    public static void main(String[] args) {
        //declarando array
        int[] meuArray = new int[5];

        //acessando array
        meuArray[0] = 10;
        meuArray[1] = 11;
        meuArray[2] = 12;
        meuArray[3] = 13;
        meuArray[4] = 14;

        //arrays inicializados
        int[] meuSegundoArray = {15, 16, 17, 18, 19, 20};

        //percorrer arrays
        for (int i = 0; i < meuArray.length; i++){
            System.out.println(meuArray[i]);
        }
    }
}
