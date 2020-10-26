
package p_generica;

public class Generica_5 {

    public static void main(String[] args) {
        // Metodos Genericos
        String nombres[] = {"Julio", "Andres", "Enrique"};
        String elementos = Matrices.getElementos(nombres);
        System.out.println(elementos);
        
        Empleado listaEmpleados[] = {
            new Empleado("Julio", 20, 500),
            new Empleado("Julio", 20, 500),
            new Empleado("Julio", 20, 500),
            new Empleado("Julio", 20, 500),
            new Empleado("Julio", 20, 500)
        };
        System.out.println(Matrices.getElementos(listaEmpleados));
        
//        System.out.println(Matrices.getMinimo(listaEmpleados)); ERROR
        System.out.println(Matrices.getMinimo(nombres));
    }
    
}

class Matrices{
    // Sintaxis de los metodos genericos
    public static <T> String getElementos(T array[]) {
        return "El array tiene " + array.length + " elementos.";
    }
    
    /*
        CompareTo pertenece a la interfaz Comparable
    
        Para usar el metodo compareTo, el metodo nuestro debe extender esa interfaz
    
        eso nos obliga a que todos los objetos que le pasemos por parametro, sean objetos 
        que implementen la interfaz comparable
    
        Las clases que nosotros creamos por defecto no implementan esa interfaz,
        ej la clase Empleado
    
        En cambio las clases String, Date, GCalendar si, y podemos usar el metodo generico
    */
    public static <T extends Comparable> T getMinimo(T array[]) {
        if (array == null || array.length == 0) {
            return null;
        } else {
            T minimo = array[0];
            for (int i=1; i<array.length; i++) {
                if (minimo.compareTo(array[i]) > 0) {
                    minimo = array[i];
                }
            }
            return minimo;
        }
        
    }
}
