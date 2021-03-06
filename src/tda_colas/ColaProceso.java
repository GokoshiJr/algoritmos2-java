package tda_colas;

public interface ColaProceso {
    
    void encolar(Trabajo t);
    
    void eliminar();
    
    void mostrarCola();
    
    int longitudCola();
    
    boolean estaVacio();
    
    Trabajo obtener();    
}
