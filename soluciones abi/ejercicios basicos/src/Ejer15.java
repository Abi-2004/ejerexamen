import java.util.Scanner;

public class Ejer15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        boolean prim = true;
        int gran = 0;
        int peq = 0;

        while (true) {
            System.out.print("Introduce un numero: ");
            num = sc.nextInt();

            if (num == 0) {
                break;
            }

            if (prim) {
                gran = num;
                peq = num;
                prim = false;
            } else {
                if (num > gran) {
                    gran = num;
                }
                if (num < peq) {
                    peq = num;
                }
            }
        }

        sc.close();

        if (!prim) {
            System.out.println("El numero mas grande es: " + gran);
            System.out.println("El numero mas pequeño es: " + peq);
        } else {
            System.out.println("No hay numeros.");
        }
    }
}

