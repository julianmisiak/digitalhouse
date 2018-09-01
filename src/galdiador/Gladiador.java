package galdiador;

public class Gladiador extends Persona {
    public static final Integer VIDA_MINIMA = 5;
    public static final Integer VIDA_MAXIMA = 100;
    public static final Integer ATAQUE_MINIMO = 10;
    public static final Integer ATAQUE_MAXIMO = 100;
    public static final Integer DEFENSA_MINIMA = 5;
    public static final Integer DEFENSA_MAXIMA = 20;
    private Integer vida;
    private Integer ataque;
    private Integer defensa;


    public Gladiador(String nombre, Integer vida, Integer ataque, Integer defensa) {
        super(nombre);
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public static Boolean hayErrorEnDatosGladidor(Integer vida, Integer ataque, Integer defensa) {
        Boolean huboError = Boolean.FALSE;

        if (!(vida >= VIDA_MINIMA && vida <= VIDA_MAXIMA)) {
            System.out.println("Valor de vida incorrecto, el valor debe estar entre: " + VIDA_MINIMA + " Y " + VIDA_MAXIMA);
            huboError = Boolean.TRUE;
        }

        if (!(ataque >= ATAQUE_MINIMO && ataque <= ATAQUE_MAXIMO)) {
            System.out.println("Valor de ataque incorrecto, el valor debe estar entre: " + ATAQUE_MINIMO + " Y " + ATAQUE_MAXIMO);
            huboError = Boolean.TRUE;
        }

        if (!(ataque >= DEFENSA_MINIMA && ataque <= DEFENSA_MAXIMA)) {
            System.out.println("Valor de defensa incorrecto, el valor debe estar entre: " + DEFENSA_MINIMA + " Y " + DEFENSA_MAXIMA);
            huboError = Boolean.TRUE;
        }

        return huboError;
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
