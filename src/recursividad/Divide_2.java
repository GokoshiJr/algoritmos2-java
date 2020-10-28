
package recursividad;

public class Divide_2 {

    public static void main(String[] args) {
        /*
            Divide y Venceras
            1. Multiplique los elementos de un array
            2. Calcule la media de los elementos de un array
        */
        int numArray[] = {1, 2, 3, 4, 5, 6, 7, 8};
        //System.out.println(multiArray(0, numArray.length - 1, numArray));
        
        if (numArray.length % 2 == 0) {
            System.out.println(mediaArray(0, numArray.length - 1, numArray));
        } else {
            System.out.println("El nuemro de elementos debe ser par.");
        }
    }
    
    public static int multiArray(int inicio, int fin, int numArray[]) {
        if (inicio == fin) {
            return numArray[inicio];
        } else {
            int mitad = (inicio + fin) / 2;
            int x = multiArray(inicio, mitad, numArray);
            int y = multiArray(mitad + 1, fin, numArray);
            return x * y;
        }
    }
    
    public static float mediaArray(int inicio, int fin, int numArray[]) {
        if (inicio == fin) {
            return numArray[inicio];
        } else {
            int mitad = (inicio + fin) / 2;
            float x = mediaArray(inicio, mitad, numArray);
            float y = mediaArray(mitad + 1, fin, numArray);
            return (x + y) / 2;
        }
    }
}
