package dakar;

public class SocorristaAuto implements Socorrer {
    @Override
    public void socorrer(Vehiculo vehiculo) {
        if (vehiculo instanceof Auto) {
            System.out.println("Socorriendo auto: " + vehiculo.getPatente());
        }
    }

}
