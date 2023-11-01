import java.util.Scanner;

public class Ejer17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int op;
		int num;
		int sum = 0;

		while(true) {

			System.out.println("1. Sumar pares");
			System.out.println("2. Sumar impares");
			System.out.println("3. Sumar todos");
			System.out.println("4. fin del  programa");
			op = sc.nextInt();
			if (op == 4) {
				System.out.println("Programa finalizado");
				break;
			}
			else if(op==1 || op==2 || op==3) {
				while(true) {
					System.out.println("introduce un numero (0) para terminar: ");
					num = sc.nextInt();
					sum += num; 

					if (num==0) {
						System.out.println("La suma de los numeros es: "+ sum);
						return;

					}
					
					
					


				}
			} else {
				System.out.println("Numero incorrecto vuelve a intertarlo");
			}



		}



	}

}
