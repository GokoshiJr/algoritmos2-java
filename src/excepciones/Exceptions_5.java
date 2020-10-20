
package excepciones;

import javax.swing.JOptionPane;

public class Exceptions_5 {
    public static void main(String[] args) {
        /*
            Excepciones Propias
        
            Las usamos cuando no conseguimos una clase(excepcion) de la api de Java,
            que se adapte a nuestro error en el programa.
            
            La excepcion debe concordar con el tipo de error.
        
            Creamos una clase que herede de:
            Exception, IOException, RuntimeException
        
            Ej: email.lenght() < 3 caracteres
        */
        try {
            String email = JOptionPane.showInputDialog("Ingrese su correo");
            examinarEmail(email);
            String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
            examinarNombre(nombre);    
        } catch (longitudErronea e) {
            // System.out.println(e.getMessage());
            e.printStackTrace(); // mostramos la pila de llamada
        }
    } // fin main()
    
    // Excepcion no controlada
    public static void examinarEmail(String email) throws longitudErronea {
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
            if (arroba == 1 && punto) {
                JOptionPane.showMessageDialog(null, "Correcto");
            } else {
                JOptionPane.showMessageDialog(null, "No es Correcto");
            }
        } else {
            throw new longitudErronea("Correo es menor de 3 caracteres");
        }
    } // fin examinarEmail()
    
    // Excepcion Controlada
    public static void examinarNombre(String nombre) throws longitudErronea {
        if (nombre.length() > 3) {
            JOptionPane.showMessageDialog(null, "Correcto");
        } else {
            throw new longitudErronea("Su nombre es menor de 3 caracteres");
        }
    } // fin examinarNombre()
} // fin clase Exceptions_5

class longitudErronea extends Exception {
    /*
        Lo recomendable es usar dos constructores, uno por defecto y 
        otro que reciba un string
        
        Extends ->
        RuntimeException, no es comprobada, no nos obliga a usar Try catch
        Exception, es comprobada general, obliga a usar try catch
    */
    public longitudErronea() {
    }
    public longitudErronea(String message) {
        super(message);
    } 
} // fin clase longitudErronea
