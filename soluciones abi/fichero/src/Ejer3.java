import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        Scanner fich = null;
        String arch;
        String pal;
 
        int cont = 0;
        
        System.out.println("Pon el nombre del archivo: ");
        arch = sc.next();

        System.out.println("Pon la palabra que quieres buscar: ");
        pal = sc.next();
        
        
        
        try {
            fich = new Scanner(new File(arch));
        } catch (FileNotFoundException e) {
            System.out.println("Fichero origen no existe");
            sc.close();
            return;
        }
        
		while(fich.hasNext()) {
			
			if(pal.equalsIgnoreCase(fich.next())) {
				cont++;
			}
			
		
			
		}
		
		System.out.println("La palabra *" + pal + "* se meciona " + cont + " veces" );
		
		fich.close();

	}

}
