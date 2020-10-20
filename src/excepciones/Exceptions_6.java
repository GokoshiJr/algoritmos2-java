
package excepciones;

import javax.swing.JOptionPane;

public class Exceptions_6 {
    public static void main(String[] args) {
        /*
            Mala practica capturar excepciones no comprobadas
        
            Atrapando varias excepciones
        
            Se usan varios catch, dependiendo de la cantidad de excepciones
            que queremos capturar.
            
            Metodos para informar sobre el tipo de error:
            .getMessage(), .getClass().getName()
        */
        try {
            division();
        } catch (ArithmeticException e) {
            System.out.println("Estas dividiendo por cero.");
            System.out.println(e.getMessage());
            System.out.printf("Se ha generado un error de este tipo: %s \n", e.getClass().getName());
        } catch (NumberFormatException e) {
            System.out.println("No has introducido un numero entero.");
            System.out.println(e.getMessage());
            System.out.printf("Se ha generado un error de este tipo: %s \n", e.getClass().getName());
        }
    } // fin main()
    public static void division() {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor"));
        System.out.printf("El resultado de %d / %d es %d", num1, num2, (num1 / num2));
    } // fin division()
} // fin clase Exceptions_6
