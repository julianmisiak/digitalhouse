package digitalhospital;

public class HospitalMain {
    public static void main(String[] args) {
        Medico medico = new Medico(1, "Pepe Fosfory");
        Medico medico2 = new Medico(2, "Pipo gorosito");
        Medico medico3 = new Medico(3, "Rene Favaloro");

        Oxigeno oxigeno = new Oxigeno();
        oxigeno.agregarMedico(medico);
        oxigeno.agregarMedico(medico2);

        ActividadCerebral ac = new ActividadCerebral();
        ac.agregarMedico(medico);
        ac.agregarMedico(medico3);

        oxigeno.alertar();
        ac.alertar();


    }
}
