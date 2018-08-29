package wobistar;

import java.util.Date;

public class Llamada {
    private Date fecha;
    private Double duracion;
    private Double costoTotal;

    public Llamada(Date fecha, Double duracionl) {
        this.fecha = fecha;
        this.duracion = duracion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }
}
