
package bst;

public class BST implements IBST<Empleado>{
    
    private Empleado valor;
    
    private BST izquierdo, derecho, padre;
    
    @Override
    public boolean esVacio() { 
        return valor == null; 
    } // fin esVacio()
    
    @Override
    public boolean esHoja() {
        return valor != null && izquierdo == null && derecho == null;
    } // fin esHoja()
        
    private void insertarImpl(Empleado empl, BST padre) {
        if (valor == null) {
            this.valor = empl;
            this.padre = padre;
        } else {
            if (empl.compareTo(valor) < 0) {
                if (izquierdo == null) izquierdo = new BST();
                izquierdo.insertarImpl(empl, this);
            } else if (empl.compareTo(valor) > 0) {
                if (derecho == null) derecho = new BST();
                derecho.insertarImpl(empl, this);
            } else {
                throw new RuntimeException("Insertando elemento duplicado");
            }
        }
    } // fin insertar()
    
    @Override
    public void insertar(Empleado empl) {
        insertarImpl(empl, null);
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
        if (valor != null) {
            if (id == valor.getId()) {
                eliminarImpl(id);
            } else if (id < valor.getId() && izquierdo != null) {
                izquierdo.eliminar(id);
            } else if (id > valor.getId() && derecho != null) {
                derecho.eliminar(id);
            }
        }
    } // fin eliminar()
    
    private void eliminarImpl(int id) {
        if (izquierdo != null && derecho != null) {
            // eliminar con 2 hijos
            BST minimo = derecho.minimo();
            this.valor = minimo.valor;
            derecho.eliminar(minimo.valor.getId());
        } else if (izquierdo != null || derecho != null) {
            // eliminar con 1 hijo
            BST sustituto = izquierdo != null ? izquierdo : derecho;
            this.valor = sustituto.valor;
            this.izquierdo = sustituto.izquierdo;
            this.derecho = sustituto.derecho;
        } else {
            // eliminar con 0 hijos
            if (padre != null) {
                if (this == padre.izquierdo) padre.izquierdo = null;
                if (this == padre.derecho) padre.derecho = null;
                padre = null;
            }
            valor = null;
        }
    }
    
    private BST minimo () {
        if (izquierdo != null && !izquierdo.esVacio()) {
            return izquierdo.minimo();
        } else {
            return this;
        }
    }
} // fin clase BST
