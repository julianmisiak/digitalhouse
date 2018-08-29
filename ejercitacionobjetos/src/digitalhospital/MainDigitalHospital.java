package digitalhospital;

import farmatown.Droga;
import farmatown.Medicamento;

import java.util.HashMap;
import java.util.Map;

public class MainDigitalHospital {
    public static void main(String[] args) {
        Medico m = new Medico(1, "A", "a");
        Medico m1 = new Medico(2, "b", "b");
        Medico m2 = new Medico(3, "c", "c");
        Medico m3 = new Medico(4, "d", "d");

        Pulso pulso = new Pulso();
        Oxigeno o = new Oxigeno();
        Cerebral c = new Cerebral();

        pulso.suscribirMedico(m);
        pulso.suscribirMedico(m1);

        o.suscribirMedico(m1);
        m1.susscribirMedidor(o);


    }
}
