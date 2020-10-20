
package excepciones;

import java.io.EOFException;
import javax.swing.JOptionPane;


public class Exceptions_4 {

    public static void main(String[] args) {
        /*
            Clausula throw - (Lanzamiento de excepciones manualmente)
        
            La usamos en cualquier parte de codigo para indicar que en ese
            punto en especifico se lanza una excepcion
        
            En el caso de que el email.lenght sea <= 3, 
            lanzamos una excepcion manual
        
            Si lanzamos manualmente una excepcion con el throw,
            hay que indicar en el metodo que lanza esa expecion 
            con el throws
            
            Si no encontramos una clase(excepcion) de la api de Java
            podemos crear nuestras excepciones
        */
        String email = JOptionPane.showInputDialog("Ingrese su correo");
        examinarEmail(email);
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        try {
            examinarNombre(nombre);
        } catch (EOFException e) {
            JOptionPane.showMessageDialog(null, "Nombre muy corto.");
        }
    } // fin main()
    
    // Excepcion no controlada
    public static void examinarEmail(String email) throws ArrayIndexOutOfBoundsException{
        int arroba = 0;
        boolean punto = false;
        if (email.length() > 3) {
            for (int i=0; i<email.length(); i++) {
                if (email.charAt(i) == '@') {
                    arroba++;
                }
                if (email.charAt(i) == '.') {
                    punto = true;
                }
            }
            if (arroba == 1 && punto)   {
                JOptionPane.showMessageDialog(null, "Correcto");
            } else {
                JOptionPane.showMessageDialog(null, "No es Correcto");
            }
        } else {
            // Instanciamos la clase de la excepcion y luego la lanzamos
            // ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();
            // throw e;
            throw new ArrayIndexOutOfBoundsException();
        }
    } // fin examinarEmail()
    
    // Excepcion Controlada
    public static void examinarNombre(String nombre) throws EOFException {
        if (nombre.length() > 3) {
            JOptionPane.showMessageDialog(null, "Correcto");
        } else {
            throw new EOFException();
        }
    } // fin examinarNombre()
} // fin clase Exceptions_4
