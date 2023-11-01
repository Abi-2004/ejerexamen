package funciones;

import java.util.Random;

public class Ejercicio07 {

    public static void main(String[] args) {
        int[][] numeros;
        numeros = new int[6][8];
        // LLENAR Y MOSTRAR EL ARRAY
        numeros = llenar(numeros);
        mostrar(numeros);

        int[] sumaFilas = sumarFilas(numeros);

        int[] sumaColumnas = sumarCols(numeros);

        
        mostrar2(sumaFilas,sumaColumnas);
        
mostrartodo(numeros, sumaFilas, sumaColumnas);
    
    }

  

	public static int[][] llenar(int[][] numeros) {
   
        for (int fila = 0; fila < numeros.length; fila++) {
            for (int col = 0; col < numeros[0].length; col++) {
                numeros[fila][col] =  (int) (Math.random() * 100 + 1);
            }
        }
        return numeros;
    }


    public static void mostrar(int[][] numeros) {
        for (int fila = 0; fila < numeros.length; fila++) {
            System.out.print("FILA " + (fila + 1) + ": ");
            for (int col = 0; col < numeros[0].length; col++) {
                System.out.print(numeros[fila][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static int[] sumarFilas(int[][] numeros) {
        int[] sumaFilas = new int[numeros.length];
        for (int fila = 0; fila < numeros.length; fila++) {
            for (int col = 0; col < numeros[0].length; col++) {
                sumaFilas[fila] += numeros[fila][col];
            }
        }
        return sumaFilas;
    }

    public static int[] sumarCols(int[][] numeros) {
        int[] sumaPorColumnas = new int[numeros[0].length];
        for (int col = 0; col < numeros[0].length; col++) {
            for (int fila = 0; fila < numeros.length; fila++) {
                sumaPorColumnas[col] += numeros[fila][col];
            }
        }
        return sumaPorColumnas;
    }
    
    
    public static void mostrar2(int sumfil[],int sumcol[]) {
    	
        System.out.println("Suma por filas:");
        for (int i = 0; i < sumfil.length; i++) {
            System.out.println("FILA " + (i + 1) + ": " + sumfil[i]);
        }

        System.out.println("Suma por columnas:");
        for (int i = 0; i < sumcol.length; i++) {
            System.out.println("COLUMNA " + (i + 1) + ": " + sumcol[i]);
        }
    	
    	
    }
    
    
    public static void mostrartodo(int[][] numeros,int sumfil[],int sumcol[]) {
    System.out.println(" ");
        for (int fila = 0; fila < numeros.length; fila++) {
            System.out.print("FILA " + (fila + 1) + ": ");
            for (int col = 0; col < numeros[0].length; col++) {
                System.out.print(numeros[fila][col] + " ");
              
               
                
            }
            
            System.out.print(" = " + sumfil[fila] );
            System.out.println();
        }
        System.out.print("Columna:");
        for (int fila = 0; fila < numeros.length; fila++) { 
        	System.out.print(" " + sumcol[fila] );
        	
        }
        System.out.print(" ");
    	
    	
    	
    }
    
}
