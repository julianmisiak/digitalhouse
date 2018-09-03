package prentregable;

import java.util.Objects;

public class Socio {
    protected Integer id;
    protected String nombre;
    protected String apellido;
    protected EjemplarRetirado ejemplarRetirado;

    public Socio(Integer id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        ejemplarRetirado = new EjemplarRetirado(3);
    }

    public Boolean tieneCupoDisponible(){
        return (ejemplarRetirado.getEjemplares().size() <= ejemplarRetirado.getCanMax());
    }

    public void tomarPrestadoUnEjemplar(Ejemplar unEjemplar){
        ejemplarRetirado.getEjemplares().add(unEjemplar);
    }

    public void devolverUnEjemplar( Ejemplar unEjemplar){
        ejemplarRetirado.getEjemplares().remove(unEjemplar);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public EjemplarRetirado getEjemplarRetirado() {
        return ejemplarRetirado;
    }

    public void setEjemplarRetirado(EjemplarRetirado ejemplarRetirado) {
        this.ejemplarRetirado = ejemplarRetirado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Socio socio = (Socio) o;
        return Objects.equals(id, socio.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Socio{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", ejemplarRetirado=" + ejemplarRetirado +
                '}';
    }
}
