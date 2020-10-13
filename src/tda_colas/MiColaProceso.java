package tda_colas;

public class MiColaProceso implements ColaProceso{    
    
    private class NodoProceso {
        public Trabajo trabajo;
        public NodoProceso siguiente;

        public NodoProceso(Trabajo trabajo) {
            this.trabajo = trabajo;            
        }
    }
    
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
    }

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
    }

    @Override
    public Trabajo obtener() {
        if (cabeza == null) {
            return null;
        } else {
            return cabeza.trabajo;
        }        
    }
    
    @Override
    public int longitudCola() { return this.longitud; }
    
    @Override
    public void mostrarCola() {
        System.out.println("Primero en la Cola");
        
//        while (cabeza != null) {
//            System.out.println(this.cabeza.trabajo);
//            cabeza = this.cabeza.siguiente;
//        }
        
        NodoProceso temp = cabeza;
        while(temp != null) {
            System.out.println(temp.trabajo);
            temp = temp.siguiente;
        }
    } // fin mostrarCola()
    
} // fin clase MiColaProceso
