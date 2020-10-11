package concurso;

public class Tiempo {
    
    // Campos de Clase
    private final String tiempoFormato;
    private int hora, minutos, totalMinutos;
    
    public Tiempo(String tiempoFormato) {
        this.tiempoFormato = tiempoFormato;
        this.actualizarTime();
        this.minutosTotal();        
    } // constructor
    
    private void actualizarTime() {
        this.hora = Integer.parseInt(this.tiempoFormato.substring(0, 2));
        this.minutos = Integer.parseInt(this.tiempoFormato.substring(3, 5));
    } // fin actualizarTime()
    
    private void minutosTotal() {
        this.totalMinutos = (this.hora * 60) + this.minutos;
    } // fin minutosTotal()
    
    // Getters
    public String getTiempoFormato() { return this.tiempoFormato; }
    public int getHora() { return this.hora; }
    public int getMinutos() { return this.minutos; }
    public int getTotalMinutos() { return this.totalMinutos; }
    
} // fin clase Tiempo
