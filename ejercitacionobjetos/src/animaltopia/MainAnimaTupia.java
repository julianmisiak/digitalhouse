package animaltopia;

import java.util.ArrayList;
import java.util.List;

public class MainAnimaTupia {

    public static void main(String[] args) {
        RobotMatero robot = new RobotMatero();
        Resptil iguana = new Resptil(5);
        Resptil rene = new Resptil(3);
        Resptil sapo = new Resptil(7);

        Mamifero vaca = new Mamifero(12);
        Mamifero rata = new Mamifero(15);

        List<Animal> rondaMatera = new ArrayList<>();
        rondaMatera.add(iguana);
        rondaMatera.add(rene);
        rondaMatera.add(sapo);
        rondaMatera.add(vaca);
        rondaMatera.add(rata);

        for (int i = 0; i < 10; i++) {
            for (Animal animal : rondaMatera) {
                robot.cargarMate();
                robot.entregarMate(animal);
            }
        }

        Mamifero pezVolador = new Mamifero(13);
        System.out.println("Pez volador");
        robot.entregarMate(pezVolador);
        robot.entregarMate(pezVolador);
    }
}
