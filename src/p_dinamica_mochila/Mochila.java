
package p_dinamica_mochila;

public class Mochila {
    
    private int pesoMaximo;
    private Elemento[] elementos;
    private int peso, beneficio;

    public Mochila(int pesoMaximo, int numElementos) {
        this.pesoMaximo = pesoMaximo;
        this.elementos = new Elemento[numElementos];
        this.peso = 0;
        this.beneficio = 0;
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }

    public Elemento[] getElementos() {
        return elementos;
    }

    public int getPeso() {
        return peso;
    }

    public int getBeneficio() {
        return beneficio;
    }

    public void setPesoMaximo(int pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public void setElementos(Elemento[] elementos) {
        this.elementos = elementos;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setBeneficio(int beneficio) {
        this.beneficio = beneficio;
    }
    
    public void agregarElemento(Elemento elemento) {
        for (int i=0; i<this.elementos.length; i++) {
            if (this.elementos[i] == null) {
                this.elementos[i] = elemento;
                this.beneficio += elemento.getBeneficio();
                this.peso += elemento.getPeso();
                break;
            }
        }
    } 
    
    public void limpiar() {
        this.peso = 0;
        this.beneficio = 0;
        for (int i=0; i<this.elementos.length; i++) {
            this.elementos[i] = null;
        }
    }
    
    public void eliminarElemento(Elemento elemento) {
        for (int i=0; i<this.elementos.length; i++) {
            if (this.elementos[i].equals(elemento)) {
                this.elementos[i] = null;
                this.beneficio -= elemento.getBeneficio();
                this.peso -= elemento.getPeso();
                break;
            }
        }
    }
    
    public boolean existeElemento(Elemento elemento) {
        for (int i=0; i<this.elementos.length; i++) {
            if (this.elementos[i] != null && this.elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        String cadena = "";
        for (int i=0; i<this.elementos.length; i++) {
            if (this.elementos[i] != null) {
                cadena += elementos[i] + "\n";
            }
        }
        cadena += "Peso=" + getPeso() + "\n";
        cadena += "Beneficio=" + getBeneficio() + "\n";
        return cadena;
    }
}
