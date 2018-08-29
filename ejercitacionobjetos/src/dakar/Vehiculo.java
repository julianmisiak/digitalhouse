package dakar;

import java.util.Objects;

public abstract class Vehiculo {
    protected Double Velocidad;
    protected Double aceleracion;
    protected Double giro;
    protected String patente;
    protected Double peso;
    protected Integer cantRuedas;

    public Vehiculo(Double velocidad, Double aceleracion, Double giro, String patente, Double peso, Integer cantRuedas) {
        Velocidad = velocidad;
        this.aceleracion = aceleracion;
        this.giro = giro;
        this.patente = patente;
        this.peso = peso;
        this.cantRuedas = cantRuedas;
    }


    public Double getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(Double velocidad) {
        Velocidad = velocidad;
    }

    public Double getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(Double aceleracion) {
        this.aceleracion = aceleracion;
    }

    public Double getGiro() {
        return giro;
    }

    public void setGiro(Double giro) {
        this.giro = giro;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Integer getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(Integer cantRuedas) {
        this.cantRuedas = cantRuedas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        Vehiculo vehiculo = (Vehiculo) o;
        return this.patente.toLowerCase().equals(vehiculo.patente.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(patente);
    }
}
