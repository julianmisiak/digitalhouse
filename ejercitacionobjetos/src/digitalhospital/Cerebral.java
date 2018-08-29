package digitalhospital;

import java.util.ArrayList;
import java.util.List;

public class Cerebral extends Medidor {
    @Override
    public String alertar() {
       return ("Soy: " + this.getClass().getName());
    }
}
