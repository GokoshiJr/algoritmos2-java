
package debugger;

import javax.swing.JOptionPane;

public class Debugging_1 {
    
    static int numAleatorios[];
    
    public static void main(String[] args) {
        int elementos = Integer.parseInt(JOptionPane.showInputDialog("Indique la cantidad de elementos"));
        numAleatorios = new int[elementos];
        cargarNumeros(numAleatorios);
        mostrar(numAleatorios);
    } // fin main() 
    
    public static void cargarNumeros(int numArray[]) {
        for (int i=0; i<numArray.length; i++) {
            numArray[i] = (int)(Math.random() * 100);
        }
    } // fin cargarNumeros()
    
    public static void mostrar(int numArray[]) {
        for (int e: numArray) {
            System.out.println(e);
        }
    } // fin mostrar()
} // fin clase Debugging_1
