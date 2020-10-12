
package tda_listas_enlazadas;

public class ListaEnlazada {
    
    private Nodo cabeza;
    private int longitud = 0;
    
    private class Nodo {
        
        public Libro libro;
        public Nodo siguiente;
        
        public Nodo(Libro libro) {            
            this.libro = libro;            
        } // constructor
    } // fin clase interna Nodo
    
    public void insertarPrincipio(Libro libro) {
        Nodo nodo = new Nodo(libro);
        nodo.siguiente = cabeza;
        cabeza = nodo;
        longitud++;
    } // fin insertarPrincipio()
    
    public void insertarFinal(Libro libro) {
        Nodo nodo = new Nodo(libro);
        if (cabeza == null) {
            cabeza = nodo;
        } else {
            Nodo puntero = cabeza;
            while(puntero.siguiente != null) {
                puntero = puntero.siguiente;            
            }
            puntero.siguiente = nodo;  
        }
        longitud++;
    } // fin insertarFinal()
    
    public void insertarDespues(int n, Libro libro) {
        Nodo nodo = new Nodo(libro);
        if (cabeza == null) {
            cabeza = nodo;
        } else {
            Nodo puntero = cabeza;
            int contador = 0;
            while(contador < n && puntero.siguiente != null) {
                puntero = puntero.siguiente; 
                contador++;
            }
            nodo.siguiente = puntero.siguiente;
            puntero.siguiente = nodo;
        }
        longitud++;
    } // fin insertarDespues()
    
    public Libro obtener(int n) {
        if (cabeza == null) {            
            return null;
        } else {
            Nodo puntero = cabeza;
            int contador = 0;
            while (contador < n && puntero.siguiente != null) {
                puntero = puntero.siguiente;
                contador++;
            }
            if (contador != n) {
                return null;
            } else {
                return puntero.libro;
            }
        }
    } // fin obtener()
    
    public int contarLongitud() {
        return longitud;
    } // fin contarLongitud()
    
    public boolean estaVacio() {
        return cabeza == null;
    } // fin estaVacio()
    
    public void eliminarPrincipio() {
        if (cabeza != null) {
            Nodo primer = cabeza;
            cabeza = cabeza.siguiente;
            primer.siguiente = null;
            longitud--;
        }
    } // fin eliminarPrincipio()
    
    public void eliminarUltimo() {
        if (cabeza != null) {
            if (cabeza.siguiente == null){
                cabeza = null;
            } else {
                Nodo puntero = cabeza;
                while(puntero.siguiente.siguiente != null) {
                    puntero = puntero.siguiente;
                }
                puntero.siguiente = null;
                longitud--;
            }            
        }
    } // fin eliminarUltimo()
    
    public void eliminarLibro(int n) {
        if (cabeza != null) {
            if (n == 0) {
                Nodo primer = cabeza;
                cabeza = cabeza.siguiente;
                primer.siguiente = null;
                longitud--;
            } else if (n < longitud) {
                Nodo puntero = cabeza;
                int contador = 0;
                while(contador < (n - 1)) {
                    puntero = puntero.siguiente;
                    contador++;
                }
                Nodo temporal = puntero.siguiente;
                puntero.siguiente = temporal.siguiente;
                temporal.siguiente = null;
                longitud--;
            }            
        }
    } // fin eliminarLibro()
    
    public void mostrarLista() {
        if (cabeza != null) {                        
            Nodo puntero = cabeza;  
            int contador = 0;
            while(contador < longitud) {
                System.out.println(puntero.libro.toString());
                puntero = puntero.siguiente;
                contador++;
            }          
        } else {
            System.out.println("Esta vacia la lista.");
        }
    } // fin mostrarLista()    
    
} // fin clase ListaEnlazada
