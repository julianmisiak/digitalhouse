package galdiador;

public class GladiadorMain {

    public static void main(String[] args) {
        Coliseo coliseo = new Coliseo();
        coliseo.inscribirGladiador("Sturzenegger", 100, 10, 10);
        coliseo.inscribirGladiador("Rambito", 100, 15, 10);
        coliseo.inscribirGladiador("Coco Basile", 100, 35, 33);

        coliseo.inscribirPersonalTrainer("Juan Jean", 0.12);
        coliseo.inscribirPersonalTrainer("Movete ", 0.25);

        coliseo.inscribirEnfermera("La pibita de la foto que hace la seña de callate");

        coliseo.inscribirVendedor("Juan te enboca", 12254, 8, 6);
        coliseo.inscribirVendedor("Serio", 121321, 1, 8);

        coliseo.entrenarGladiador("Juan Jean","Rambito" );
        coliseo.entrenarGladiador("Juan Jean","Rambito" );
        coliseo.entrenarGladiador("Juan Jean","Rambito" );


    }
}
