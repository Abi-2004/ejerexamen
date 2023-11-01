import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {

        int num1, num2;
        Scanner sc;
        sc = new Scanner(System.in);

        try {
            System.out.println("Introduce numero 1: ");
            num1 = sc.nextInt();

            System.out.println("Introduce Numero 2: ");
            num2 = sc.nextInt();

            if (num1 > num2) {
                System.out.println("Los numero ordenados son: " + num2 + " y " + num1);
            } else if (num1 < num2) {
                System.out.println("Los numero ordenados son: " + num1 + " y " + num2);
            } else if (num1 == num2) {
                System.out.println("Los numeros proporcionados son iguales ( " + num1 + " = " + num2 + " )");
            }
        } catch (Exception ex) {
            System.out.println("Error!! El numero proporcionado no es reconocido. Letras, caracteres y decimales no son reconocidos por el programa");
        }
    }
}
