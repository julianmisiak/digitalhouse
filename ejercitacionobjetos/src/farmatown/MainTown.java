package farmatown;

import java.util.HashMap;
import java.util.Map;

public class MainTown {
    public static void main(String[] args) {
        Droga sarcoite = new Droga("Sarsoite", "Fafa la fafa");
        Droga cocaina = new Droga("Paco", "Peperina con sacansina");
        Droga tita = new Droga("TitaYrodesia", "Bangalanga");

        Medicamento ibuprofeno = new Medicamento();
        ibuprofeno.agregarDroga(sarcoite);
        ibuprofeno.agregarDroga(cocaina);

        System.out.println("Soy Alergico a la sarcoite: ");
        if(ibuprofeno.soyAlergico(sarcoite)){
            System.out.println("Positivo");
        }else{
            System.out.println("Negativo");
        }

        System.out.println("\nSoy Alergico a la tita: ");
        if(ibuprofeno.soyAlergico(tita)){
            System.out.println("Positivo");
        }else{
            System.out.println("Negativo");
        }

        System.out.println("\nSoy Alergico a la cocaina: ");
        if(ibuprofeno.soyAlergico(cocaina)){
            System.out.println("Positivo");
        }else{
            System.out.println("Negativo");
        }


        Map<Medicamento, Droga> map = new HashMap();
        map.put(ibuprofeno, sarcoite);

        Droga med =  map.get(ibuprofeno);
        System.out.println(med.getDescripcion());

    }
}
