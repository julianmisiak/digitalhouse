package com.digitalhouse.restaurante;

public class MainRestaurante {

    public static void main(String[] args) {
        LavaVajillas pepe = new LavaVajillas(23332323, "Pepe", "Mujica",4);
	    General pipo = new General(34234324, "Pipo", "Chipolatti", 46);

        System.out.println("Sueldo neto " + pipo.getNombre() + " " + pipo.getApellido() +" es de " +pipo.calcularSueldoNeto());

        pepe.romperVajilla();
        pepe.romperVajilla();
        pepe.romperVajilla();
        pepe.romperVajilla();
        pepe.romperVajilla();
        pepe.romperVajilla();

        System.out.println("Sueldo neto " + pepe.getNombre() + " " + pepe.getApellido() +" es de " +pepe.calcularSueldoNeto());

    }
}
