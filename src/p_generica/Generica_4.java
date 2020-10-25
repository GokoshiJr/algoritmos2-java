
package p_generica;

public class Generica_4 {
    
    public static void main(String[] args) {
        
        /* La clase generica se adapta a un objeto de tipo String*/
        Pareja<String> una = new Pareja<>();
        una.setPrimero("Julio");
        System.out.println(una.getPrimero());
        
        /* La clase generica se adapta a un objeto de tipo Empleado */
        Empleado empleado1 = new Empleado("Julio", 20, 2000); 
        Pareja<Empleado> persona1 = new Pareja<>();
        persona1.setPrimero(empleado1);
        System.out.println(persona1.getPrimero());
    }
}
