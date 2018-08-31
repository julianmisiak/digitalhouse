package digitalhospital;

public class Medico implements Alertable {
   private Integer id;
   private String apyn;

    public Medico(Integer id, String apyn) {
        this.id = id;
        this.apyn = apyn;
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println("Soy el médico: " + apyn  + "  el mensaje: "+ mensaje);
    }
}
