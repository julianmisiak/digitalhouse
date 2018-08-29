package Vauquita;

public class Empresa implements Persona {
    private String nombreFantasia;
    private String cuit;
    private Integer cantEmpleados;
    private String tel;

    public Empresa(String nombreFantasia, String cuit, Integer cantEmpleados, String tel) {
        this.nombreFantasia = nombreFantasia;
        this.cuit = cuit;
        this.cantEmpleados = cantEmpleados;
        this.tel = tel;
    }

    @Override
    public void subcribite(Subcripcion s) {
        s.agrefarSubcriptor(this);
    }

    public String listate() {
        return "Empresa{" +
                "nombreFantasia='" + nombreFantasia + '\'' +
                ", cuit='" + cuit + '\'' +
                ", cantEmpleados=" + cantEmpleados +
                ", tel='" + tel + '\'' +
                '}';
    }
}
