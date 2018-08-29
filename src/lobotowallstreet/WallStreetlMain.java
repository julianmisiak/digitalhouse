package lobotowallstreet;

import digitalhospital.ActividadCerebral;
import digitalhospital.Medico;
import digitalhospital.Oxigeno;

public class WallStreetlMain {
    public static void main(String[] args) {
        Lobito lobito1 = new Lobito(1, "lobo Esta 1");
        Lobito lobito2 = new Lobito(2, "Lobo Esta 2");

        Accion accion = new Accion(25.3);

        accion.agregarSuscriptor(lobito1);
        accion.agregarSuscriptor(lobito2);

        accion.modificarPrecio(25.0);


    }
}
