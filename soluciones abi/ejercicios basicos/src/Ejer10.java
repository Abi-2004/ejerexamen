import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {

		int num,veces = 0;
		String pal;
		Scanner sc;
		sc=new Scanner(System.in);


		while (true) { 
			System.out.println("INTRODUCE UN NUMERO Postivo: ");
			num=sc.nextInt();
			veces++;
			if (num > 0) {
				System.out.println("INTRODUCE Una palabra: ");
				sc.nextLine();
				pal=sc.nextLine();
		        for (int i = 0; i < num; i++) {
		            System.out.println(pal);
		        }
				break;

			}
		}

	}

}
