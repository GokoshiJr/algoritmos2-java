
package bst;

public class BST implements IBST<Empleado>{
    
    private Empleado valor;
    
    private BST izquierdo, derecho;
    
    @Override
    public boolean esVacio() { 
        return valor == null; 
    } // fin esVacio()
    
    @Override
    public boolean esHoja() {
        return valor != null && izquierdo == null && derecho == null;
    } // fin esHoja()
    
    @Override
    public void insertar(Empleado empl) {
        if (valor == null) {
            this.valor = empl;
        } else {
            if (empl.compareTo(valor) < 0) {
                if (izquierdo == null) izquierdo = new BST();
                izquierdo.insertar(empl);
            } else if (empl.compareTo(valor) > 0) {
                if (derecho == null) derecho = new BST();
                derecho.insertar(empl);
            } else {
                throw new RuntimeException("Insertando elemento duplicado");
            }
        }
    } // fin insertar()

    @Override
    public boolean existe(int id) {
        if (valor != null) {
            if (id == valor.getId()) {
                return true;
            } else if (id < valor.getId() && izquierdo != null) {
                return izquierdo.existe(id);
            } else if (id > valor.getId() && derecho != null) {
                return derecho.existe(id);
            } else {
                return false;
            }
        } else {
            return false;
        }
    } // fin existe()

    @Override
    public Empleado obtener(int id) {
        if (valor != null) {
            if (id == valor.getId()) {
                return valor;
            } else if (id < valor.getId() && izquierdo != null) {
                return izquierdo.obtener(id);
            } else if (id > valor.getId() && derecho != null) {
                return derecho.obtener(id);
            } else {
                return null;
            }
        } else {
            return null;
        }
    } // fin obtener

    @Override
    public void preOrden() {
        if (valor != null) {
            System.out.println(valor);
            if (izquierdo != null) izquierdo.preOrden();
            if (derecho != null) derecho.preOrden();
        } 
    } // fin preOrden()

    @Override
    public void inOrden() {
        if (valor != null) {
            if (izquierdo != null) izquierdo.inOrden();
            System.out.println(valor);
            if (derecho != null) derecho.inOrden();
        }
    } // fin inOrden()

    @Override
    public void postOrden() {
        if (valor != null) {
            if (izquierdo != null) izquierdo.postOrden();
            if (derecho != null) derecho.postOrden();
            System.out.println(valor);
        }
    } // fin postOrden()

    @Override
    public void eliminar(int id) {
        
    } // fin eliminar()
} // fin clase BST
