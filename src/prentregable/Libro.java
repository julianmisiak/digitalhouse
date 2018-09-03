package prentregable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Libro {
    private Integer isbn;
    private String nombre;
    private String autor;
    private List<Ejemplar> ejemplares = new ArrayList<>();

    public Libro(Integer isbn, String nombre, String autor) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.autor = autor;
    }

    public void agregarNuevoEjemplar(Ejemplar ejemplar) {
        ejemplares.add(ejemplar);
    }

    public Boolean tieneEjemplaresDisponibles() {
        return !ejemplares.isEmpty();
    }

    public Ejemplar prestarEjemplar() {
        Ejemplar ejemplar = null;
        if (tieneEjemplaresDisponibles()) {
            ejemplar = ejemplares.get(0);
            ejemplares.remove(ejemplar);
        }
        return ejemplar;
    }

    public void reingresarEjemplar(Ejemplar ejemplar) {
        ejemplares.add(ejemplar);
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Ejemplar getEjemplar() {
        Ejemplar ejemplar = ejemplares.get(0);
        if (ejemplar == null) {
            return null;
        }
        ejemplares.remove(ejemplar);
        return ejemplar;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(isbn, libro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

}
