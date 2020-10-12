
package tda_listas_enlazadas;

public class Libro {
    
    private String titulo;
    private String autor;
    private String isbn;

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getTitulo() { return titulo; }

    public String getAutor() { return autor; }

    public String getIsbn() { return isbn; }

    public void setTitulo(String titulo) { this.titulo = titulo; }

    public void setAutor(String autor) { this.autor = autor; }

    public void setIsbn(String isbn) { this.isbn = isbn; }
    
    @Override
    public String toString() {         
        return String.format("Autor: %-20s Titulo: %-30s ISBN: %-20s", this.autor, this.titulo, this.isbn);
    }
    
}
