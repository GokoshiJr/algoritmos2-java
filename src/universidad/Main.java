
package universidad;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        
        int registros = Support.cantidadRegistros();        
        Persona arrayPersona[] = new Persona[registros];
        Support.leoArchivo(arrayPersona);
        Support.mostrarArray(arrayPersona);
    } // fin main()    
} // fin clase Main
