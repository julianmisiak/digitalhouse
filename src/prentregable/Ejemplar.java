package prentregable;

import java.util.Objects;

public class Ejemplar {
    private Libro libro;
    private Integer nroEdicion;
    private String ubicacion;

    public Ejemplar(Libro libro, Integer nroEdicion, String ubicacion) {
        this.libro = libro;
        this.nroEdicion = nroEdicion;
        this.ubicacion = ubicacion;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Integer getNroEdicion() {
        return nroEdicion;
    }

    public void setNroEdicion(Integer nroEdicion) {
        this.nroEdicion = nroEdicion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Ejemplar{" +
                "libro=" + libro +
                ", nroEdicion=" + nroEdicion +
                ", ubicacion='" + ubicacion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ejemplar ejemplar = (Ejemplar) o;
        return Objects.equals(libro, ejemplar.libro) &&
                Objects.equals(ubicacion, ejemplar.ubicacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(libro, ubicacion);
    }
}
