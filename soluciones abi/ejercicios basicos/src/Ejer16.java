import java.util.Scanner;

public class Ejer16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        double fak = 1;
        System.out.print("Introduce un numero: ");
        num = sc.nextInt();

        if (num >= 0) {
            for (int i = 1; i <= num; i++) {
            	// System.out.println(num * i);
                fak *= i;
            }
            System.out.println("El factorial de " + num + " es " + fak);
            sc.close();
        } else {
            System.out.println("No existe el factorial");
            sc.close();
        }
    }
}

