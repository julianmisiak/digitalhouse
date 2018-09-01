package galdiador;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Persona {
    public static final Integer CARISMA_MINIMA = 0;
    public static final Integer CARISMA_MAXIMA = 10;
    public static final Integer EXPERIENCIA__MINIMO = 0;
    public static final Integer EXPERIENCIA_MAXIMA = 10;

    private Integer matricula;
    private Integer nivelCarisma;
    private Integer nivelExperiencia;
    private List<Venta> ventas = new ArrayList<>();

    public Vendedor(String nombre, Integer matricula, Integer nivelCarisma, Integer nivelExperiencia) {
        super(nombre);
        this.matricula = matricula;
        this.nivelCarisma = nivelCarisma;
        this.nivelExperiencia = nivelExperiencia;
    }

    public static Boolean hayErrorEnDatosVendedor(Integer nivelCarisma, Integer nivelExperiencia) {
        Boolean huboError = Boolean.FALSE;

        if (!(nivelCarisma >= CARISMA_MINIMA && nivelCarisma <= CARISMA_MAXIMA)) {
            System.out.println("Valor de 'Nivel de Carisma' incorrecto, el valor debe estar entre: " + CARISMA_MINIMA + " y " + CARISMA_MAXIMA);
            huboError = Boolean.TRUE;
        }

        if (!(nivelExperiencia >= EXPERIENCIA__MINIMO && nivelExperiencia <= EXPERIENCIA_MAXIMA)) {
            System.out.println("Valor de ataque incorrecto, el valor debe estar entre: " + EXPERIENCIA__MINIMO + " y " + EXPERIENCIA_MAXIMA);
            huboError = Boolean.TRUE;
        }
        return huboError;
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

    public List<Venta> getVentas() {
        return ventas;
    }
}
