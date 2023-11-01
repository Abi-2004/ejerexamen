package funciones;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;

		while (true) { 

			System.out.print("Ingresa la base: ");
			num1 = sc.nextInt();

			System.out.print("Ingresa el exponente: ");
			num2 = sc.nextInt();

			double res = pot(num1,num2);
			
	        if (res > 7.257415615307994E306) {
	        	System.out.println("Potencia incalculable pon otro numero porfavor");
	        	continue;
	        }

			System.out.println("El resultado de potencia ("+ num1 + "^" + num2 +") es: " + res);

			String resp = null;
			System.out.println("quieres calcular otro numero? (S/N)");
			resp = sc.next();
			if (resp.equals("s") || resp.equals("S")) {
				continue;
			}else {
				System.out.println("Saliendo del programa....");
				break;
			} 

		}

	}




	public static double pot(double num1, int num2) {


		double res =1;

		if (num2 <0) {
			num2*=(-1) ;
			for (int i = 1; i <= num2; i++) {
				res *= num1   ;  

			}
			res = (1 / res);
		}else {
			for (int i = 1; i <= num2; i++) {
				res *= num1   ;  

			}

		}

		return res; 


	} 


}
