
package tda_pilas;

public class Pila implements PilaProceso {
    
    private class Nodo {
        public URL url;
        public Nodo siguiente;
        
        public Nodo(URL url) {
            this.url = url;
        }
    }
    
    private Nodo cima;
    
    private int longitud = 0;
   
    @Override
    public void apilar(URL url) {
        Nodo nodo = new Nodo(url);
        nodo.siguiente = cima;
        cima = nodo;
        longitud++;
    } // fin apilar()

    @Override
    public void desapilar() {
        if (cima != null) {
            Nodo eliminar = cima;
            cima = cima.siguiente;
            eliminar.siguiente = null;
            longitud--;
        }
    }

    @Override
    public URL obtener() {
        if (cima == null) {
            return null;   
        } else {
            return cima.url;
        }
        
    }

    @Override
    public int longitud() {
        return longitud;
    }

    @Override
    public boolean vacia() {
        return longitud == 0;
    }
    
    @Override
    public void mostrarPila() {
        if (longitud == 0){
            System.out.println("La pila esta vacia");
        }else{
            System.out.println("Ultimo en la Pila");
            Nodo temp = cima;
            while(temp != null) {
            System.out.println(temp.url);
            temp = temp.siguiente;
            } 
        }
        System.out.println("");
        
    }
}
