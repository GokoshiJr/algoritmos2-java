
package recursividad;

public class Divide_4 {

    public static void main(String[] args) {
        /*
            Divide y Venceras 
            Calcule el maximo y minimo valor de un Array
        */
        int numArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 4, 3, 1, 0, 7, 6, -10};
        System.out.println("Minimo (funcion 1) = " + minimo(0, numArray.length - 1, numArray));
        System.out.println("Maximo (funcion 2) = " + maximo(0, numArray.length - 1, numArray));
        int valores[] = minMax(0, numArray.length - 1, numArray);
        System.out.println("Minimo (funcion 3) = " + valores[0]);
        System.out.println("Maximo (funcion 3) = " + valores[1]);
    }
    
    public static int minimo(int inicio, int fin, int numArray[]) {
        if (inicio == fin) {
            return numArray[inicio];
        } else {
            int mitad = (inicio + fin) / 2;
            int x = minimo(inicio, mitad, numArray);
            int y = minimo(mitad + 1, fin, numArray);
            return (x < y) ? x : y;
        }
    }
    
    public static int maximo(int inicio, int fin, int numArray[]) {
        if (inicio == fin) {
            return numArray[inicio];
        } else {
            int mitad = (inicio + fin) / 2;
            int x = maximo(inicio, mitad, numArray);
            int y = maximo(mitad + 1, fin, numArray);
            return (x > y) ? x : y;
        }
    }
    
    public static int[] minMax(int inicio, int fin, int numArray[]) {
        int result[] = new int[2];
        if (fin - inicio <= 1) {
            result[0] = numArray[inicio];
            result[1] = numArray[fin];
            if (result[0] > result[1]) {
                int aux = result[0];
                result[0] = result[1];
                result[1] = aux;
            }
        } else {
            int mitad = (inicio + fin) / 2;
            int mm1[] = minMax(inicio, mitad, numArray);
            int mm2[] = minMax(mitad + 1, fin, numArray);
            if (mm1[0] < mm2[0]) {
                result[0] = mm1[0];
            } else {
                result[0] = mm2[0];
            }
            if (mm1[1] > mm2[1]) {
                result[1] = mm1[1];
            } else {
                result[1] = mm2[1];
            }
        }
        return result;
    }
}
