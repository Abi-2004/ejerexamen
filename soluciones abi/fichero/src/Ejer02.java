import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejer02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner fich = null;
        String ori;
        String des;
        String linea = null;
        String si;

        System.out.println("Pon el origen");
        ori = sc.next();

        try {
            fich = new Scanner(new File(ori));
        } catch (FileNotFoundException e) {
            System.out.println("Fichero origen no existe");
            sc.close();
            return;
        }

        System.out.println("Pon el nombre del destino");
        des = sc.next();

        try {
        	fich = new Scanner(new File(des));
	
                System.out.println("El archivo ya existe. ¿Quieres sobreescribirlo? (s/n)");
                si = sc.next();
                
                if (si.equals("n")) {
                    sc.close();
                    fich.close();
                    return;
                
            }
                System.out.println("Copiado.....");
        } catch (Exception e) {
 
        }

        PrintWriter pw = null;

        try {
            pw = new PrintWriter(des);
            fich = new Scanner(new File(ori));
            while (fich.hasNextLine()) {
                linea = fich.nextLine();
                pw.println(linea);
            }
            pw.close();
            System.out.println("Finalizado");
        } catch (FileNotFoundException e) {
            System.out.println("Fichero destino no existe");
            e.printStackTrace();
        } 
        
    }
}
