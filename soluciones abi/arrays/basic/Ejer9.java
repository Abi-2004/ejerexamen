package basic;

import java.util.Scanner;

public class Ejer9 {
    public static final int FILAS = 8;
    public static final int COL = 8;

    public static void main(String[] args) {

        char[][] table = new char[FILAS][COL];
        Scanner sc = new Scanner(System.in);
        int filao;
        int columnao;
        int filad = 0;
        int columnad = 0;
        
        System.out.println("FICHAS BLANCAS: ");
        table[0] = new char[] { 'T', 'C', 'A', 'R', 'Q', 'A', 'C', 'T' };

        
      for (int i = 1; i < 7; i++) {
            for (int j = 0; j < COL; j++) {
                if (i == 1 || i == 6) {
                    table[i][j] = 'P';
                    
                } 
                
                else {
                    table[i][j] = '.';
                }
            }
        }

        table[7] = new char[] { 'T', 'C', 'A', 'R', 'Q', 'A', 'C', 'T' };


        for (int i = 0; i < FILAS; i++) {

            for (int j = 0; j < COL; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("(:FICHAS NEGRAS ");

        
 
    }
}
