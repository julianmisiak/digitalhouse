package Vauquita;

public class Individuo implements Persona {
    private String nombre;
    private Integer dni;
    private String direc;
    private String tel;

    public Individuo(String nombre, Integer dni, String direc, String tel) {
        this.nombre = nombre;
        this.dni = dni;
        this.direc = direc;
        this.tel = tel;
    }

    @Override
    public void subcribite(Subcripcion s) {
        s.agrefarSubcriptor(this);
    }

    @Override
    public String listate() {
        return "Individuo{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", direc='" + direc + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
