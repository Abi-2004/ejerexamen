package funciones;

import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;

        System.out.println("Pon una frase: ");
        frase = sc.nextLine();

        if (palin(frase)) {
            System.out.println("es un palindromo");
        } else {
            System.out.println("no es un palindromo");
        }
    }

    public static boolean palin(String frase) {
   

        int chr1 = 0;
        int chr2 = frase.length() -1 ;

        while (true) {
            if (frase.charAt(chr1) != frase.charAt(chr2)) {
                return false;
                    }
            chr1++;
            chr2--;
            
            if (chr1 <= chr2) {
            	break;
            }
            
        }

        return true;
    }
}

