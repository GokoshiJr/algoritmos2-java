package tda_pilas;

public class Principal {

    public static void main(String[] args) {
        
        URL gitHub, google, youtube, discord;
        
        gitHub = new URL("http://www.github.com");
        google = new URL("http://www.google.com");
        youtube = new URL("http://www.yotube.com");
        discord = new URL("http://www.discord.com");
        
        Pila pila1 = new Pila();
        
        pila1.mostrarPila();
        
        pila1.apilar(google);        
        pila1.apilar(gitHub);        
        
        pila1.mostrarPila();
        
        pila1.apilar(youtube);
        pila1.mostrarPila();
        
        pila1.desapilar();
        pila1.mostrarPila();
        
        pila1.apilar(discord);
        pila1.mostrarPila();
        
        System.out.println(String.format("La pila tiene %d elementos", pila1.longitud()));
        
        URL cache = pila1.obtener();
        
        System.out.println("Cache: " + cache);
        
    }
    
    private static void imprimirPila(Pila pila) {
        if (pila.vacia()) {
            System.out.println("L = 0 No hay nada en la pila");
        } else {
            System.out.println(String.format("L = %d %s", pila.longitud(), pila.obtener().getUrl()));
        }
    }
}
