
package universidad;

public class Profesor extends Persona {

    private String asignatura;
    private int horas;
    private int tipoDedicacion;
    private static int contador;
    
    public Profesor(String nombre, int cedula, String asignatura, int horas, int tipoDedicacion) {
        super(nombre, cedula);
        this.asignatura = asignatura;
        this.horas = horas;
        this.tipoDedicacion = tipoDedicacion;
        contador++;
    } // fin constructor

    @Override
    public float calculo() {
        if (this.tipoDedicacion == 1) {
           return this.horas * Persona.CONTRATADO; 
        } else {
           return this.horas * Persona.FIJO;
        }
    } // fin calculo()

    @Override
    public void mostrarDatos() {
        System.out.println("\n\t_____Docente_____");
        System.out.printf("\tNombre     Cedula %13s %10s \n", "Materia", "Salario");
        super.mostrarDatos();         
        System.out.printf("%10s %10.2f \n", this.asignatura, this.calculo());
    } // fin mostrarDatos()
        
    @Override
    public int getcantidad() { return contador; }
} // fin clase Profesor
