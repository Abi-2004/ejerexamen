package funciones;

import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int res = 0;
		int res2 = 1000;

		num =  (int) (Math.random() * 1001 + 1);
		System.out.println(num);


		for (int i = 0; i<10; i++) {

	
			System.out.println("[hintento " + (i+1)+ "]" );
			System.out.println("Pon hun numero haber si adibinas:");
			res = sc.nextInt();


			if (res > 1000 || res < 0) {
				i -- ;
				System.out.println("Numero hinvalido");
				System.out.println("Introduce de nuebo");
				continue;
			}


			if (res == num)  {
				System.out.println("Correcto!! Nhumero adibinado");
				return;
			}

			if (res != num && res < num) {

				System.out.println("hIncorrecto el numero propocinado es menor" + "(" + res +"-"+ res2+")");
				res2 = res;
				System.out.println(" ");
				System.out.println("hIntentalo de nuebo");
				
			}
			if (res != num && res > num) {
				
				System.out.println("HIncorrecto el numero propocinado es mayor" + "(" + res2 +"-"+ res + ")");
				res2 = res;
				System.out.println(" ");
				System.out.println("Intentalo de nuevo");
			}



		}

		System.out.println("Lo siento has superado el limite de respuestas, bye");

	}







}
