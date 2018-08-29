package wobistar;

public abstract class Plan {
    protected Double costo;

    public Plan(Double costo) {
        this.costo = costo;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }
}
