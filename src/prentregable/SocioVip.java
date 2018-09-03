package prentregable;

public class SocioVip extends Socio {
    private Integer valorCuota;

    public SocioVip(Integer id, String nombre, String apellido, Integer valorCuota) {
        super(id, nombre, apellido);
        this.valorCuota = valorCuota;
        ejemplarRetirado.setCanMax(15);
    }

    public Integer getValorCuota() {
        return valorCuota;
    }

    public void setValorCuota(Integer valorCuota) {
        this.valorCuota = valorCuota;
    }
}
