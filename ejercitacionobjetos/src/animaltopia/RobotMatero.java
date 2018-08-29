package animaltopia;

public class RobotMatero {
    public final static Integer UNIDAD_CARGA_MATE = 5;

    private Integer unudadesCargaMate = 0;

    public void cargarMate() {
        unudadesCargaMate = UNIDAD_CARGA_MATE;
    }

    public Integer entregarMate(Animal animal){
        return animal.tomarMateYDevolver(unudadesCargaMate);
    }
}
