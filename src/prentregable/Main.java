package prentregable;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Socio comun = new Socio(1, "común", "Soy un tipo común");
        Socio vip = new SocioVip(2, "Tengo cintita en la muñeca", "Reservado", 25);
        biblioteca.getSocios().add(comun);
        biblioteca.getSocios().add(vip);

        Libro librito = new Libro(1, "anonimo", "No name");
        Ejemplar ejemplar1 = new Ejemplar(librito,1, "AB 23" );
        Ejemplar ejemplar2 = new Ejemplar(librito,1, "AB 22" );
        Ejemplar ejemplar3 = new Ejemplar(librito,1, "AB 24" );
        librito.agregarNuevoEjemplar(ejemplar1);
        librito.agregarNuevoEjemplar(ejemplar2);
        librito.agregarNuevoEjemplar(ejemplar3);
        biblioteca.getLibros().add(librito);

        Libro librito2 = new Libro(2, "anonimo2", "No name2");
        Ejemplar ejemplar21 = new Ejemplar(librito2,1, "AB 23" );
        Ejemplar ejemplar22 = new Ejemplar(librito2,1, "AB 22" );
        Ejemplar ejemplar23 = new Ejemplar(librito2,1, "AB 24" );
        librito2.agregarNuevoEjemplar(ejemplar21);
        librito2.agregarNuevoEjemplar(ejemplar22);
        librito2.agregarNuevoEjemplar(ejemplar23);
        biblioteca.getLibros().add(librito2);

        Libro librito3 = new Libro(3, "Arturito 2", "Armando barrera");
        Ejemplar ejemplar31 = new Ejemplar(librito3,1, "BB 23" );
        Ejemplar ejemplar32 = new Ejemplar(librito3,1, "BB 22" );
        librito3.agregarNuevoEjemplar(ejemplar31);
        librito3.agregarNuevoEjemplar(ejemplar32);
        biblioteca.getLibros().add(librito3);

        biblioteca.prestar(1,  2);
        biblioteca.prestar(1,  2);

        biblioteca.devolver(vip.ejemplarRetirado.getEjemplares(), 2);

        List<Integer> isbnList = new ArrayList<>();
        isbnList.add(1);
        isbnList.add(3);
        biblioteca.prestar(isbnList, comun.getId());
        biblioteca.prestar(isbnList, comun.getId());
    }

}
