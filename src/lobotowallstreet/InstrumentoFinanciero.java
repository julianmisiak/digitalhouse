package lobotowallstreet;

import java.util.ArrayList;
import java.util.List;

public abstract class  InstrumentoFinanciero {
    private List<Alertable> alertables = new ArrayList<>();
    protected Double precio;

    public InstrumentoFinanciero(Double precio) {
        this.precio = precio;
    }

    public void agregarSuscriptor(Alertable alertable){
        alertables.add(alertable);
    }

    public abstract void alertar();

    public List<Alertable> getAlertables() {
        return alertables;
    }

    public void modificarPrecio(Double precio){
        this.precio = precio;
        alertar();
    }

    public Double getPrecio() {
        return precio;
    }

    public abstract void aumentarValorDeAccion(Double porcentaje);
    public abstract void disminuirValorDeAccion(Double porcentaje);

}
