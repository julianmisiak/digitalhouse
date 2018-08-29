package digitalhospital;

import java.util.ArrayList;
import java.util.List;

public abstract class Medidor {
    List<Medico> medicos = new ArrayList<>();

    public void suscribirMedico(Medico medico) {
        medicos.add(medico);
    }

    public abstract String alertar();
}
