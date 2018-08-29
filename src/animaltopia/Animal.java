
package animaltopia;

public abstract class Animal {
    public static final Integer ENERGIA_MAXIMA = 100;

    protected Integer energia;
    protected Boolean quiereMate = Boolean.TRUE;

    public Animal(Integer energia) {
        this.energia = energia;
    }

    public Integer tomarMateYDevolver(Integer unudadesCargaMate) {
        if (quiereMate) {
            System.out.println("Tomé el mate y mi unidades de enregía es: " + energia);
        }else{
            System.out.println(" No quiero mate, debido que mi energía es de: " + energia);
        }
        return 0;
    }


    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }

    public Boolean getQuiereMate() {
        return quiereMate;
    }

    public void setQuiereMate(Boolean quiereMate) {
        this.quiereMate = quiereMate;
    }
}
