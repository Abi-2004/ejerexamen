import java.util.Scanner;

public class Ejer15clase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Introduce un numero: ");
		num = sc.nextInt();
		if (num == 0) {
			System.out.println("Fin del programa");
			return;
		}
		int mayor = num,menor = num;

		while (num!=0) {
			System.out.print("Introduce un numero: ");
			num = sc.nextInt(); 
			if(num>mayor && num !=0) {
				mayor=num;
			}
			if(num<menor && num !=0) {
				menor=num;
			}

		}
		System.out.println("Programa finalizado!!");
		System.out.println("el numero mayor es: " + mayor);
		System.out.println("el numero menor es: " + menor);
	}

}
