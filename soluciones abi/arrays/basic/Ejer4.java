package basic;

public class Ejer4 {

    public static void main(String[] args) {

        int[] num = new int[100];
        int[] num2 = new int[50];
        int pos = 0; 

        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 500 + 1);
        }



        for (int i = 0; i < num.length; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(num[i] + " ");

            
            
            if (i % 2 != 0 ) {
                num2[pos] = num[i];
                pos++; 
            }
        }

        System.out.println("\n_________________________________________");
        System.out.println("\n Numeros de las posiciones pares:");

        for (int i = 0; i < num2.length; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(num2[i] + " ");
        }
    }
}

