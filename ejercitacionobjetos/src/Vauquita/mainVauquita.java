package Vauquita;

import farmatown.Droga;
import farmatown.Medicamento;

import java.util.HashMap;
import java.util.Map;

public class mainVauquita {
    public static void main(String[] args) {
        Subcripcion subcripcion = new Subcripcion();

        Individuo i = new Individuo("a", 222,"lala 44", "4444-3333" );

        Empresa e = new Empresa("alala Sa", "23232424-20", 23,  "5545-6564");

        i.subcribite(subcripcion);
        e.subcribite(subcripcion);

        subcripcion.listar();


    }
}
