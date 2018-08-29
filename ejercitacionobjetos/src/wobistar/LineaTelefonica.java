package wobistar;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class LineaTelefonica {
    private Integer nroTelefono;
    private Cliente cliente;
    private Plan plan;
    private Set<Llamada> llamadas = new HashSet<>();

    public LineaTelefonica(Integer nroTelefono, Cliente cliente, Plan plan) {
        this.nroTelefono = nroTelefono;
        this.cliente = cliente;
        this.plan = plan;
    }

    public void registrarLlamada(Double duracion, Plan plan){
        Llamada llamada = new Llamada(new Date(), duracion );
        llamada.setCostoTotal(calcularCosto(duracion, plan.getCosto() ));
        llamadas.add(llamada);
    }

    private Double calcularCosto(Double duracion, Double costo){
        return duracion * costo;
    }

    public Integer getNroTelefono() {
        return nroTelefono;
    }

    public void setNroTelefono(Integer nroTelefono) {
        this.nroTelefono = nroTelefono;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public Set<Llamada> getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(Set<Llamada> llamadas) {
        this.llamadas = llamadas;
    }
}
