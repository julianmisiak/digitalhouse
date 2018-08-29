package digitalhospital;

import java.util.ArrayList;
import java.util.List;

public class Medico implements Profesional {
    private Integer id;
    private String nombre;
    private String apellido;
    List <Medidor> medidores = new ArrayList<>();

    public Medico(Integer id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void susscribirMedidor(Medidor medidor){
        medidor.suscribirMedico(this);
    }


    public Medico(Integer id, String nombre, String apellido, List<Medidor> medidores) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.medidores = medidores;
    }

    @Override
    public void recibirMensaje(Medidor medidor) {

    }
}
