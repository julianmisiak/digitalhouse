package prentregable;

import java.util.Date;

public class Prestamo {
    private Ejemplar ejemplar;
    private Socio socio;
    private Date fechaRegistro;

    public Prestamo(Ejemplar ejemplar, Socio socio) {
        this.ejemplar = ejemplar;
        this.socio = socio;
        this.fechaRegistro = new Date();
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "ejemplar=" + ejemplar.toString() +
                ", socio=" + socio.toString() +
                ", fechaRegistro=" + fechaRegistro.toString() +
                '}';
    }
}
