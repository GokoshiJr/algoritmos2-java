
package bst;

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
        
        System.out.printf("Esta vacio:%s - Es Hoja:%s \n", bst.esVacio(), bst.esHoja());
        
        bst.insertar(e1);
        System.out.printf("Esta vacio:%s - Es Hoja:%s \n", bst.esVacio(), bst.esHoja());
        
        bst.insertar(e2);
        System.out.printf("Esta vacio:%s - Es Hoja:%s \n", bst.esVacio(), bst.esHoja());
        
        localizar(bst, 44);
        localizar(bst, 5);
    } // fin main()
    
    private static void localizar(BST bst, int id) {
        if (bst.existe(id)) {
            System.out.println(bst.obtener(id));
        } else {
            System.out.printf("No encuentro el empleado %d \n", id);
        }
    } // fin localizar()    
} // fin clase Principal
