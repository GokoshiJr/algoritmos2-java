
package recursividad;

public class Divide_1 {

    public static void main(String[] args) {
        /*
            Divide y Venceras
            1. Sumar los elementos de un array
        */
        int numArray[] = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(sumaArray(0, numArray.length - 1, numArray));
    }
    
    public static int sumaArray(int inicio, int fin, int numArray[]) {
        if (inicio == fin) {
            return numArray[inicio];
        } else {
            int mitad = (inicio + fin) / 2;
            int x = sumaArray(inicio, mitad, numArray);
            int y = sumaArray(mitad + 1, fin, numArray);
            return x + y;
        }
    }
}
