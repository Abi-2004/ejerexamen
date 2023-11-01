import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) { 

		Scanner sc = new Scanner(System.in);
		Scanner fich = null;
		String nom;
		String linea;
		

		System.out.println("Pon el nombre del archivo");
		nom = sc.next();
	
		try {
			fich = new Scanner(new File(nom));
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no existe");
			
		}
		
		while(fich.hasNext()) {
			linea = fich.nextLine();
			System.out.println(linea);
			
		}
		
		fich.close();
	}
	
	
}
