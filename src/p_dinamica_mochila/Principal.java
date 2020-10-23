package p_dinamica_mochila;

/*
    BackTracking
    
    Queremos meter elementos en una mochila con un peso maximo, estos
    elementos tienen un peso y un beneficio

    Obtener la mejor combinacion que mas beneficio nos dé y que no
    sobrepase el peso de la mochila
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Elemento elementos[] = {
            // Peso Kg - Beneficio $
            new Elemento(1, 1),
            new Elemento(2, 2),
            new Elemento(4, 10),
            new Elemento(1, 2),
            new Elemento(12, 15)
        };
        
        Mochila mochilaBase = new Mochila(15, elementos.length);
        Mochila mochilaOptima = new Mochila(15, elementos.length);
        
        llenarMochila(mochilaBase, mochilaOptima, elementos, false);
        
        System.out.println(mochilaOptima);
    }
    
    public static void llenarMochila(Mochila mochilaBase, Mochila mochilaOptima, Elemento elementos[], boolean lleno) {
        if (lleno) {
            if (mochilaBase.getBeneficio() > mochilaOptima.getBeneficio()) {
                Elemento elementosMochilaBase[] = mochilaBase.getElementos();
                mochilaOptima.limpiar();
                for (Elemento e : elementosMochilaBase) {
                    if (e != null) {
                        mochilaOptima.agregarElemento(e);
                    }
                }
            }
        } else {
            for (int i = 0; i < elementos.length; i++) {
                if (!mochilaBase.existeElemento(elementos[i])) {
                    if (mochilaBase.getPesoMaximo() > (mochilaBase.getPeso() + elementos[i].getPeso())) {
                        mochilaBase.agregarElemento(elementos[i]);
                        llenarMochila(mochilaBase, mochilaOptima, elementos, false);
                        mochilaBase.eliminarElemento(elementos[i]);
                    } else {
                        llenarMochila(mochilaBase, mochilaOptima, elementos, true);
                    }
                }
            }
        }
    }
}
