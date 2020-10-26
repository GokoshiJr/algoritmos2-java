
package p_generica;

public class Generica_6 {

    public static void main(String[] args) {
    
        /* 
            Herencia y tipos comodin en clases genericas 
            
            El tema de la herencia no funciona igual que en las clases normales,
            Empleado, Jefe.
        
            -> un Jefe es siempre un Empleado (Jefe hereda de Empleado)
            -> un Empleado es siempre un Jefe (NO, no puede heredar Empleado de Jefe)
        
            Class<Empleado> no existe relacion de herencia con Class<Jefe>
            
            Se usan los tipos comodin para poder heredar
        */
        
        // Herencia Normal
        Empleado julio = new Empleado("Julio Gonzalez", 20, 2500);
        Jefe andres = new Jefe("Andres Gonzalez", 20, 2500);
        Jefe mafer = new Jefe("Maria Fernanda", 25, 3500, 100);
        // Principio de sustitucion, ES SIEMPRE UN 
        Empleado nuevoEmpleado = mafer;
        // System.out.println(nuevoEmpleado);
        
        // Herencia en clases genericas
        Pareja<Empleado> administrador = new Pareja<>();
        administrador.setPrimero(andres);
        
        Pareja<Jefe> director = new Pareja<>();
        director.setPrimero(mafer);
        
        // Pareja<Empleado> empleado2 = director; ERROR
        
        Pareja.mostrarTrabajador(administrador);
        Pareja.mostrarTrabajador(director); 
        
    }
    
}
