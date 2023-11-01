package basic;

public class Ejer1 {

	public static final int TAM=50;
	
	public static void main(String[] args) {
        int[] num;
        num = new int[50];

   
        for (int i = 0; i <num.length; i++) {
            num[i] = 101 + i; 
        }

     
        System.out.println("Numeros de array:");
        for (int i = 0; i <num.length; i++) {
            System.out.println("Elemento" + i + ":"  + num[i]);
	}

}
}
