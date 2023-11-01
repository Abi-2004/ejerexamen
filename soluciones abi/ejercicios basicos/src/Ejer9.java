import java.util.Scanner;

public class Ejer9 {
    public static void main(String[] args) {
 
int num;
        int posi = 0;
        int nega = 0;
        int cero = 0;
        int veces = 0;

        System.out.println("");
        
		Scanner sc;
		sc=new Scanner(System.in);
		
        while (true) {
    		System.out.println("INTRODUCE UN NUMERO2: ");
    		num=sc.nextInt();
                if (num > 0) {
                    posi++;
                } else if (num < 0) {
                    nega++;
                } else {
                    cero++;
                }
                veces++;
                if (veces == 9) {
                    System.out.println("Numero positivos: " + posi);
                    System.out.println("Numeros negativos: " + nega);
                    System.out.println("ceros " + cero);
                	break;
                }

            } 
        
        }



     
    }

