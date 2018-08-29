package lobotowallstreet;

public class Lobito implements Alertable {
    private Integer id;
    private String apyn;

    public Lobito(Integer id, String apyn) {
        this.id = id;
        this.apyn = apyn;
    }

    @Override
    public void recibirMsj(InstrumentoFinanciero instrumentoFinanciero) {
        System.out.println("Soy el Lobito: " + apyn  + "  el mensaje: "+ instrumentoFinanciero.getPrecio());
    }
}
