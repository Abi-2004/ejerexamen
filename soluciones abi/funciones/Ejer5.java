package funciones;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
        
       
		//lleno
	       int num [] = new int[20];
	       num = llenar(num);
	       

        //muestro
           mostrar(num);
        
        //comprobar
           int num1,num2;
   		Scanner sc = new Scanner(System.in);
   		System.out.println(" ");
   		System.out.println("Pon un nuemro:");
        num1 = sc.nextInt();
        System.out.println("Pon otro numero: ");
        num2 = sc.nextInt();
        
        boolean res= false;
        res = comprobar( res,num, num1, num2);
        
        System.out.println(res);
        
	}

	  

	public static int[]  llenar(int num[]) {
        
		for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 100 + 1);
        }
        
		return num; 
		
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
	
	
	public static boolean comprobar(boolean res,int num[],int num1,int num2) {
        boolean com1= false;
        boolean com2 = false;
		for (int i = 0; i < num.length; i++) {
         if (num1 == num[i] ) {
        	 com1= true;
        	 
         }if (num2 == num[i]) {
        	 com2 = true;
         }
         
         if (com1 == true && com2 == true) {
        	 res = true;
         }
         
        }
        
		return res; 
		
	}
	
	
}




