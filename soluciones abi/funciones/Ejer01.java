package funciones;

import java.util.Scanner;

public class Ejer01 {


	public static void main(String[] args) {

		String pal;
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nque quieres decir? ");
		pal = sc.nextLine();
		System.out.print("\nCuantas veces? ");
		num = sc.nextInt();
		saludos(num,pal);

	}



	public static void saludos(int num1,String pal2){

		if (num1 <= 0 ){
			System.out.println("Error");
		}
		
		for (int i = 0; i < num1; i++) {
			System.out.println((i+1) + ": "+pal2);
			
			
			try {
                Thread.sleep(300);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
			
		}

	}     


}

