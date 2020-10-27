
package p_dinamica_becas;

public class Principal {

    public static void main(String[] args) {
        /*
            24. Tenemos un becario que quiere escoger varias becas que tienen
            un mes de inicio y un mes de fin
        
            Cada mes cada beca genera una cantidad de dinero
        
            Tenemos que encontrar la mejor combinacion de becas, teniendo en cuenta
            de que no puede simultanear mas de una beca, por lo que hasta que no
            acabe una beca, no se puede empezar con la siguiente
        */
        Beca becas[] = {
            new Beca(1, 5, 250),
            new Beca(6, 12, 100),
            new Beca(5, 8, 350),
            new Beca(3, 6, 400)
        };
        
        Beca becasSolucion[] = new Beca[becas.length];
        Beca becasUsadas[] = new Beca[becas.length];
        mejorBecas(becas, becasSolucion, becasUsadas, 0);
        
        for (Beca solucion : becasSolucion) {
            if (solucion != null) System.out.println(solucion);
        }
        
        System.out.println("Beneficion Total: " + sumaBeca(becasSolucion));
    }
    
    public static void mejorBecas(Beca becas[], Beca solucion[], Beca becasUsadas[], int etapa) {
        if (etapa == becas.length - 1) {
            int gananciaBecasUsadas = sumaBeca(becasUsadas);
            int gananciaSolucion = sumaBeca(solucion);
            if (gananciaBecasUsadas > gananciaSolucion) {
                for (int i=0; i<becasUsadas.length; i++) {
                    solucion[i] = becasUsadas[i];
                }
            }
        } else {
            for (int i=0; i<becas.length; i++) {
                if (esValida(becasUsadas, becas[i])) {
                    becasUsadas[etapa] = becas[i];
                    mejorBecas(becas, solucion, becasUsadas, etapa + 1);
                    becasUsadas[etapa] = null;
                } else {
                    mejorBecas(becas, solucion, becasUsadas, etapa + 1);
                }
            }
        }
    }
    
    public static boolean esValida(Beca becasUsadas[], Beca b) {
        boolean correcto = true;
        for (Beca bUsada : becasUsadas) {
            if (bUsada != null && !bUsada.compatible(b)) {
                correcto = false;
            }
        }
        return correcto;
    }
    
    public static int sumaBeca(Beca becas[]) {
        int suma = 0;
        for (Beca b : becas) {
            if (b != null) suma += b.precioBeca();
        }
        return suma;
    }
}
