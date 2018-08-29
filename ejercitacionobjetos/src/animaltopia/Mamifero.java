package animaltopia;

public class Mamifero extends Animal {

    public Mamifero(Integer energia) {
        super(energia);
    }

    @Override
    public Integer tomarMateYDevolver(Integer unudadesCargaMate) {
        Integer energiaAlTomarMate =   energia = (energia + 5) * unudadesCargaMate;
        if(energiaAlTomarMate < Animal.ENERGIA_MAXIMA){
            energia = energiaAlTomarMate;
        }else{
            energia = Animal.ENERGIA_MAXIMA;
            quiereMate =  Boolean.FALSE ;
        }
        return super.tomarMateYDevolver(unudadesCargaMate);
    }
}
