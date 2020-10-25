
package p_generica;

import java.util.ArrayList;
import java.util.Iterator;

public class Generica_2 {

    public static void main(String[] args) {
        /* 
            Usar un iterador, nos permite acceder secuencialmente a los 
            elementos de una coleccion
        
            Interfaz Iterator
        */
        Empleado e1, e2, e3, e4;
        e1 = new Empleado("Alejandro Gonzalez", 20, 500.25);
        e2 = new Empleado("Wilmer Peñaloza", 30, 400.99);
        e3 = new Empleado("Maria Fernanda", 10, 350.05);
        e4 = new Empleado("Alfonso Rincon", 45, 1000.01); 
        
        ArrayList<Empleado> empleadoArray = new ArrayList<>();
        
        empleadoArray.add(e1);
        empleadoArray.add(e2);
        empleadoArray.add(e3);
        empleadoArray.add(e4);
        
        empleadoArray.trimToSize();
        
        /*
        for (Empleado e : empleadoArray) {
            System.out.println(e);
        }
        */
        
        Iterator<Empleado> iterador = empleadoArray.iterator();
        
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}