package racingbetting;

public class CorredorApuesta extends Interesado {
    private Double patrimonio;

    public CorredorApuesta(Double patrimonio) {
        this.patrimonio = patrimonio;
    }

    @Override
    public void recibirMensaje(Juego juego){
        patrimonio+= 1000;
    }


}
