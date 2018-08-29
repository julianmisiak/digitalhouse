package racingbetting;

import java.util.ArrayList;
import java.util.List;

public abstract class Juego {
    protected  List<Alertable> alertables = new ArrayList<>();

    public void agregarSuscriptor(Alertable alertable){
        alertables.add(alertable);
    }


    public void alertar(){
        for (Alertable alertable : alertables){
            alertable.recibirMensaje(this);
        }
    }
}
