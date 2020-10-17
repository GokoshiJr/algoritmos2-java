
package excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exceptions_2 {

    public static void main(String[] args) {
        
        // Exepciones Comprobadas
        
        int registros = 0;
        registros = calculoRegistros();
        String palabras[] = new String[registros];
        
        try {
            leoArchivo(palabras);
            for (String palabra : palabras) {
                System.out.println(palabra);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Exceptions_2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static int calculoRegistros() {
        try {
            int registros = 0;
            Scanner leer = new Scanner(new File("src/excepciones/Example.txt"));
            while(leer.hasNext()){
                leer.nextLine();
                registros++;
            }
            leer.close();
            return registros;
        } catch (FileNotFoundException ex) {
            System.out.println("No se consigue el archivo");
            Logger.getLogger(Exceptions_2.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    } // fin calculoRegistros()
    
    public static void leoArchivo(String palabras[]) throws FileNotFoundException {
        Scanner leer = new Scanner(new File("src/excepciones/Example.txt"));
        int registro = 0;
        while(leer.hasNext()) {
            palabras[registro] = leer.next();
            registro++;
        }   
        leer.close();
    } // fin leoArchivo()
} // fin Exceptions_2

