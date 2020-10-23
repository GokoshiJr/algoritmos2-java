
package recursividad;

public class Recursivo_2 {
    
    public static void main(String[] args) {
        /*
            3. Recorrer un array de forma recursiva
            4. Buscar un elemento de un array de forma recursiva
        */
        int numArray[] = {1, 2, 3, 4, 5};
        recorrerRecursivo(numArray, 0);

        int elemento = 6;
        int posicion = posicionElemento(numArray, elemento, 0);
        if (posicion == -1) {
            System.out.println("El numero no se encuentra en el Array");
        } else {
            System.out.printf("\nEl elemento %d se encuentra en la posicion %s \n", elemento, posicion);
        }
    }
    
    public static void recorrerRecursivo(int numArray[], int indice) {
        /* Primera forma*/
        /*
            if (indice == numArray.length - 1) {
                System.out.println(numArray[indice]);
            } else {
                System.out.println(numArray[indice]);
                recorrerRecursivo(numArray, indice + 1);
            }
        */
        /* 2da forma*/
        if (indice != numArray.length) {
            System.out.println(numArray[indice]);
            recorrerRecursivo(numArray, indice + 1);
        }
    }
    
    public static int posicionElemento(int numArray[], int elemento, int indice) {
        if (indice == numArray.length) {
            return -1;  
        } else if (numArray[indice] == elemento) { // caso base
            return indice;
        } else {
            return posicionElemento(numArray, elemento, indice + 1);
        }
    }
}
