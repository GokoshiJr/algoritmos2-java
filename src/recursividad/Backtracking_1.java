
package recursividad;

import java.util.ArrayList;

public class Backtracking_1 {
    
    public static void main(String[] args) {
        /*
            20. Obtener todas las combinaciones de sumar un numero en concreto
            4 = 1 + 1 + 1 + 1
            4 = 2 + 2
            (...)
        
            Backtracking - Vuelta atras, es recursividad avanzada
            donde podemos usar ciclos en en las llamadas recursivas
        
            Se usa para calcular combinaciones
        */
        int num = 4;
        ArrayList<Integer> numArray = new ArrayList<>();
        combinaciones(num, numArray, 0);
    } // fin main()
    
    public static void combinaciones(int num, ArrayList<Integer> numArray, int suma) {
        if (suma == num) {
            System.out.println(numArray);
        } else {
            for (int i=1; i<=num; i++) {
                suma += i;
                if (suma <= num) {
                    numArray.add(i);
                    combinaciones(num, numArray, suma);
                    numArray.remove(numArray.indexOf(i)); // Vuelta atras
                    
                }
                suma -= i; // Vuelta atras
            }
        }
    } // fin combinaciones()
} // fin clase Backtracking_1
