
package universidad;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Support {
    
    public static int cantidadRegistros() throws IOException { 
        
        Scanner leer = new Scanner(new File("src/universidad/Datos.txt"));
        int registros = 0;
        
        while (leer.hasNextLine()) {
            registros++;
            leer.nextLine();
        } 
        leer.close();
        
        return registros;
    } // fin cantidadRegistros()
    
    public static void leoArchivo(Persona arrayPersona[]) throws IOException {
        
        Scanner leer = new Scanner(new File("src/universidad/Datos.txt"));
        int registro = 0;  
        
        while (leer.hasNext()) { 
            
            int tipo = leer.nextInt();
            String nombre = leer.next();
            int cedula = leer.nextInt();  
            
            if (tipo == 0) {              
                String materia = leer.next();
                int horas = leer.nextInt();
                int dedicacion = leer.nextInt();
                arrayPersona[registro] = new Profesor(nombre, cedula, materia, horas, dedicacion);            
            } else {                
                float notas[] = new float[4];
                for (int i = 0; i < notas.length; i++) {
                  notas[i] = leer.nextInt();
                }
                arrayPersona[registro] = new Estudiante(nombre, cedula, notas);
            } 
          registro++;
        } 
        leer.close();
    } // fin leoArchivo
    
    public static void mostrarArray(Persona arrayPersona[]) {
        
        boolean bandera1 = true, bandera2 = true, titulo = true;
        int profesores = 0, estudiantes = 0;
        
        for (Persona persona : arrayPersona) {
            
            if (persona instanceof Estudiante && titulo) {
                System.out.printf("\t_____Alumnos_____ \n\t%s %10s %35s %7s\n", 
                    "Nombre", "Cedula", "____________Notas____________", "Prom");
                persona.mostrarDatos(); 
                titulo = false;
            } else if (persona instanceof Profesor) {
                titulo = true;
            }
            
            persona.mostrarDatos();
            
            if ((bandera1) && (persona instanceof Profesor)) {
                profesores = persona.getcantidad();
                bandera1 = false;
            }
            
            if ((bandera2) && (persona instanceof Estudiante)) {
                estudiantes = persona.getcantidad();
                bandera2 = false;                
            } 
        }
        
        System.out.printf("\n\tEl total de docentes es: %d \n", profesores);
        System.out.printf("\tEl total de docentes es: %d \n", estudiantes);
    } // fin mostrarArray
    
} // fin clase Support
