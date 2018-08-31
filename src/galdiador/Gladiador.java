package galdiador;

public class Gladiador extends Persona {
    public static final Integer VIDA_INICIAL = 100;
    public static final Integer ATAQUE_INICIAL = 5;
    public static final Integer DEFENSA_INICIAL = 5;

    private Integer vida;
    private Integer ataque;
    private Integer defensa;

    public Gladiador(String nombre) {
        super(nombre);
        this.vida = VIDA_INICIAL;
        this.ataque = ATAQUE_INICIAL;
        this.defensa = DEFENSA_INICIAL;
    }

    public Gladiador(String nombre, Integer vida, Integer ataque, Integer defensa) {
        super(nombre);
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    public Integer getDefensa() {
        return defensa;
    }

    public void setDefensa(Integer defensa) {
        this.defensa = defensa;
    }
}
