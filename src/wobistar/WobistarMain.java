package wobistar;

import com.digitalhouse.restaurante.Empleado;
import farmatown.Droga;
import farmatown.Medicamento;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class WobistarMain {
    public static void main(String[] args) {
        Individuos pepe = new Individuos(1, new Date(),11111111, "pepito", "pistolero" );
        Empresa curroSa = new Empresa(2,new Date(),123123, "CurroSA" );

        LineaTelefonica lineaDePepe = new LineaTelefonica(4443332, pepe, new Comunidad());



        try {
            System.out.println("Llamada en curso");
            Integer x = (int)(Math.random()*200)+10000;
            Thread.sleep(x);
            lineaDePepe.registrarLlamada(x.doubleValue(), new Two());
            System.out.println("Fin de la llamada.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(Llamada llamada : lineaDePepe.getLlamadas()){
            System.out.println(llamada.getCostoTotal());
        }


    }
}
