package com.digitalhouse.restaurante;

public abstract class Empleado {
    protected Integer cuil;
    protected String nombre;
    protected String apellido;
    protected  Integer sueldo;

    public Empleado(Integer cuil, String nombre, String apellido, Integer sueldo) {
        this.cuil = cuil;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
    }

    public Integer getCuil() {
        return cuil;
    }

    public void setCuil(Integer cuil) {
        this.cuil = cuil;
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

    public Integer getSueldo() {
        return sueldo;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }

    public Integer calcularSueldoNeto(){
        return sueldo;
    }
}
