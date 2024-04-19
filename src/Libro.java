public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private String editorial;
    private int anoPublicacion;
    private double precio;

    public Libro(String titulo, String autor, String isbn, String editorial, int anoPublicacion, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.editorial = editorial;
        this.anoPublicacion = anoPublicacion;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", editorial='" + editorial + '\'' +
                ", anoPublicacion=" + anoPublicacion +
                ", precio=" + precio +
                '}';
    }

}