package funciones;

import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        
        
        while (num >= 0) {
        System.out.print("Ingresa un numero: ");
        num = sc.nextInt();
        if (num < 0) {
        	System.out.println("Saliendo del programa");
        	break;
        }
        
        double res = fak(num);
        
        if (res > 7.257415615307994E306) {
        	System.out.println("Factorial incalculable pon otro numero porfavor");
        	continue;
        }
        
        
        System.out.println("El factorial de " + num + " es " + res);
      
        System.out.println("Calcula otro factorial o pon un numero negativo para salir");
        
        
    
        }
        
        }

    public static double fak(int num2) {
        double fac = 1; 

        for (int i = 1; i <= num2; i++) {
            fac *= i; 
            
        }

        return fac; 
    }
}
