package tda_colas;

public class MiColaProceso implements ColaProceso{    
    
    private class NodoProceso {
        
        public Trabajo trabajo;
        public NodoProceso siguiente;

        public NodoProceso(Trabajo trabajo) {
            this.trabajo = trabajo;            
        }
    } // fin clase interna NodoProceso
    
    private NodoProceso cabeza, ultimo;
    private int longitud = 0;
    
    @Override
    public void encolar(Trabajo t) {        
        NodoProceso nuevoNodo = new NodoProceso(t);        
        if (cabeza == null){
            cabeza = nuevoNodo;            
        } else {
            ultimo.siguiente = nuevoNodo;            
        }
        ultimo = nuevoNodo;
        longitud++;
    } // fin encolar()

    @Override
    public void eliminar() {
        if (cabeza != null) {
            NodoProceso eliminar = cabeza;
            cabeza = cabeza.siguiente;
            eliminar.siguiente = null;
            if (cabeza == null) {
                ultimo = null;
            }
        }
        longitud--;
    } // fin eliminar()

    @Override
    public Trabajo obtener() {
        if (cabeza == null) {
            return null;
        } else {
            return cabeza.trabajo;
        }        
    } // fin obtener()
    
    @Override
    public int longitudCola() { return this.longitud; } // fin longitudCola()
    
    @Override
    public void mostrarCola() {
        System.out.println("Primero en la Cola");
        NodoProceso temp = cabeza;
        while(temp != null) {
            System.out.println(temp.trabajo);
            temp = temp.siguiente;
        }
    } // fin mostrarCola()
    
    @Override
    public boolean estaVacio() { return cabeza == null; } // fin estaVacio()
    
} // fin clase MiColaProceso
