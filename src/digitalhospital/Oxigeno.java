package digitalhospital;

public class Oxigeno extends Medidor {
    @Override
    public void alertar() {
        for(Alertable alertable: getAlertables()){
            alertable.recibir(this.getClass().getName());
        }
    }
}
