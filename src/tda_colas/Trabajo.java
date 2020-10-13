package tda_colas;

public class Trabajo {
    
    private String autor;
    private String titulo;
    private boolean impreso;

    public Trabajo(String autor, String titulo, boolean impreso) {
        this.autor = autor;
        this.titulo = titulo;
        this.impreso = impreso;
    }

    public String getAutor() { return autor; }

    public String getTitulo() { return titulo; }

    public boolean isImpreso() { return impreso; }

    public void setAutor(String autor) { this.autor = autor; }

    public void setTitulo(String titulo) { this.titulo = titulo; }

    public void setImpreso(boolean impreso) { this.impreso = impreso; }
    
    @Override
    public String toString() {
        return String.format("Autor: %-10s Titulo: %-10s Impreso: %-10s", 
            this.autor, this.titulo, this.impreso);
    }    
} // fin clase Trabajo
