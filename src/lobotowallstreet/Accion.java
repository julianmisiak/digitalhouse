package lobotowallstreet;

public class Accion extends InstrumentoFinanciero {


    public Accion(Double precio) {
        super(precio);
    }

    @Override
    public void alertar() {
        for (Alertable alertable : getAlertables()){
            alertable.recibirMsj(this);
        }
    }

    @Override
    public void aumentarValorDeAccion(Double porcentaje) {
        precio+= precio*porcentaje;
        modificarPrecio(precio);
    }

    @Override
    public void disminuirValorDeAccion(Double porcentaje) {
        precio-= precio*porcentaje;
        modificarPrecio(precio);
    }

//    @Override
//    public void modificarPrecio(Double precio){
//        super.modificarPrecio(precio);
//        alertar();
//    }
}
