package digitalhospital.com.digitalhouse.acme;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo {

    protected Integer disponibilidadAsientos;
    protected List<Pasajero> pasajeros;

    public Vehiculo(Integer disponibilidadAsientos) {
        this.disponibilidadAsientos = disponibilidadAsientos;
        pasajeros = new ArrayList<>();
    }

    public Integer getDisponibilidadAsientos() {
        return disponibilidadAsientos;
    }

    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void asignarAsiento(Pasajero pasajero){
        if(pasajeros.size() < disponibilidadAsientos){
            pasajeros.add(pasajero);
            System.out.println("El pasajero " + pasajero.getDni() + " fue asignado al vehículo en un asiento");
        }else{
            System.out.println("No hay disponibilidad en el vehículo");
        }
    }

    public void bajarPasajero() {
        if (!pasajeros.isEmpty()) {
            pasajeros.remove(pasajeros.size() - 1);
        } else {
            System.out.println("el vehículo no tiene pasajeros.");
        }
    }
}
