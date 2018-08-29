package excepciones;

import dakar.Carrera;

import java.util.ArrayList;
import java.util.List;

public class MainExcption {

    public static void main(String[] args) {
      try {
          Integer numero = 4;
          numero.toString();
      }catch (Exception e){
          System.out.println("Picho");
          e.printStackTrace();
      }


      // Ejercicio 2:
      try {
          ArrayList<String> listaString = new ArrayList<>();
          listaString.add("Pato");
          listaString.add("Perro");
          listaString.add("Gato");

          System.out.println(listaString.get(3));
      }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
      }


        // Ejercicio 3:
        try {
            ArrayList<String> listaString = new ArrayList<>();
            listaString.add("Pato");
            listaString.add("Perro");
            listaString.add("Gato");

            System.out.println(listaString.get(5));
        }catch (NullPointerException e){
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }

    }

}
