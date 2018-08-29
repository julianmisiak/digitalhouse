package farmatown;

import java.util.Objects;

public class Droga {
    private String nombre;
    private String descripcion;

    public Droga(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public boolean equals(Object o){
        Droga droga = (Droga)o;
        return this.nombre.equals(droga.nombre);
    }


}
