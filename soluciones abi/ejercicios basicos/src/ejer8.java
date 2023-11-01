import java.util.Scanner;

public class ejer8 {

	public static void main(String[] args) {
		int numero,x;
		Scanner sc;
		sc=new Scanner(System.in);
		System.out.println("INTRODUCE UN NUMERO ");
		numero=sc.nextInt();
	 for (x=1; x<=numero;x++) {
		 if (x %2 == 0) {
			 System.out.print(x + " ");
		 }
		
	 }

	}

}
