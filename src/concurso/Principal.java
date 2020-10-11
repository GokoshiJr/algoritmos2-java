package concurso;
import java.util.*;
import java.io.*;
public class Principal {

    public static void main(String[] args) throws IOException {
               
        ArrayList<Equipo> equipo = new ArrayList<>();
        Support.leoArchivo(equipo);
        Support.mostrarArray(equipo);
    }
    
}
