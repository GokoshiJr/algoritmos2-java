
package recursividad;

public class Divide_3 {
    
    public static void main(String[] args) {
        /*
            Divide y Venceras
            Comprobar si dos arrays son iguales
        */
        int numArray[]  = {1, 2, 3, 4, 5, 6, 7, 8};
        int numArray2[] = {1, 2, 3, 4, 5, 6, 7, 8};
        
        if (numArray.length == numArray2.length) {
            if (arrayIgual(0, numArray.length - 1, numArray, numArray2) == -1) {
                System.out.println("Los array son iguales");
            } else {
                System.out.println("Los arrays son diferentes");
            }
        } else {
            System.out.println("Los arrays son diferentes");
        }
    }
    
    public static int arrayIgual(int inicio, int fin, int numArray[], int numArray2[]) {
        if (inicio == fin) {
            if (numArray[inicio] == numArray2[inicio]) {
                return -1;
            } else {
                return inicio;
            }
        } else {
            int mitad = (inicio + fin) / 2;
            int x = arrayIgual(inicio, mitad, numArray, numArray2);
            int y = arrayIgual(mitad + 1, fin, numArray, numArray2);
            if (x != -1) {
                return x;
            }
            if (y != -1) {
                return y;
            }
            return -1;
        }
    }
}
