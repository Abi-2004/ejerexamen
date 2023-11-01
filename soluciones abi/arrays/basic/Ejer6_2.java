package basic;

public class Ejer6_2 {

	public static void main(String[] args) {
        int[] num = new int[15];
        int ult = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 21 - 10);
        }
        
        System.out.println("yo soy yo:");
        for (int i = 0; i < num.length; i++) {

            System.out.print(num[i] + " ");
    }
        ult = num[num.length-1];
        for(int i=14;i>0;i--) {
        	num[i]= num[i-1];
        }
        
        num[0]=ult;
        System.out.println("\n otro numeor");
        for (int i = 0; i < num.length; i++) {

            System.out.print("" +num[i] + " ");
    }
        

	}

}
