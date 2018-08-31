package digitalhospital;

import java.util.ArrayList;
import java.util.List;

public abstract class Medidor {
   private List<Alertable> alertables = new ArrayList<>();

    public void agregarMedico(Alertable alertable){
        alertables.add(alertable);
    }

    public abstract void alertar();

    protected List<Alertable> getAlertables() {
        return alertables;
    }
}
