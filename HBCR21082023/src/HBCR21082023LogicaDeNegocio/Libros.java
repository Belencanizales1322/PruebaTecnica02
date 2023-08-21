package HBCR21082023LogicaDeNegocio;

public class Libros {
    public int id;
    public String titulo;
    public String autor;
    public int ano_publicacion;

    public Libros() {
    }

    public Libros(int id, String titulo, String autor, int ano_publicacion) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ano_publicacion = ano_publicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno_publicacion() {
        return ano_publicacion;
    }

    public void setAno_publicacion(int ano_publicacion) {
        this.ano_publicacion = ano_publicacion;
    }
    
    
}
