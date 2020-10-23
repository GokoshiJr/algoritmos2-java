
package recursividad;

public class Recursivo_7 {

    public static void main(String[] args) {
        /*
            16. Funcion recursiva determinar si dos vectores de tamaño son iguales
            17. Funcion recursiva invertir un array
        */
        int array1[] = {1, 2, 3, 4, 5, 6};
        int array2[] = {1, 2, 3, 4, 5, 6};
        
        if (array1.length == array2.length) {
            System.out.println(arraysIguales(array1, array2, 0));
        } else {
            System.out.println(false);
        }
        
        invertirArray(array1, 0, array1.length - 1);
        for (int i : array1) {
            System.out.println(i);
        }
    }
    
    public static boolean arraysIguales(int array1[], int array2[], int i) {
        if (i == array1.length) {
            return true;
        } else if (array1[i] != array2[i]) {
            return false;
        } else {
            return arraysIguales(array1, array2, i + 1);
        }
    }
    
    public static void invertirArray(int array[], int inicio, int fin) {
        if (inicio < fin) {
            int aux = array[inicio];
            array[inicio] = array[fin];
            array[fin] = aux;
            invertirArray(array, inicio + 1, fin - 1);
        }
    }
}
