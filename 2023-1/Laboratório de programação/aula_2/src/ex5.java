
public class ex5 {
    /**
     * @param args
     */
    public static void main(String[] args){
        int dia = 15;
        int mes  = 03;
        int ano  = 2023;

        if(ano < 1 || mes <1 || mes > 12 || dia < 1 || dia > 31){
            System.out.println("Data Inválida!");
        }else{
            System.out.println("Data válida!");
        }
        

    }
    
}
