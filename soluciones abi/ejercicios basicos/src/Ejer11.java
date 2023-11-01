import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {
		
		int num;
		Scanner sc;
		sc=new Scanner(System.in);
		System.out.println("INTRODUCE UN NUMERO: ");
		num=sc.nextInt();
		
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "x" + i + "=" + num * i);
        }
        

		sc.close();
		


	}

}
