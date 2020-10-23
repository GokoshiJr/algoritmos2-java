
package recursividad;

public class Recursivo_1 {

    public static void main(String[] args) {
        /*
            1. Sumar los numeros naturales hasta N de forma recursiva
            2. Factorial de un numero
        */
        int num1 = 9;
        int resultado = sumaRecursiva(num1);
        System.out.println(resultado);
        
        int num2 = 5;
        System.out.println(factorialRecursivo(num2));
    }
    
    public static int sumaRecursiva(int numero) {
        int result = 0;
        if (numero == 1) { // caso base, cuando queremos que termine
            return 1;
        } else { // caso general
            result = numero + sumaRecursiva(numero - 1);
        }
        return result;
    }
    
    public static int factorialRecursivo(int numero) {
        int result = 0;
        if (numero == 1) { // caso base, cuando queremos que termine
            return 1;
        } else { // caso general
            result = numero * factorialRecursivo(numero - 1);
        }
        return result;
    }
}
