package basic;

public class Ejer6 {

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

        
        ult = num[14]; 
        int swap;

        System.out.println("\nRotativo:");
        for (int i = 0; i < num.length; i++) {
            swap = num[i];
            num[i] = ult;
            ult = swap;
            System.out.print(num[i] + " ");
        }
    }
}


