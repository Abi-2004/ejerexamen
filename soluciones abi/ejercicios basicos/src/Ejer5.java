import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
        int nota;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Introduce numero 1: ");
        nota = sc.nextInt();
        
        switch (nota) {
        case 0,1,2:
        	System.out.println("MD/ Oso Gutxi");
        	break;
        	
        case 3,4:
        	System.out.println("INS / Gutxi");
        	break;
        	
        case 5:
        	System.out.println("SF / Nahiko");
        	break;
        	
        case 6:
        	System.out.println("BN / Ondo");
        	break;
        	
        case 7,8:
        	System.out.println("NT/ Oso ondo");
        	break;

        case 9,10:
        	System.out.println("SB / Bikain");
        	break;
 
        default:
            System.out.println("Numero invalido");
        }

	}

}
