
package p_dinamica_mochila;

public class Elemento {
    
    private int peso, beneficio;

    public Elemento(int peso, int beneficio) {
        this.peso = peso;
        this.beneficio = beneficio;
    }

    public int getPeso() {
        return peso;
    }

    public int getBeneficio() {
        return beneficio;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setBeneficio(int beneficio) {
        this.beneficio = beneficio;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.peso;
        hash = 37 * hash + this.beneficio;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Elemento other = (Elemento) obj;
        if (this.peso != other.peso) {
            return false;
        }
        if (this.beneficio != other.beneficio) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Elemento{" + "peso=" + peso + ", beneficio=" + beneficio + '}';
    }
} // fin clase Elemento
