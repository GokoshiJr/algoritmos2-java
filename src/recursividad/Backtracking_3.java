
package recursividad;

public class Backtracking_3 {

    public static void main(String[] args) {
        /*  
            Backtracking
            Invirtiendo millones en un banco
        */
        int millones[] = {1, 2, 3, 4, 0};
        int bancos[][] = {
            {2, 1, 1},
            {5, 3, 4},
            {6, 6, 5},
            {7, 7, 8},
            {0, 0, 0}
        };
        
        int numMillones = 4;
        int solucion[]  = new int[bancos[0].length];
        int invertido[] = new int[bancos[0].length];
        
        mejorInversion(millones, bancos, invertido, solucion, 0, numMillones);
        
        System.out.println("Inversion Inicial = " + numMillones);
        for (int i=0; i<solucion.length; i++) {
            System.out.println(solucion[i]);
        }
        System.out.println("Ganancia Total = " + sumaGanancia(solucion));
        System.out.println("Ganancia Neta = " + (sumaGanancia(solucion) - numMillones));
    }
    
    public static void mejorInversion(int millones[], int bancos[][], int invertido[], int solucion[], int etapa, int numMillonesActuales) {
        if (etapa == bancos[0].length) {
            int sumaSolucion = sumaGanancia(solucion);
            int sumaInvertido = sumaGanancia(invertido);
            if (sumaInvertido > sumaSolucion) {
                for (int i=0; i<invertido.length; i++) {
                    solucion[i] = invertido[i];
                }
            }
        } else {
            for (int i=0; i<millones.length; i++) {
                if (numMillonesActuales - millones[i] >= 0) {
                    invertido[etapa] = bancos[i][etapa];
                    mejorInversion(millones, bancos, invertido, solucion, etapa + 1, numMillonesActuales - millones[i]);
                    invertido[etapa] = 0;
                }
            }
        }
    }
    
    public static int sumaGanancia(int inversiones[]) {
        int suma = 0;
        for (int inversion : inversiones) {
            suma += inversion;
        }
        return suma;
    }
}
