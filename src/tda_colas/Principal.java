package tda_colas;

public class Principal {

    public static void main(String[] args) {
        
        Trabajo trabajo1, trabajo2, trabajo3;
        
        trabajo1 = new Trabajo("Julio", "Examen 1", true);
        trabajo2 = new Trabajo("Andres", "Compras", false);
        trabajo3 = new Trabajo("Maria", "Plasti", true);
        
        MiColaProceso cola1 = new MiColaProceso();
        
        cola1.encolar(trabajo2);
        cola1.encolar(trabajo1);
        cola1.encolar(trabajo3);
        
        cola1.mostrarCola();
        System.out.printf("Hay %d elementos en la cola. \n", cola1.longitudCola());   
        System.out.println("");
        
        cola1.eliminar();
        cola1.mostrarCola();
        System.out.printf("Hay %d elementos en la cola. \n", cola1.longitudCola());         
    } // fin main()
} // fin clase Principal
