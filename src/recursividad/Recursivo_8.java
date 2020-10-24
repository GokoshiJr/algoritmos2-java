
package recursividad;

public class Recursivo_8 {

    public static void main(String[] args) {
        /*
            18. Contar el numero de caracteres de una cadena recursivamente,
                no usar la funcion lenght de String.
            19. Mostrar una cadena recursiva caracter a caracter.
        
            Otra forma de hacer recursividad, si no tenemos claro el caso base,
            puede ser util forzar una excepcion para detener la recursividad.
        */
        String nombre = "Julio Gonzalez";
        int num = contarCaracteres(nombre, 0);
        System.out.printf("La cadena tiene %d caracteres \n", num);
        mostrarCaracteres(nombre, 0);
    }
    
    public static int contarCaracteres(String palabra, int indice) {
        try {
            char chatAt = palabra.charAt(indice); // se detiene cuando lanza la excepcion
            return 1 + contarCaracteres(palabra, indice + 1);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Fin de la recursividad");
            return 0;
        }
    }
    public static void mostrarCaracteres(String palabra, int indice) {
        try {
            char charAt = palabra.charAt(indice); // se detiene cuando lanza la excepcion
            System.out.println(charAt);
            mostrarCaracteres(palabra, indice + 1);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Fin de la recursividad");
        }
    }
    
}
