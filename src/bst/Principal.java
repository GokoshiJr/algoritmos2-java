
package bst;

import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {
        
        Empleado e1, e2, e3, e4, e5, e6;
        
        e1 = new Empleado(20, "Pepito Perez", "Ventas", "A-252");
        e2 = new Empleado(44, "Ana Lopez", "Recursos Humanos", "B-198");
        e3 = new Empleado(18, "Elena Nito", "Ventas", "A-241");
        e4 = new Empleado(33, "Jose Gomez", "Contabilidad", "B-96");
        e5 = new Empleado(64, "Francisco Perez", "Marketing", "A-69");
        e6 = new Empleado(55, "Julio Gonzalez", "Informatica", "B-161");
        
        BST bst = new BST();
        Arrays.asList(e1, e2, e3, e4, e5, e6).forEach(bst::insertar);
        
        System.out.println("Cantidad de Nodos: " + contarNodos(bst));
        System.out.println("Cantidad de NodosHoja: " + contarNodosHoja(bst));
    } // fin main()
    
    private static void localizar(BST bst, int id) {
        if (bst.existe(id)) {
            System.out.println(bst.obtener(id));
        } else {
            System.out.printf("No encuentro el empleado %d \n", id);
        }
    } // fin localizar()   
    
    public static int contarNodos(BST bst) {
        int contador = 1;
        if (bst.getHijoIzquierdo() != null) {
            contador += contarNodos(bst.getHijoIzquierdo());
        }
        if (bst.getHijoDerecho() != null) {
            contador += contarNodos(bst.getHijoDerecho());
        }
        return contador;
    } // fin contarNodos()
    
    public static int contarNodosHoja(BST bst) {
        int contador = 0;
        if (bst.esHoja()) {
            contador++;
        }
        if (bst.getHijoIzquierdo() != null) {
            contador += contarNodosHoja(bst.getHijoIzquierdo());
        }
        if (bst.getHijoDerecho() != null) {
            contador += contarNodosHoja(bst.getHijoDerecho());
        }
        return contador;
    } // fin contarNodosHoja()
} // fin clase Principal
