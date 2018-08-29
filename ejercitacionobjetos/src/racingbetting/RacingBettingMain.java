package racingbetting;

import lobotowallstreet.Accion;
import lobotowallstreet.Lobito;

public class RacingBettingMain {
    public static void main(String[] args) {
        Apostador apostador = new Apostador();
        Kronica kronica = new Kronica();
        CorredorApuesta corredorApuesta = new CorredorApuesta(50.3);

        Carrera carrera = new Carrera();
        carrera.agregarPosicion("El Toto");
        carrera.agregarPosicion("La Porota");
        carrera.agregarSuscriptor(apostador);
        carrera.agregarSuscriptor(kronica);
        carrera.agregarSuscriptor(corredorApuesta);

        Quini5 quini5 = new Quini5();
        quini5.agregarResultado(1);
        quini5.agregarResultado(34);
        quini5.agregarResultado(39);

        quini5.agregarSuscriptor(apostador);
        quini5.agregarSuscriptor(kronica);
        quini5.agregarSuscriptor(corredorApuesta);

        carrera.alertar();
        quini5.alertar();


    }
}
