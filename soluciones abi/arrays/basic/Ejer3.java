package basic;

public class Ejer3 {

    public static void main(String[] args) {

        int[] num = new int[30];

        for (int i = 0; i < 30; i++) {
            num[i] = (int) (Math.random() * 90 + 10);
        }

        int may = 0;
        int men = 100;
        int pos1 = 0;
        int pos2 = 0;

        for (int i = 0; i < 30; i++) {
            if (num[i] > may) {
            	may = num[i];
            	pos1 = (i +1);

            }
            if (num[i] < men) {
            	men = num[i];
            	pos2 = (i+1);
   
         
            }
        }

        for (int i = 0; i < 30; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(num[i] + " ");
        }
        System.out.println();
        System.out.println("Mayor numero: " + may + " En posicion " + pos1);
        System.out.println("Menor numero: " + men + " En posicion " + pos2);
    }
}


