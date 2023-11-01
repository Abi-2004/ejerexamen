package funciones;

public class Ejer6 {

	public static void main(String[] args) {
		
		
		int num [] = new int[10];
		int num2 [] = new int[10];
		int num3 [] = new int[10];
		int num4 [] = new int[10];
	      
		System.out.println("\n_____________________________");
		num = llenar(num);
	       mostrar (num);
	       ordernar (num);
	       mostrar (num);
		System.out.println("_____________________________");

		
		
		System.out.println("\n_____________________________");
		num2 = llenar(num2);
	       mostrar (num2);
	       ordernar (num2);
	       mostrar (num2);
		System.out.println("_____________________________");

		
		
		System.out.println("\n_____________________________");
		num3 = llenar(num3);
	       mostrar (num3);
	       ordernar (num3);
	       mostrar (num3);
		System.out.println("_____________________________");

		
		
		
		System.out.println("\n_____________________________");
		num4 = llenar(num4);
	       mostrar (num4);
	       ordernar (num4);
	       mostrar (num4);
		System.out.println("_____________________________");

		
	}

	
	public static int[]  llenar(int num[]) {
        
		for (int i = 0; i < 10; i++) {
            num[i] = (int) (Math.random() * 100 + 1);
        }
        
		return num; 
		
	}
	
	
	public static void mostrar(int num[]) {
        
		
		
		
		
		
        System.out.println("Los números del array son:");
        for (int i = 0; i < 10; i++) {
            System.out.print("["+num[i] + "] ");
            
            if (i == 9) {
            	System.out.println(" ");
            	
            }
		
	}


	
}
	
	   public static void ordernar(int[] num) {
	        int n = num.length;
	        boolean ord;

	        for (int i = 0; i < n - 1; i++) {
	            ord = false;
	            
	            for (int j = 0; j < n - i - 1; j++) {
	                if (num[j] > num[j + 1]) {
	                    int swap = num[j];
	                    num[j] = num[j + 1];
	                    num[j + 1] = swap;
	                    ord = true;
	                }
	            }

	            if (!ord) {
	                break;
	            }
	        }
	    }
		
	
	
	

	
}


