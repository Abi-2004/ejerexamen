package basic;

public class Ejer5 {

    public static void main(String[] args) {

        int[] num = new int[40];
        int may = 0;
        int pos = 0;
        int ult = 0;


        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 100 + 1);
        }

        System.out.println("primer array:");
        for (int i = 0; i < num.length; i++) {
            if (i % 20 == 0 && i != 0) {
                System.out.println();
            }
            System.out.print(num[i] + " ");
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] > may) {
              	may = num[i];
              	pos = i;
            
            }
            
            
        }
        
    	

        ult = num[39];
        num[pos] = ult;
        num[39] = may;
        
        
        
        

        System.out.println("\n_____________________");
        System.out.println("\nsegundo array");
        for (int i = 0; i < num.length; i++) {
            if (i % 20 == 0 && i != 0) {
                System.out.println();
            }
            System.out.print(num[i] + " ");
        }
    }
}
