package racingbetting;

import java.util.ArrayList;
import java.util.List;

public class Carrera extends  Juego{
    private List<String> posiciones = new ArrayList<>();

    public void agregarPosicion(String nombreCaballo){
        posiciones.add(nombreCaballo);
    }

}
