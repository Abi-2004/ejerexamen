import java.util.Scanner;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class Ejer3 {

	public static void main(String[] args) {

		int num1, num2, cam;
		Scanner sc;
		sc=new Scanner(System.in);

		System.out.println("Introduce numero 1: ");
		num1 = sc.nextInt();



		System.out.println("Introduce Numero 2: ");
		num2 = sc.nextInt();






		System.out.println("El Numero uno es: " + num1 + " y el numero dos es: " + num2);
		
		cam = num2;
		num2 = num1;
		num1 = cam;

		System.out.println("El Numero uno es: " + num1 + " y el numero dos es: " + num2);




	}

}
