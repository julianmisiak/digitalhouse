package dakar;

public class SocorristaMoto  implements Socorrer {

    @Override
    public void socorrer(Vehiculo vehiculo) {
        if(vehiculo!= null && vehiculo instanceof Moto) {
            System.out.println("Socorriendo moto: " + vehiculo.getPatente());
        }
    }

}
