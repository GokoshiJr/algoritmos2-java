
package universidad;

public class Estudiante extends Persona {

    private float notas[];
    private static int cantidadAlumno;    
    
    public Estudiante(String nombre, int cedula, float notas[]) {
        super(nombre, cedula);
        this.notas = notas;
        Estudiante.cantidadAlumno++;
    } // fin constructor

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        for (float nota : this.notas) {
           System.out.printf("%8.2f", nota); 
        }
        System.out.printf("%8.2f \n", this.calculo());
    } // fin mostrarDatos()

    @Override
    public float calculo() {
        float total = 0;
        for (float nota : this.notas) {
            total += nota; 
        }        
        return total / this.notas.length;
    } // fin calculo()
        
    @Override
    public int getcantidad() { return cantidadAlumno; }
} // fin clase Estudiante
