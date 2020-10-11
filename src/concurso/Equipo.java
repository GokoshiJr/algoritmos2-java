package concurso;

public class Equipo {
    
    private final String nombre;
    private final Tiempo tiempos[];
    private int pruebasSuperadas = 0;
    private int tiempoFinalMinutos = 0;

    public Equipo(String nombre, Tiempo tiempos[]) {
        this.nombre = nombre;
        this.tiempos = tiempos;
        this.actualizar();
    } // constructor
    
    private void actualizar() {
        for (int i = 0; i < this.tiempos.length; i++) {
            if (this.tiempos[i].getTotalMinutos() > 0) {
                this.pruebasSuperadas++;
            }
            this.tiempoFinalMinutos += this.tiempos[i].getTotalMinutos();
        }        
    } // fin actualizar()
    
    public void mostrarDatos() {
        System.out.printf("%6s", this.nombre);
        for (int i = 0; i < this.tiempos.length; i++) {
            System.out.printf("%8s", this.tiempos[i].getTiempoFormato());
        }
        System.out.printf("%8d %4d", this.tiempoFinalMinutos, this.pruebasSuperadas);
        System.out.println("");
    } // fin mostrarDatos()
    
    public int getPruebasSuperadas() { return this.pruebasSuperadas; }
    public int getTiempoFinalMinutos() { return this.tiempoFinalMinutos; }
    public String getNombreEquipo() { return this.nombre; }
} // fin clase Equipo
