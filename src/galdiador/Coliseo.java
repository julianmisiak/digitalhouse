package galdiador;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Parser;

import java.util.HashSet;
import java.util.Set;

public class Coliseo {
    private Set<Gladiador> gladiadores = new HashSet<>();
    private Set<PersonalTrainer> trainers = new HashSet<>();
    private Set<Enfermera> enfermeras = new HashSet<>();
    private Set<Vendedor> vendedores = new HashSet<>();
    private Set<Espectador> espectadores = new HashSet<>();

    public void inscribirGladiador(String nombre, Integer vida, Integer ataque, Integer defensa) {
        Gladiador gladiador = new Gladiador(nombre, vida, ataque, defensa);
        if (Gladiador.hayErrorEnDatosGladidor(vida, ataque, defensa)) {
            return;
        }
        if (gladiadores.add(gladiador)) {
            System.out.println("El gladiador " + nombre + " fue agragado.");
        } else {
            System.out.println("Ya existe un gladiador con el nomnre" + nombre);
        }
    }

    public void inscribirPersonalTrainer(String nombre, Double porcentajeAtributos) {
        PersonalTrainer personalTrainer = new PersonalTrainer(nombre, porcentajeAtributos);
        if (trainers.add(personalTrainer)) {
            System.out.println("El Personal trainer " + nombre + " fue agragado.");
        } else {
            System.out.println("Ya existe un personal trainer con el nomnre" + nombre);
        }
    }

    public void inscribirEnfermera(String nombre) {
        Enfermera enfermera = new Enfermera(nombre);

        if (enfermeras.add(enfermera)) {
            System.out.println("La enfermera " + nombre + " fue agragada.");
        } else {
            System.out.println("Ya existe una enfermera con el nomnre" + nombre);
        }
    }

    public void inscribirVendedor(String nombre, Integer matricula, Integer nivelCarisma, Integer nivelExperiencia) {
        Vendedor vendedor = new Vendedor(nombre, matricula, nivelCarisma, nivelExperiencia);
        if (Vendedor.hayErrorEnDatosVendedor(nivelCarisma, nivelExperiencia)) {
            return;
        }

        if (vendedores.add(vendedor)) {
            System.out.println("El vendedor " + nombre + " fue agragado.");
        } else {
            System.out.println("Ya existe un vendedor con el nombre" + nombre);
        }
    }

    public void inscribirEspectador(String nombre) {
        Espectador espectador = new Espectador(nombre);

        if (espectadores.add(espectador)) {
            System.out.println("El espectador " + nombre + " fue agragado.");
        } else {
            System.out.println("Ya existe un espectador con el nombre" + nombre);
        }
    }

    public Gladiador getGladiadorPorNombre(String nombre) {
        if (nombre == null) {
            return null;
        }
        for (Gladiador gladiador : gladiadores) {
            if (gladiador.getNombre().equals(nombre)) {
                return gladiador;
            }
        }
        return null;
    }

    public PersonalTrainer getPersonalTrainerPorNombre(String nombre) {
        if (nombre == null) {
            return null;
        }
        for (PersonalTrainer personalTrainer : trainers) {
            if (personalTrainer.getNombre().equals(nombre)) {
                return personalTrainer;
            }
        }
        return null;
    }

    public Enfermera getEnfermeraPorNombre(String nombre) {
        if (nombre == null) {
            return null;
        }
        for (Enfermera enfermera : enfermeras) {
            if (enfermera.getNombre().equals(nombre)) {
                return enfermera;
            }
        }
        return null;
    }

    public Espectador getEspectadorPorNombre(String nombre) {
        if (nombre == null) {
            return null;
        }
        for (Espectador espectador : espectadores) {
            if (espectador.getNombre().equals(nombre)) {
                return espectador;
            }
        }
        return null;
    }

    public Vendedor getVendedorPorNombre(String nombre) {
        if (nombre == null) {
            return null;
        }
        for (Vendedor vendedor : vendedores) {
            if (vendedor.getNombre().equals(nombre)) {
                return vendedor;
            }
        }
        return null;
    }


    public void entrenarGladiador(String nombrePersonalTriner, String nombreGladiador) {
        PersonalTrainer personalTrainer = getPersonalTrainerPorNombre(nombrePersonalTriner);
        if (personalTrainer == null) {
            System.out.println("El nombre no correspnde a ningún Personal Trainer");
            return;
        }

        Gladiador gladiador = getGladiadorPorNombre(nombreGladiador);
        if (gladiador == null) {
            System.out.println("El nombre no correspnde a ningún Gladiador");
            return;
        }

        Double multPorcentajeAttributos = 1 + personalTrainer.getPorcentajeAtributos();

        Integer ataque = ((Double) (multPorcentajeAttributos * gladiador.getAtaque())).intValue();
        Integer defensa = ((Double) (multPorcentajeAttributos * gladiador.getDefensa())).intValue();
        Integer vida = ((Double) (multPorcentajeAttributos * gladiador.getVida())).intValue();

        gladiador.setAtaque(ataque > 100 ? 100 : ataque);
        gladiador.setDefensa(defensa > 100 ? 100 : defensa);
        gladiador.setVida(vida > 100 ? 100 : vida);

        System.out.println("\nLos niveles del gladeados son: ");
        System.out.println("Ataque: " + gladiador.getAtaque());
        System.out.println("Defensa: " + gladiador.getDefensa());
        System.out.println("Vída: " + gladiador.getVida());
        gladiadores.remove(gladiador);
        gladiadores.add(gladiador);
    }

    public void expulsarGladiador(String nombre) {
        Gladiador gladiador = getGladiadorPorNombre(nombre);
        if (gladiador == null) {
            System.out.println(nombre + " no está inscripto en el coliceo");
            return;
        }

        if (gladiadores.remove(gladiador)) {
            System.out.println("El galdiador '" + nombre + "' fue expulsado");
        } else {
            System.out.println("Hubo un error, consulte al administrador");
        }
    }

    public void peleaEntreGladiadores(String nombreGladiador1, String nombreGladiador2) {
        Gladiador gladiador1 = getGladiadorPorNombre(nombreGladiador1);
        if (gladiador1 == null) {
            System.out.println(nombreGladiador1 + " no está inscripto en el coliceo");
            return;
        }

        Gladiador gladiador2 = getGladiadorPorNombre(nombreGladiador2);
        if (gladiador2 == null) {
            System.out.println(nombreGladiador2 + " no está inscripto en el coliceo");
            return;
        }

        while (gladiador1.getVida() > 0 && gladiador2.getVida() > 0) {
            Integer rand1 = (int) (Math.random() * 200) + 10000;
            Integer rand2 = (int) (Math.random() * 200) + 10000;
            if (rand1 > rand2) {
                Integer ataque =  gladiador1.getAtaque() - gladiador2.getDefensa();
                Integer vida = gladiador2.getVida() - ( ataque <= 0 ? 1 : ataque  );
                gladiador2.setVida(vida < 0 ? 0 : vida);
            } else {
                Integer ataque =  gladiador2.getAtaque() - gladiador1.getDefensa();
                Integer vida = gladiador1.getVida() - ( ataque <= 0 ? 1 : ataque  );
                gladiador1.setVida(vida < 0 ? 0 : vida);
            }

            if(gladiador1.getVida() == 0){
                System.out.println("El gladiador '" + gladiador2.getNombre() +"' ha ganado");
                gladiadores.remove(gladiador1);
                gladiadores.remove(gladiador2);
                gladiadores.add(gladiador2);
                return;
            }

            if(gladiador2.getVida() == 0){
                System.out.println("El gladiador '" + gladiador1.getNombre() +"' ha ganado");
                gladiadores.remove(gladiador2);
                gladiadores.remove(gladiador1);
                gladiadores.add(gladiador1);
                return;
            }
        }

    }

    public void generarVenta(Vendedor vendedor, Espectador espectador, Producto producto){
        Venta venta = new Venta();
        venta.generarVenta(vendedor,espectador, producto);
        vendedor.getVentas().add(venta);
    }

}
