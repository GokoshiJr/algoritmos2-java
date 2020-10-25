
package p_generica;

import java.io.File;

public class Generica_3 {

    public static void main(String[] args) {
        /*
            Programacion Generica
        
            Consiste en escribir un codigo que podamos reutilizar para objetos 
            de diversos tipos.
        
            Evitamos crear una clase diferente para cada tipo diferente de objeto
            que vamos a manejar, manipular, almacenar
        
            Clase que sirve para manejar objetos en general.
        
            Parametro de tipo < >
        
            Ventajas:
                - Mayor sencillez
                - Reutilizacion el codigo en numerosos escenarios
                - Comprobacion de errores en tiempo de compilacion
        
            Ej creamos nuestra propia clase ArrayList
        */
        
        ArrayList2 archivos = new ArrayList2(5);
        
        archivos.add("Julio");
        archivos.add("Andres");
        archivos.add("Enrique");
        archivos.add("Alfonzo");
        archivos.add(new File("src/p_generica/Empleado.java"));
        
        /* Al no ser generica la clase, nos obliga ha hacer un casting */
        
        String nombre = (String) archivos.get(4);
        
        /*
            archivos.add(new File("src/p_generica/Empleado.java"));
            File nombre = (File) archivos.get(0);
        */
        
        System.out.println(nombre);
    }
}
