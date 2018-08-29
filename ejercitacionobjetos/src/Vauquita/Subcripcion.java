package Vauquita;

import java.util.ArrayList;
import java.util.List;

public class Subcripcion {
    private List<Persona> listSubcriptores = new ArrayList<>();

    public void agrefarSubcriptor(Persona s){
        listSubcriptores.add(s);
    }

    public void listar(){
        for(Persona s : listSubcriptores){
            System.out.println(s.listate());
        }
    }


}
