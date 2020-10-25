
package p_generica;

public class ArrayList2 {
    
    private Object datosElemento[];
    private int i = 0;
    
    public ArrayList2(int num) {
        this.datosElemento = new Object[num];
    }
    
    public Object get(int i){
        return datosElemento[i];
    }
    
    public void add(Object o) {
        datosElemento[i] = o;
        i++;
    }
}
