
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
    
    private void preOrdenImpl(String prefijo) {
        if (valor != null) {
            System.out.println(prefijo + valor);
            if (izquierdo != null) izquierdo.preOrdenImpl(prefijo + "  ");
            if (derecho != null) derecho.preOrdenImpl(prefijo + "  ");
        } 
    } // preOrdenImpl()
    
    @Override
    public void preOrden() {
        preOrdenImpl("");
    } // fin preOrden()
    
    private void inOrdenImpl(String prefijo) {
        if (valor != null) {
            if (izquierdo != null) izquierdo.inOrdenImpl(prefijo + "  ");
            System.out.println(prefijo + valor);
            if (derecho != null) derecho.inOrdenImpl(prefijo + "  ");
        }
    } // inOrdenImpl()
    
    @Override
    public void inOrden() {
        inOrdenImpl("");
    } // fin inOrden()

    @Override
    public void postOrden() {
        postOrdenImpl("");
    } // fin postOrden()
    
    private void postOrdenImpl(String prefijo) {
        if (valor != null) {
            if (izquierdo != null) izquierdo.postOrdenImpl(prefijo + "  ");
            if (derecho != null) derecho.postOrdenImpl(prefijo + "  ");
            System.out.println(prefijo + valor);
        }
    } // postOrdenImpl()
    
    @Override
    public void eliminar(int id) {
        
    } // fin eliminar()
} // fin clase BST
