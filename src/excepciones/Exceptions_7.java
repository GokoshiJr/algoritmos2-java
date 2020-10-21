
package excepciones;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exceptions_7 {
    public static void main(String[] args) {
        /*
            Clausula Finally
        
            La usamos para ejecutar una instruccion si o si, cuando empleamos
            un try catch
        
            Si va bien o va mal el programa se ejecuta el bloque del finally
        */
        menuAreas();
        pesoIdeal();
    } // fin main()
    
    public static void menuAreas() {
        int opc = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Menu Areas \n 1) Cuadrado \n 2) Rectangulo \n 3) Triangulo \n 4) Circulo \n opc: ");
        try {
            opc = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
        } finally {
            // lo que colocamos dentro de la clausula finally, se ejecua si o si
            teclado.close();
        }
        switch (opc) {
            case 1:
                areaCuadrado();
                break;
            case 2:
                areaRectangulo();
                break;
            case 3:
                areaTriangulo();
                break;
            case 4:
                areaCirculo();
                break;
            default:
                System.out.println("Opcion invalida.");
                break;
        }
    } // fin menuAreas()
    
    public static void areaCuadrado() {
        int lado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado en cm"));
        System.out.printf("El area del cuadrado es: %.2f \n", Math.pow(lado, 2));
    } // fin areaCuadrado()
    
    public static void areaRectangulo() {
        int base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base en cm"));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura en cm"));
        System.out.printf("El area del rectangulo es: %d \n", base * altura);
    } // fin areaRectangulo()
    
    public static void areaTriangulo() {
        int base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base en cm"));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura en cm"));
        System.out.printf("El area del triangulo es: %d \n", (base * altura) / 2);
    } // fin areaTriangulo()
    
    public static void areaCirculo() {
        int radio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio en cm"));
        System.out.printf("El area del circulo es: %.2f \n", Math.pow(Math.PI * radio, 2));
    } // fin areaCirculo()
    
    public static void pesoIdeal() {
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su altura en cm"));
        System.out.printf("\nTu peso ideal si eres hombre es: %d kg \n", (altura - 110));
        System.out.printf("Tu peso ideal si eres mujer es: %d kg \n", (altura - 120));
    } // fin pesoIdeal()
} // fin clase Exceptions_7
