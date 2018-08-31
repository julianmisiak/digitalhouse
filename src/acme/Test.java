package acme;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        AutoCombi combi = new AutoCombi(6);
        AutoCombi autoDePepe = new AutoCombi(4);
        Micro microOtto = new Micro(5, 5);

        Pasajero pasajero = new Pasajero(1, Boolean.FALSE);
        Pasajero pepo = new Pasajero(2, Boolean.TRUE);
        Pasajero micky = new Pasajero(3, Boolean.FALSE);
        Pasajero titi = new Pasajero(4, Boolean.TRUE);
        Pasajero toto = new Pasajero(5, Boolean.TRUE);
        Pasajero raul = new Pasajero(6, Boolean.TRUE);
        Pasajero josefina = new Pasajero(7, Boolean.FALSE);
        Pasajero pipi = new Pasajero(8, Boolean.TRUE);
        Pasajero pipi2 = new Pasajero(9, Boolean.TRUE);
        Pasajero pipi3 = new Pasajero(10, Boolean.TRUE);
        Pasajero pipi4 = new Pasajero(11, Boolean.TRUE);
        Pasajero pipi5 = new Pasajero(12, Boolean.TRUE);

        List<Pasajero> listaPasajero = new ArrayList<Pasajero>();
        listaPasajero.add(pasajero);
        listaPasajero.add(pepo);
        listaPasajero.add(micky);
        listaPasajero.add(titi);
        listaPasajero.add(toto);
        listaPasajero.add(raul);
        listaPasajero.add(josefina);
        listaPasajero.add(pipi);


        /* Subir un pasajero a un vehículo, teniendo en cuenta la preferencia del pasajero. Si el
        pasajero desea ir sentado, no se podrá subir a un vehículo que no tenga asientos
        disponibles. En caso de que no tenga preferencia, podrá ir parado. Se debe informar
        por pantalla el resultado de la operación */


        microOtto.asignarAsiento(pasajero);
        microOtto.asignarAsiento(pepo);
        microOtto.asignarAsiento(micky);
        microOtto.asignarAsiento(titi);
        microOtto.asignarAsiento(toto);
        microOtto.asignarAsiento(raul);
        microOtto.asignarAsiento(josefina);
        microOtto.asignarAsiento(pipi);
        microOtto.asignarAsiento(pipi2);
        microOtto.asignarAsiento(pipi3);
        microOtto.asignarAsiento(pipi4);

        /* Bajar un pasajero de un vehículo. Se debe informar por pantalla si el vehículo no
        tiene pasajeros.*/
        microOtto.bajarPasajero();
        microOtto.bajarPasajero();
        microOtto.bajarPasajero();
        microOtto.bajarPasajero();
        microOtto.bajarPasajero();
        microOtto.bajarPasajero();
        microOtto.bajarPasajero();


        for(Pasajero p : listaPasajero){
            microOtto.asignarAsiento(p);
        }
    }
}
