import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;
import java.io.File;

public class ej {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Scanner fich = null;
		String ori;
		String des;
		String linea ;
		String si;
		
		
		System.out.println("Pon el origen");
		ori = sc.next();
	
		try {
			fich = new Scanner(new File(ori));
		} catch (FileNotFoundException e) {
			System.out.println("Fichero origen no existe");
			
		}
		

		
		
		
		
		System.out.println("Pon el nombre del destino");
		des = sc.next();
		
		
		
		try {
			fich = new Scanner(new File(des));
			System.out.println("El archivo ya existe quieres sobreescribirlo?(s/n)");
			si = sc.next();
			
			if(si .equals("n") ) {
				return;
			}
		} catch (FileNotFoundException e) {
			System.out.println("Se va hacer la copia;");
			
		}
		
			PrintWriter pw = null ;

			try {
				pw =  new PrintWriter(des);
			} catch (FileNotFoundException e) {
				System.out.println("Fichero Destino no existe");
				e.printStackTrace();
			}
			
			while(fich.hasNext()) {
				 linea = fich.nextLine();
				pw.println(linea); 		
			}
		fich.close();
		pw.close();
	}

}
