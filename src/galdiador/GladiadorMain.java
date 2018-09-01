package galdiador;

public class GladiadorMain {

    public static void main(String[] args) {
        Coliseo coliseo = new Coliseo();
        coliseo.inscribirGladiador("Sturzenegger", 100, 10, 10);
        coliseo.inscribirGladiador("Rambito", 100, 15, 10);
        coliseo.inscribirGladiador("Coco Basile", 100, 15, 33);

        coliseo.inscribirPersonalTrainer("Juan Jean", 0.12);
        coliseo.inscribirPersonalTrainer("Movete ", 0.25);

        coliseo.inscribirEnfermera("La pibita de la foto que hace la seña de callate");

        coliseo.inscribirVendedor("Juan te enboca", 12254, 5, 6);
        coliseo.inscribirVendedor("Serio", 121321, 1, 8);

        coliseo.entrenarGladiador("Juan Jean","Rambito" );
        coliseo.entrenarGladiador("Juan Jean","Rambito" );
        coliseo.entrenarGladiador("Juan Jean","Rambito" );
        coliseo.entrenarGladiador("Juan Jean","Rambito" );
        coliseo.entrenarGladiador("Juan Jean","Rambito" );
        coliseo.entrenarGladiador("Juan Jean","Rambito" );
        coliseo.entrenarGladiador("Juan Jean","Rambito" );

        coliseo.expulsarGladiador("Sturzenegger");
        coliseo.peleaEntreGladiadores("Rambito", "Coco Basile");

        coliseo.inscribirEspectador("Lolo");

        Producto producto1 = new Producto("Chocolate Romano", 25.3);
        Producto producto2 = new Producto("Ensalada Cesar", 25.3);
        Producto producto3 = new Producto("Domun Exitus", 25.3);

        coliseo.generarVenta(coliseo.getVendedorPorNombre("Juan te enboca"), coliseo.getEspectadorPorNombre("Lolo"), producto2 );


    }
}
