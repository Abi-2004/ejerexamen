
public class Ejer13 {

	public static void main(String[] args) {


		        int num = 100000000; 
		        int cont = 0; 
		        
		        while (num >= 1) {
		            System.out.print(num + " ");
		            num--;
		            
		            cont++;
		            if (cont == 10) {
		                System.out.println();
		                cont = 0; 
		            }
		        }
		    
		


	}

}
