package galdiador;

public class PersonalTrainer extends Persona {
    private Double porcentajeAtributos;

    public PersonalTrainer(String nombre, Double porcentajeAtributos) {
        super(nombre);
        this.porcentajeAtributos = porcentajeAtributos;
    }

    public Double getPorcentajeAtributos() {
        return porcentajeAtributos;
    }

    public void setPorcentajeAtributos(Double porcentajeAtributos) {
        this.porcentajeAtributos = porcentajeAtributos;
    }
}
