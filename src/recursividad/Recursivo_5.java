
package recursividad;

public class Recursivo_5 {

    public static void main(String[] args) {
        /*
            9. Calcula la potencia de un numero de forma recursiva, tanto 
            para exponentes negativos como positivos.
            10. Suma los digitos de un numero de forma recursiva.
        */
        System.out.println(potenciaRecursiva(2, -4));
        System.out.println(sumaDigitos(1234));
    }
    
    public static float potenciaRecursiva(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else if (exponente == 1) {
            return base;
        } else if (exponente < 0) {
            return potenciaRecursiva(base, exponente + 1) / base; 
        } else {
            return base * potenciaRecursiva(base, exponente - 1);
        }
    }
    
    public static int sumaDigitos(int num) {
        if (num < 10) {
            return num;
        } else { 
            return (num % 10) + sumaDigitos(num / 10);
        }
    }
}
