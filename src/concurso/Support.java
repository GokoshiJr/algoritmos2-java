
package concurso;

import java.util.*;
import java.io.*;

public class Support {
    
    public static void leoArchivo(ArrayList<Equipo> arrayEquipos) throws IOException{
        
        Scanner leer = new Scanner(new File("src/concurso/Concurso.txt"));
        String nombreEquipo = "";
        Equipo equipo = null; 
                
        while(leer.hasNext()) {  
            Tiempo tiempos[] = new Tiempo[5];
            nombreEquipo = leer.next();
            for (int i=0; i < tiempos.length; i++) {                
                tiempos[i] = new Tiempo(leer.next());
            }
            equipo = new Equipo(nombreEquipo, tiempos);
            arrayEquipos.add(equipo);
        }
        leer.close();
    } // fin leoArchivo()
    
    public static void mostrarArray(ArrayList<Equipo> arrayEquipos) {
        
        boolean bandera = false;
        String ganador = "";
        Equipo team1, team2 = null;
        int menorTiempo = 0, mayorSuperadas = 0; 
        
        arrayEquipos.forEach((e) -> {
            e.mostrarDatos();
        });
        
        team1 = arrayEquipos.get(0);
        
        for (int i = 0; i < arrayEquipos.size(); i++) {
            team2 = arrayEquipos.get(i);
            if (team2.getPruebasSuperadas() > team1.getPruebasSuperadas()) {
                mayorSuperadas = team2.getPruebasSuperadas();
                team2 = team1;
            } else {
                mayorSuperadas = team1.getPruebasSuperadas();
            }
        }
                
        for (int i = 0; i < arrayEquipos.size(); i++) {
            team1 = arrayEquipos.get(i);
            if (bandera == false) {
                team2 = arrayEquipos.get(i);
                bandera = true;
            } else {
                if (team1.getPruebasSuperadas() == mayorSuperadas) {
                    if (team2.getTiempoFinalMinutos() > team1.getTiempoFinalMinutos()) {
                        ganador = team1.getNombreEquipo();
                        menorTiempo = team1.getTiempoFinalMinutos();
                        team2 = team1;
                    }
                }
            }
            
        }
        
        System.out.printf("%10s %10s %10s %10d \n","El ganador es:", ganador, "Con un tiempo de: ", menorTiempo);
        
    }
} // fin clase Support
