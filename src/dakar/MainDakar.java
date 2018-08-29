package dakar;

import com.digitalhouse.restaurante.General;
import com.digitalhouse.restaurante.LavaVajillas;

public class MainDakar {

    public static void main(String[] args) {
        Carrera carrera = new Carrera(6000.0, 4300.18, "Carrera alma  Allá", 4);

        carrera.darDeAltaAuto(190.9, 34.5, 120.9, "AAA-222");
        carrera.darDeAltaAuto(290.9, 120.5, 180.9, "AFS-232");
        carrera.darDeAltaAuto(190.9, 20.5, 1.7, "LFS-132");

        carrera.darDeAltaMoto(90.9, 20.5, 1.7, "EFS-132");
        carrera.darDeAltaAuto(390.9, 220.5, 35.6, "YES-432");

        carrera.eliminarVehiculoConPatente("AFS-232");

        carrera.darDeAltaAuto(390.9, 220.5, 35.6, "YES-432");
        System.out.println("The Win is: " + carrera.determinarGanador());

        carrera.socorrerAuto("YES-432");


    }
}
