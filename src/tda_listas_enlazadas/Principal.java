
package tda_listas_enlazadas;

public class Principal {

    public static void main(String[] args) {        
         
        Libro libro1, libro2, libro3, libro4, libro5;
        
        libro1 = new Libro("El Arte de la Guerra", "Zun tzu", "AFCDA");
        libro2 = new Libro("Padre rico", "Robert Kiyosaki", "AMSKAD");
        libro3 = new Libro("1984", "Jorge Orwell", "MSKMAS");
        libro4 = new Libro("Cien years de soledad", "Garcia Marquez", "ALSMLASM");
        libro5 = new Libro("Ejercicios de Calculo", "Prof Demidovich", "AHSGAH");
        
        ListaEnlazada lista1 = new ListaEnlazada();
        
        lista1.insertarPrincipio(libro1);
        lista1.insertarPrincipio(libro2);        
        lista1.insertarPrincipio(libro3);
        lista1.insertarFinal(libro4);
        lista1.insertarFinal(libro5);
        
        lista1.mostrarLista();
        System.out.printf("La lista cuenta con %d elementos. \n", lista1.contarLongitud());
        
        System.out.println("");
        lista1.eliminarPrincipio();
        
        lista1.mostrarLista();
        System.out.printf("La lista cuenta con %d elementos. \n", lista1.contarLongitud());
        
        System.out.println("");
        Libro titulo = lista1.obtener(2);
        System.out.println(titulo);
        
    } // fin main()
    
} // fin clase Principal
