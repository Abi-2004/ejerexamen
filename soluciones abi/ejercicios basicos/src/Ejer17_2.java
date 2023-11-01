import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Ejer17_2 {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		int op;
		int num;
		int sum = 0;

		while (true) {
			System.out.println("==========[ MENU ]==========");
			System.out.println("|  1. Sumar números pares  |");
			System.out.println("|  2. Sumar números impares|");
			System.out.println("|  3. Sumar todos los nums |");
			System.out.println("|  4. Salir del programa   |");
			System.out.println("============================");
			op = sc.nextInt();

			if (op == 4) {
				System.out.println("Programa finalizado");
				break; 
			} else if (op == 3) {
				while (true) {
					System.out.println("Introduce cualquier número (0) para terminar: ");
					num = sc.nextInt();
					sum += num;

					if (num == 0) {
						System.out.println("La suma de los números es: " + sum);
						sum=0;
						TimeUnit.SECONDS.sleep(4);
						break; 
					}
				}
			} else if (op == 1) {
				while (true) {
					System.out.println("Introduce un número PAR (0) para terminar: ");
					num = sc.nextInt();

					if (num == 0) {
						System.out.println("La suma de los números pares es: " + sum);
						sum=0;
						TimeUnit.SECONDS.sleep(4);
						break; 
					}

					if (num % 2 == 0) {
						sum += num;
					}else if (num % 2 != 0) {
						System.out.println("Numero invalido vuleve a intentarlo.");
					}
				}
			} else if (op == 2) {
				while (true) {
					System.out.println("Introduce un número IMPAR (0) para terminar: ");
					num = sc.nextInt();

					if (num == 0) {
						System.out.println("La suma de los números impares es: " + sum);
						sum=0;
						TimeUnit.SECONDS.sleep(4);
						break; 
					}

					if (num % 2 != 0) {
						sum += num;
					}else if (num % 2 == 0) {
						System.out.println("Numero invalido vuleve a intentarlo.");
					}
				}

			}
		}
	}
}
