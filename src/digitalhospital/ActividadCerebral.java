package digitalhospital;

public class ActividadCerebral extends Medidor {
    @Override
    public void alertar() {
        for(Alertable alertable: getAlertables()){
            alertable.recibir(this.getClass().getName());
        }
    }
}
