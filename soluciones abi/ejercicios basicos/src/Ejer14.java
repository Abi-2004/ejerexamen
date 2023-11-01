import java.util.Scanner;

public class Ejer14 {

	public static void main(String[] args) {

		int num;
		int cont = 0;
		Scanner sc;
		sc=new Scanner(System.in);
		System.out.println("INTRODUCE UN NUMERO (>0) : ");
		num=sc.nextInt();
		
	       if (num <= 0) {
	            System.out.println("Numero invalido");
	        	System.exit(1);
	        } else {
	            System.out.println("Multiples de " + num + ":");
	            
	
	            for (int i = 3; i <= num; i += 3) {
	                System.out.print(i + " ");
	                cont++;

	                
	            }
	            System.out.println(" ");
                System.out.println("Hay " + cont + " Multiplos de 3 ");
		
		
	}
	  sc.close();     

}
}
