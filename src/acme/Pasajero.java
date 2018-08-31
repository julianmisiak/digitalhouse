package acme;

public class Pasajero {
    private Integer dni;
    private Boolean prefiereIrSentado;

    public Pasajero(Integer dni, Boolean prefiereIrSentado) {
        this.dni = dni;
        this.prefiereIrSentado = prefiereIrSentado;
    }

    public Integer getDni() {
        return dni;
    }

    public Boolean getPrefiereIrSentado() {
        return prefiereIrSentado;
    }
}
