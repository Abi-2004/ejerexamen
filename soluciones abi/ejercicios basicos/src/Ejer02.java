import java.util.Scanner;

public class Ejer02 {
	public static void main(String[] args) {
		int base, altura;
		String res;
		float area;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Introduce la base: ");
			base = sc.nextInt();

			System.out.println("Introduce la altura: ");
			altura = sc.nextInt();

			area = ((float) base * altura) / 2;

			System.out.println("El area es: " + area);

			System.out.println("¿Quieres calcular el área de otro triángulo? (s/n): ");
			sc.nextLine(); 
			res = sc.next();
		} while (res.equalsIgnoreCase("s"));
		if(!res.equalsIgnoreCase("S")) {
			System.out.println("Programa finalizado");
		}

	}

}

