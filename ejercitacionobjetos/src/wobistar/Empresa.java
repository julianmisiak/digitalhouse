package wobistar;

import java.util.Date;

public class Empresa extends Cliente {
    private Integer cuit;
    private String nombre;

    public Empresa(Integer numero, Date ingerso, Integer cuit, String nombre) {
        super(numero, ingerso);
        this.cuit = cuit;
        this.nombre = nombre;
    }

    public Integer getCuit() {
        return cuit;
    }

    public void setCuit(Integer cuit) {
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
