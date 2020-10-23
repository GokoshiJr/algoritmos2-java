
package recursividad;

public class Recursivo_4 {

    public static void main(String[] args) {
        /*
            7. Invertir un numero de forma recursiva (No usar String)
            8. Invertir una palabra de forma recursiva
        */
        int num = 1234;
        System.out.println(invertirNum(num, 3));
        String palabra = "hola";
        System.out.println(invertirPalabra(palabra, palabra.length() - 1));
                
    }
    
    public static int invertirNum(int num, int pos) {
        if (num < 10) {
            return num;
        } else {
            return (num % 10) * (int) (Math.pow(10, pos)) + invertirNum(num / 10, pos - 1);
        }
    }
    
    public static String invertirPalabra(String palabra, int longitud) {
        if (longitud == 0) {
            return palabra.charAt(longitud) + "";
        } else {
            return palabra.charAt(longitud) + invertirPalabra(palabra, longitud - 1);
        }
    }
}
