
package recursividad;

public class Backtracking_2 {

    public static void main(String[] args) {
        /* 
            23. Dado un valor y 3 dados, queremos sacar todas las combinaciones 
            que superen a ese valor dado
        */
        int dados[] = {1, 1, 1};
        int valorSuperar = 15;
        tiradas(dados, valorSuperar, 0, 0);
    }
    
    public static void tiradas(int dados[], int valorSuperar, int suma, int tirada) {
        if (tirada == dados.length && suma >= valorSuperar) {
            for (int i=0; i<dados.length; i++) {
                if (i == 0) {
                    System.out.print(dados[i] + "+");
                } else if (i == dados.length - 1) {
                    System.out.print(dados[i]);
                } else {
                    System.out.print(dados[i] + "+");
                }
            }
            System.out.println("=" + suma);
        } else if(tirada != dados.length) {
            for (int i=1; i<=6; i++) {
                dados[tirada] = i;
                suma += i;
                tiradas(dados, valorSuperar, suma, tirada + 1);
                suma -= i;
            }
        }
    }    
}
