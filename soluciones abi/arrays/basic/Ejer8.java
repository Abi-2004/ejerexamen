package basic;

import java.util.Random;

public class Ejer8 {

    public static void main(String[] args) {
        int[][] num = new int[10][5];
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            for (int x = 0; x < 5; x++) {
                num[i][x] = r.nextInt(10,31);
            }
        }

        for (int i = 0; i < 10; i++) {

            System.out.print("{Fila " + (i+1) + ": ");
            for (int x = 0; x < 5; x++) {
                System.out.print(num[i][x] + " ");
            }
            System.out.println("}");
           
            
            System.out.println(); 
        
        }
        
        
        System.out.println("[Columnas]");
        System.out.println("");
       
        
        for (int i = 0; i < 5; i++) {
System.out.print("[Columna "+ (i+1) +": ");
            for (int x = 0; x < 10; x++) {
                System.out.print(num[x][i] + " ");
            }
            System.out.println("]");
           
            
            System.out.println(); 
        
        }
        
    }
}
