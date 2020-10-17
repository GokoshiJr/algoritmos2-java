
package excepciones;

import java.util.Scanner;

public class Exceptions_1 {

    public static void main(String[] args) {
       
        int array[] = new int[5];
        
        array[0] = 10;
        array[1] = 11;
        array[2] = 12;
        array[3] = 13;
        array[4] = 14;
        
        // Error, Excepcion ArrayIndexOutOfBoundsException
        // array[5] = 20;
        
        for (int i=0; i<array.length; i++) {
            System.out.printf("Posicion:%d = %d \n", i, array[i]);
        }
            
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Indique su nombre: ");
        String nombre = teclado.next();
        
        System.out.print("Indique su edad: ");
        int edad = teclado.nextInt();
        
        System.out.printf("Bienvenido %s de edad %s \n", nombre, edad);
    } // fin main()
} // fin clase Exceptions_1
