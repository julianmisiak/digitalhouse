package prentregable;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<Libro> libros = new ArrayList<>();
    List<Socio> socios = new ArrayList<>();
    List<Prestamo> prestamos = new ArrayList<>();

    public Libro getLibroPorISBN(Integer isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn))
                return libro;
        }
        return null;
    }

    public Socio getSocioPorNroId(Integer numeroDeIdentificacion) {
        for (Socio socio : socios) {
            if (socio.getId().equals(numeroDeIdentificacion))
                return socio;
        }
        return null;
    }

    public void prestar(Integer isbn, Integer numeroDeIdentificacion) {
        Libro libro = getLibroPorISBN(isbn);
        Socio socio = getSocioPorNroId(numeroDeIdentificacion);

        if (libro != null && libro.tieneEjemplaresDisponibles() && socio != null && socio.tieneCupoDisponible()) {
            Ejemplar ejemplar = libro.prestarEjemplar();
            socio.tomarPrestadoUnEjemplar(ejemplar);
            Prestamo prestamo = new Prestamo(ejemplar, socio);
            System.out.println(prestamo.toString());
        }
    }

    public void devolver(List<Ejemplar> ejemplares, Integer unNumeroDeIdentificacion) {
        Socio socio = getSocioPorNroId(unNumeroDeIdentificacion);
        if (socio == null) {
            System.out.println("Número de socio incorrecto");
            return;
        }

        System.out.println("\nDevolución de ejemplares\n**************************");
        for (Ejemplar ejemplar : ejemplares) {
            ejemplar.getLibro().reingresarEjemplar(ejemplar);
            System.out.println("Nombre: " + ejemplar.getLibro().getNombre());
            System.out.println("Autor: " + ejemplar.getLibro().getAutor());
            System.out.println("Ubicación del ejemplar: " + ejemplar.getUbicacion() + "\n");
        }
        socio.getEjemplarRetirado().getEjemplares().remove(ejemplares);
    }


    public void prestar(List<Integer> unaListaDeISBN, Integer unNumeroDeIdentificacion) {
        System.out.println("\nPrestamo de ejemplares\n**************************");
        Socio socio = getSocioPorNroId(unNumeroDeIdentificacion);
        if (socio == null) {
            System.out.println("El número de identificación '" + unNumeroDeIdentificacion + "' es incorrecto");
            return;
        }
        if (!socio.tieneCupoDisponible()) {
            System.out.println("El socio no tiene cupo para retirar un ejemplar");
            return;
        }

        for (Integer isbn : unaListaDeISBN) {
            Libro libro = getLibroPorISBN(isbn);
            if (libro == null) {
                System.out.println("El código isbn '" + isbn + "' es incorrecto");
                return;
            }
            if (!libro.tieneEjemplaresDisponibles()) {
                System.out.println("No hay ejemplares disponibles");
                return;
            }

            Ejemplar ejemplar = libro.getEjemplar();
            // no se valida que el ejemplar esté diponible, deo que se valido en las líneas anteriores
            socio.tomarPrestadoUnEjemplar(ejemplar);
            Prestamo prestamo = new Prestamo(ejemplar, socio);
            prestamos.add(prestamo);

            ejemplar.getLibro().reingresarEjemplar(ejemplar);
            System.out.println("Nombre: " + ejemplar.getLibro().getNombre());
            System.out.println("Autor: " + ejemplar.getLibro().getAutor());
            System.out.println("Ubicación del ejemplar: " + ejemplar.getUbicacion() + "\n");
        }
    }


    public List<Libro> getLibros() {
        return libros;
    }

    public List<Socio> getSocios() {
        return socios;
    }

}
