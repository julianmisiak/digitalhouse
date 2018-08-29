package farmatown;

import java.util.HashSet;
import java.util.Set;

public class Medicamento {
    Set<Droga> pitiAlvarez;

    public Medicamento() {
        pitiAlvarez = new HashSet<>();
    }

    public Medicamento(Set<Droga> pitiAlvarez) {
        this.pitiAlvarez = pitiAlvarez;
    }

    public void agregarDroga(Droga fafa){
        pitiAlvarez.add(fafa);
    }

    public Boolean soyAlergico(Droga droga){
        return this.pitiAlvarez.contains(droga);
    }
}
