
package p_generica;

public class Pareja<T> {
    
    private T primero;
    
    public Pareja() {
        this.primero = null;
    }
    
    /* 
        Metodos Genericos son aquellos que podemos usar y se adaptan
        a cualquier tipo de objeto, no tienen porque estar construidos 
        dentro de clases genericas pueden tambien estar construidos dentro
        de clases normales.
    */
    
    /*
        Tipos comodin <? extends Empleado p>
        puede usar el metodo, la clase Empleado y cualquier subClase
    */
    public static void mostrarTrabajador(Pareja<? extends Empleado> p) {
        Empleado primero = p.getPrimero();
        System.out.println(primero);
    }
    
    public void setPrimero(T primero) {
        this.primero = primero;
    }

    public T getPrimero() {
        return primero;
    }
    
}
