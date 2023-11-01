package funciones;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {

		int num1;
		int num2;

		Scanner sc = new Scanner(System.in);
		System.out.print("\nNumero 1: ");
		num1 = sc.nextInt();
		System.out.print("\nNumero 2: ");
		num2 = sc.nextInt();
		
		
	int res =	suma(num1,num2);
		
		System.out.println("El resultado es: " + res);
		
	}

	
	
	
	public static int suma(int num3,int num4){ 
		int sum;
		sum = num3+num4;
		return sum;
		
	}
	
}
