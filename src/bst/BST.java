
package bst;

public class BST implements IBST<Empleado>{
    
    private Empleado valor;
    
    private BST izquierdo, derecho;
    
    @Override
    public boolean esVacio() { return valor == null; }
    
    @Override
    public boolean esHoja() {
        return valor != null && izquierdo == null && derecho == null;
    }
    
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
    }

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
    }

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
    }

    

    @Override
    public void preOrden() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inOrden() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void postOrden() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

        
}
