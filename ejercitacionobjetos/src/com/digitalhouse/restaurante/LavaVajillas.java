package com.digitalhouse.restaurante;

public class LavaVajillas extends Empleado {
    private Integer vajillasRotas = 0;

    public LavaVajillas(Integer dni, String nombre, String apellido, Integer sueldo) {
        super(dni, nombre, apellido, sueldo);
    }

    public void romperVajilla() {
        vajillasRotas++;
    }

    @Override
    public Integer calcularSueldoNeto() {
        return (sueldo - vajillasRotas * 5);
    }
}
