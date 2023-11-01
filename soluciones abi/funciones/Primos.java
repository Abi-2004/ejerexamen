package funciones;

public class Primos {

    public static void main(String[] args) {
		int num [] = new int[20];
int prim;
int cont = 0;
        
  llenar(num);
  mostrar(num);

     boolean si;
	System.out.println(" ");	
 	System.out.println("Los numeros primos son: ");
for (int i = 0; i < 20; i++) {
	prim = num[i];
	si = Primo(prim);

	if (si) {
		cont++;
		System.out.print(prim+ " ");
	}
	
 }

System.out.println(" ");
System.out.println("Hay "+ cont + " numeros primos");
System.out.println(cont +" pitos que traga tu vieja :v");

	
    }
    
    
    
	public static int[]  llenar(int num[]) {
        
		for (int i = 0; i < 20; i++) {
            num[i] = (int) (Math.random() * 100 + 1);
        }
        
		return num; 
		
	}

	public static boolean Primo(int num) {
	    if (num <= 1) {
	        return false;
	    }
	    
	    for (int x = 2; x * x <= num; x++) {
	        if (num % x == 0) {
	            return false;
	        }
	    }
	    
	    return true;
	}




	public static void mostrar(int num[]) {
        
		
		
		
		
		
        System.out.println("Los números del array son:");
        for (int i = 0; i < 20; i++) {
            System.out.print("["+num[i] + "] ");
            
            if (i == 9) {
            	System.out.println(" ");
            	
            }
		
	}


	
}
}


