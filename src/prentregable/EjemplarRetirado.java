package prentregable;

import java.util.ArrayList;
import java.util.List;

public class EjemplarRetirado  {
    private Integer canMax;
    private List<Ejemplar> ejemplares = new ArrayList<>();

    public EjemplarRetirado(Integer canMax) {
        this.canMax = canMax;
    }

    public Integer getCanMax() {
        return canMax;
    }

    public void setCanMax(Integer canMax) {
        this.canMax = canMax;
    }

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(List<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }
}
