package animaltopia;

public class Resptil extends Animal {

    public Resptil(Integer energia) {
        super(energia);
    }

    @Override
    public Integer tomarMateYDevolver(Integer unudadesCargaMate) {
        Integer energiaAlTomarMate = energia = (energia * 2) * unudadesCargaMate;

        if (energiaAlTomarMate < Animal.ENERGIA_MAXIMA) {
            energia = energiaAlTomarMate;
        } else {
            energia = Animal.ENERGIA_MAXIMA;
            quiereMate =  Boolean.FALSE ;
        }

        return super.tomarMateYDevolver(unudadesCargaMate);
    }
}
