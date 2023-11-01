package basic;

import java.util.Scanner;

public class Ejer2 {
	public static final int TAM=10;

	public static void main(String[] args) {
		
        int[] num;
        num = new int[10];
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("Introduce 10 numeros por teclado: ");
        for (int i = 0; i <TAM; i++) {

        	System.out.println("Numero "+ (i+1) +":");
            num[i] = sc.nextInt();
        	
        }

        int sum = 0; 
        System.out.println("Los números del array son:");
        for (int i = 0; i < TAM; i++) {
            System.out.print("["+num[i] + "] ");
            
            
            if (num[i] % 2 == 0 && (i % 2 ==0 )) {
                sum += num[i]; 	
            }
        }
        System.out.println(" ");
        System.out.println("___________________________________________________________");
        System.out.println( "La suma de los numeros pares en posicion impar es " + "{"+sum+"}");


	}

}
