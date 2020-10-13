package tda_pilas;

public interface PilaProceso {
    
    void apilar(URL url);
    
    void desapilar();
    
    URL obtener();
    
    int longitud();
    
    boolean vacia();
    
    void mostrarPila();
}
