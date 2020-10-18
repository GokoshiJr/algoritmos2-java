package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions_3 {

    public static void main(String[] args) {
        /* 
            Excepciones No Comprobadas
        
            Mala practica, lanzar una excepcion cuando es no comprobada 
            y capturarla con un try-catch, por que se supone que deberiamos 
            mejorar el codigo para que la excepcion no ocurra en lugar
            de capturarla.
        
            No es recomendable, pero en algunos casos puede ser un recurso.
        
            Al ser no comprobada, no te obliga a implementar el try-catch
        
            No lanzar excepciones que el metodo nunca lanzaria, ej que menu()
            Lance una IOException, cuando en realidad no estamos accediendo
            a ficheros externos.
        */
        boolean salir = true;
        while(salir) {
            try {
                int opc = 0;
                opc = menu();
                switch(opc) {
                    case 1: 
                        pedirDatos();
                        break;
                    case 2:
                        salir = false;
                        break;
                    default:
                        System.out.println("\t Opcion incorrecta");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("\t Entrada inesperada.");
            }
        }
    } // fin main()
    
    public static int menu() throws InputMismatchException {
        Scanner teclado = new Scanner(System.in);
        int opc = 0;
        System.out.printf("\t 1) Introducir Datos \n \t 2) Salir \n \t opc: ");
        opc = teclado.nextInt();
        return opc;
    } // fin menu()
    
    public static void pedirDatos() throws InputMismatchException {
        Scanner teclado = new Scanner(System.in);
        String nombre = "";
        int edad = 0;
        System.out.print("\n\t Nombre: ");
        nombre = teclado.next();
        System.out.print("\t Edad: ");
        edad = teclado.nextInt();
        System.out.printf("\t Bienvenido %s, con %d de edad. \n\n", nombre, edad);
    } // fin mostrarDatos()
} // fin clase Exceptions_3
