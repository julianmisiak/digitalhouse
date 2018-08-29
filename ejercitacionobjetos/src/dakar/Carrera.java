package dakar;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
    private Double distancia;
    private Double premioEnDolares;
    private String nombre;
    private Integer cantidadDeVehiculosPermitidos;
    private List<Vehiculo> listaDeVehiculos = new ArrayList();
    private SocorristaAuto socorristaAuto = new SocorristaAuto();
    private SocorristaMoto socorristaMoto = new SocorristaMoto();

    public Carrera(Double distancia, Double premioEnDolares, String nombre, Integer cantidadDeVehiculosPermitidos) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
    }

    private void darDeAlta(Vehiculo vehiculo){
        if(listaDeVehiculos.size() < cantidadDeVehiculosPermitidos) {
            listaDeVehiculos.add(vehiculo);
            System.out.println("Vehículo " + vehiculo.patente + " Agregado a la carrera");
        }else{
            System.out.println("No hay cupo");
        }
    }

    public void darDeAltaAuto(Double velocidad, Double aceleracion, Double giro, String patente){
       Auto auto = new Auto(velocidad, aceleracion, giro, patente);
        darDeAlta(auto);
    }

    public void darDeAltaMoto(Double velocidad, Double aceleracion, Double giro, String patente){
        Moto moto = new Moto(velocidad, aceleracion, giro, patente);
        darDeAlta(moto);
    }

    public void eliminarVehiculo(Vehiculo vehiculo){
        Boolean fueEliminado = listaDeVehiculos.remove(vehiculo);
    }

    private Vehiculo getVehiculoPorPatente(String unaPatente) {
        for (Vehiculo vehiculo : listaDeVehiculos) {
            if (vehiculo.patente.toLowerCase().equals(unaPatente.toLowerCase())) {
                return vehiculo;
            }
        }
        return null;
    }

        public void eliminarVehiculoConPatente(String unaPatente){
            Vehiculo eliminar = null;
            eliminar = getVehiculoPorPatente(unaPatente);

            if (eliminar != null) {
                eliminarVehiculo(eliminar);
                System.out.println("Vehículo " + eliminar.patente + " quitado de de la carrera");
            } else {
                System.out.println("Vehículo " + unaPatente + " no está en la carrera");
            }
        }


    public String determinarGanador(){
        String ganadorPatente="";
        Double max=0.0;
        for (Vehiculo vehiculo : listaDeVehiculos){
            Double actual = obtenerValorFormula(vehiculo);
            if(actual > max){
                max = actual;
                ganadorPatente = vehiculo.patente;
            }
        }
        return ganadorPatente;
    }

    private Double obtenerValorFormula(Vehiculo vehiculo){
        return vehiculo.getVelocidad() * 0.5 * vehiculo.getAceleracion() / ( vehiculo.getGiro()* ( vehiculo.getPeso()- vehiculo.getCantRuedas() * 100));
    }

    private Vehiculo socorrer(String patente){
       return getVehiculoPorPatente(patente);

    }

    public void socorrerAuto(String patente){
        Vehiculo vehiculo = socorrer(patente);
        socorristaAuto.socorrer(vehiculo);
    }
    public void socorrerMoto(String patente){
        Vehiculo vehiculo = socorrer(patente);
        socorristaMoto.socorrer(vehiculo);
    }


    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Double getPremioEnDolares() {
        return premioEnDolares;
    }

    public void setPremioEnDolares(Double premioEnDolares) {
        this.premioEnDolares = premioEnDolares;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidadDeVehiculosPermitidos() {
        return cantidadDeVehiculosPermitidos;
    }

    public void setCantidadDeVehiculosPermitidos(Integer cantidadDeVehiculosPermitidos) {
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
    }

    public List getListaDeVehiculos() {
        return listaDeVehiculos;
    }

    public void setListaDeVehiculos(List listaDeVehiculos) {
        this.listaDeVehiculos = listaDeVehiculos;
    }
}
