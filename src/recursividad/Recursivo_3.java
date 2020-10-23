
package recursividad;

public class Recursivo_3 {

    public static void main(String[] args) {
        /* 
            5. Recorrer una matriz de fora recursiva
            6. Calcular el valor de la posicion fibonacci usando recursividad
        */            
        int matriz[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        recorrerMatriz(matriz, 0, 0);
        System.out.println("");
        System.out.println(fibonacci(6));
    }
    
    public static void recorrerMatriz(int matriz[][], int i, int j) {
        System.out.print(matriz[i][j] + " ");
        if (i != (matriz.length - 1) || j != (matriz[i].length - 1)) {
            if (j == (matriz[i].length - 1)) {
                i++;
                j = 0;
                System.out.println("");
            } else {
                j++;
            }
            recorrerMatriz(matriz, i, j);
        } 
    }
    
    public static int fibonacci(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 0){
            return 0;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
