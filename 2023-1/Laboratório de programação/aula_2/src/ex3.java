/*Imprima os 15 primeiros números da série de Fibonacci. A série de Fibonacci é tem os
seguintes elementos: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc. Para calculá-la, o primeiro e segundo
elementos valem 1, e daí por diante, o n-ésimo elemento vale o (n-1)-ésimo elemento somado
ao (n-2)-ésimo elemento (ex: 8 = 5 + 3). */
public class ex3 {
    public static void main (String [] args){
        int n1 = 0;
        int n2 = 1;
        int count = 15;
    
        System.out.println(n1 +" " + n2);

        for(int i = 2; i < count; i++){
            int n3 = n1 +n2;
            System.out.println(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
   
    
}
