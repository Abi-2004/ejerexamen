package basic;

import java.util.Scanner;

public class Ejer10 {
	
    public static final int FILAS = 8;
    public static final int COL = 8;

	public static void main(String[] args) {

        char[][] table = new char[FILAS][COL];
        Scanner sc = new Scanner(System.in);
        int filao;
        int columnao;
        int filad = 0;
        int columnad = 0;
        char vac = '.';
        
        
        
        
        System.out.println("FICHAS BLANCAS: ");
        table[0] = new char[] { 'T', 'C', 'A', 'R', 'Q', 'A', 'C', 'T' };

        System.out.print("  ");
        for (int i = 0; i < COL; i++) {
        	System.out.print(i +" ");
        	
            for (int j = 0; j < COL; j++) {
                
                    
                } 
            
        }
        System.out.println("");
        
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
System.out.print(i +" ");
            for (int j = 0; j < COL; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("(:FICHAS NEGRAS ");
		
        
        
		while(true) {
			
	        System.out.print("Que ficha quieres mover? ");
	        System.out.print("\nFila: ");
	        filao = sc.nextInt();
	        System.out.println("\ncolumna: ");
	        columnao = sc.nextInt();
	       
	        if (table[filao][columnao]==vac) {
	        	System.out.println("La caja esta vacia");
	        	continue;
	        }else {

	        
	        
	        System.out.print("Donde lo quieres poner? ");
	        System.out.print("\nFila: ");
	        filad = sc.nextInt();
	        System.out.print("\ncolumna: ");
	        columnad = sc.nextInt();  
	        
	        

	        table[filad][columnad] = table[filao][columnao];
	        
	        table[filao][columnao] = vac; }
	        
	        
	        System.out.print("  ");
	        for (int i = 0; i < COL; i++) {
	        	System.out.print(i +" ");
	        	
	            for (int j = 0; j < COL; j++) {
	                
	                    
	                } 
	            }
	        
	        System.out.println();
	        for (int i = 0; i < FILAS; i++) {
	        	  System.out.print(i +" ");
	        	
	            for (int j = 0; j < COL; j++) {
	                System.out.print(table[i][j] + " ");
	            }
	          
	            System.out.println(); }
	        
	        
			
			
			
		}
		
		
	}

}
