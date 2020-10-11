
package universidad;

public abstract class Persona implements Mostrar, Tipo{
   
    private final String nombre;
    private final int cedula;

    public Persona(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    } // fin constructor
    
    @Override
    public void mostrarDatos() {
        System.out.printf("\t%-10s %-10s", this.nombre, this.cedula);
    } // fin mostrarDatos()    
} // fin clase Persona

