package digitalhospital.com.digitalhouse.acme;

import java.util.ArrayList;
import java.util.List;

public class Micro extends Vehiculo {
    private Integer disponibilidadParado;
    private List<Pasajero> pasajerosParados;

    public Micro(Integer disponibilidadAsientos, Integer disponibilidadParado) {
        super(disponibilidadAsientos);
        this.disponibilidadParado = disponibilidadParado;
        pasajerosParados = new ArrayList<>();
    }

    @Override
    public void asignarAsiento(Pasajero pasajero) {
        if (pasajero.getPrefiereIrSentado() || pasajeros.size() < disponibilidadAsientos) {
            super.asignarAsiento(pasajero);
        } else {

            if (pasajerosParados.size() < disponibilidadParado) {
                pasajerosParados.add(pasajero);
                System.out.println("El pasajero " + pasajero.getDni() + " fue asignado al vehículo pero está va parado");
            } else {
                System.out.println("No hay disponibilidad en el vehículo");
            }
        }
    }

    public void bajarPasajero() {
        if (!pasajerosParados.isEmpty()) {
            pasajerosParados.remove(pasajerosParados.size() - 1);
        } else {
            super.bajarPasajero();
        }
    }
}
