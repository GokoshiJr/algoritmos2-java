
package recursividad;

public class Recursivo_6 {

    public static void main(String[] args) {
        /*
            11. Haz una funcion que obtenga el maximo numero de un array
            pasandole el array, el indice y el numero maximo actual.
        
            Otra funcion sin que sea necesario el tercer parametro.
            
            Haz lo mismo con el minimo.
        */
        int numeros[] = {11, 2, -33, 4, 53, -10, 6, 5, 9, 70, 45, 10, 100, 1, -1};
        System.out.println(maximoRecursivo(numeros, 0, numeros[0]));
        System.out.println(maximoRecursivo(numeros, 0));
        System.out.println(minimoRecursivo(numeros, 0, numeros[0]));
        System.out.println(minimoRecursivo(numeros, 0));
    }
    
    public static int maximoRecursivo(int numeros[], int indice, int maximo) {
        if (indice != numeros.length) {
            if (numeros[indice] > maximo) {
                maximo = maximoRecursivo(numeros, indice + 1, numeros[indice]);
            } else {
                maximo = maximoRecursivo(numeros, indice + 1, maximo);
            }
        }
        return maximo;
    }
    
    public static int maximoRecursivo(int numeros[], int indice) {
        int maximo = 0;
        if (indice != numeros.length) {
            maximo = Math.max(numeros[indice], maximoRecursivo(numeros, indice + 1));
        }
        return maximo;
    }
    
    public static int minimoRecursivo(int numeros[], int indice, int minimo) {
        if (indice != numeros.length) {
            if (numeros[indice] < minimo) {
                minimo = minimoRecursivo(numeros, indice + 1, numeros[indice]);
            } else {
                minimo = minimoRecursivo(numeros, indice + 1, minimo);
            }
        }
        return minimo;
    }
    
    public static int minimoRecursivo(int numeros[], int indice) {
        int minimo = 0;
        if (indice != numeros.length) {
            minimo = Math.min(numeros[indice], minimoRecursivo(numeros, indice + 1));
        }
        return minimo;
    }
}
