
package p_generica;

import java.util.ArrayList;

public class Generica_1 {

    public static void main(String[] args) {
        /*
            Uso de la clase ArrayList, para uso de programacion generica
            son diferentes a los arrays normales, ya que los ArrayList son
            arrays dinamicos, no hay que especificarle la cantidad de elementos
            cuando se instancia la clase
        */
        Empleado e1, e2, e3, e4;
        e1 = new Empleado("Julio Gonzalez", 20, 500.25);
        e2 = new Empleado("Andres Peñaloza", 30, 400.99);
        e3 = new Empleado("Maria Fernanda", 10, 350.05);
        e4 = new Empleado("Enrique Rincon", 45, 1000.01); 
        
        /* Permiten almacenar objetos, pero no tipos primitivos */
        /* en los <> indicamos el tipo de objeto a almacenar */
        
        ArrayList<Empleado> empleadoArray = new ArrayList<>();
        
        /* para ahorrar recursos al inicio, si sabemos la cantidad de elementos 
        le indicamos la capacidad */
        // empleadoArray.ensureCapacity(3);
        
        empleadoArray.add(e1);
        empleadoArray.add(e2);
        empleadoArray.add(e3);
        
        /* para ahorrar recursos al final, cuando ya terminamos y 
        sabemos que no va a aumentar el arrayList, para cerrar el 
        ArrayList y que el recolector de basura corte el exceso de memoria */
        
        empleadoArray.trimToSize();
        
        empleadoArray.forEach((e) -> {
            System.out.println(e);
        });
    }
}

