package galdiador;

public class Vendedor extends Persona {
    private Integer matricula;
    private Integer nivelCarisma;
    private Integer nivelExperiencia;

    public Vendedor(String nombre, Integer matricula, Integer nivelCarisma, Integer nivelExperiencia) {
        super(nombre);
        this.matricula = matricula;
        this.nivelCarisma = nivelCarisma;
        this.nivelExperiencia = nivelExperiencia;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getNivelCarisma() {
        return nivelCarisma;
    }

    public void setNivelCarisma(Integer nivelCarisma) {
        this.nivelCarisma = nivelCarisma;
    }

    public Integer getNivelExperiencia() {
        return nivelExperiencia;
    }

    public void setNivelExperiencia(Integer nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }
}
