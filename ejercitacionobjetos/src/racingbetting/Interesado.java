package racingbetting;

public class Interesado implements Alertable {
    protected String mensaje;

    @Override
    public void recibirMensaje(Juego juego) {
        System.out.println(mensaje);
    }
}
