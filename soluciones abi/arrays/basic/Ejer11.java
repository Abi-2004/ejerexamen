package basic;

import java.util.Random;
import java.util.Scanner;

public class Ejer11 {
	
    public static final int FILAS = 10;
    public static final int COL = 8;

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

	       int[][] num = new int[10][8];
	        Random r = new Random();
	        
	        
	        for (int i = 0; i < 10; i++) {
	            for (int x = 0; x < 8; x++) {
	                num[i][x] = r.nextInt(10,50);
	            }
	        }
	        
	        
	        for (int i = 0; i < 10; i++) {

	            System.out.print("{Fila " + (i+1) + ": ");
	            for (int x = 0; x < 8; x++) {
	                System.out.print(num[i][x] + " ");
	            }
	            System.out.println("}");
	           
	            
	            System.out.println(); 
	        
	        }
		
	        int filao;
	        int filad;
	        
	        while(true) {
	        
	        System.out.println("Que fila quieres mover?");
	        filao =  sc.nextInt() -1;
	      
	        
	        System.out.println("A que fila lo quieres mover?");
	        filad = sc.nextInt() -1;
	        
	        if(filao>=10||filad>=10 || filao <0 || filad <0 ) {
	        System.out.println("Error, Los nuemors son Invalidos");
	        
	        }
	        else {
	        int[] swap;
	        swap=num[filad];
	        num[filad]=num[filao];
	        num[filao]=swap;
	        
	        System.out.println("________________________________");
	        
	        for (int i = 0; i < 10; i++) {

	            System.out.print("[Fila " + (i+1) + ": ");
	            for (int x = 0; x < 8; x++) {
	                System.out.print(num[i][x] + " ");
	            }
	            System.out.println("]");
	           
	            
	            System.out.println(); 
	        
	        }
	        }
	        
		
	        }
	        }

}
