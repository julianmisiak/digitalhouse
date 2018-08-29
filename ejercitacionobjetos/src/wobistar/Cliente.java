package wobistar;

import java.util.Date;

public abstract class Cliente {
    protected Integer numero;
    protected Date Ingerso;

    public Cliente(Integer numero, Date ingerso) {
        this.numero = numero;
        Ingerso = ingerso;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getIngerso() {
        return Ingerso;
    }

    public void setIngerso(Date ingerso) {
        Ingerso = ingerso;
    }
}
