import java.util.Scanner;

public class Ejer12 {

    public static void main(String[] args) {
        int num;
        int not;
        int pos = 0;
        float tot = 0;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("INTRODUCE EL NUMERO DE ALUMNOS: ");
        num = sc.nextInt();
       
        if (num < 0) {
        	System.out.println("Numero  no valido");
        	System.exit(1);
        }

        for (int i = 1; i <= num; i++) {
            System.out.println("¿Qué nota tiene el alumno " + i + "?");
            not = sc.nextInt();

            if (not >= 5 && not <= 10) {
                pos++;
                tot += not;
            } else if (not >= 0 && not <= 10 ){
                tot += not;

            }else  {
                System.out.println("Nota inválida. Debe estar entre 0 y 10.");
                i--; 
            }
        }

        System.out.println("Hay " + pos + " alumnos aprobados.");

        if (pos > 0) {
            float med = tot / pos; 
            System.out.println("La nota media de los alumnos aprobados es: " + med);
        } else {
            System.out.println("No hay alumnos aprobados.");
        }
    }
}

