package galdiador;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Parser;

import java.util.HashSet;
import java.util.Set;

public class Coliseo {
    private Set<Gladiador> gladiadores = new HashSet<>();
    private Set<PersonalTrainer> trainers = new HashSet<>();
    private Set<Enfermera> enfermeras = new HashSet<>();
    private Set<Vendedor> vendedores = new HashSet<>();

    public void inscribirGladiador(String nombre, Integer vida, Integer ataque, Integer defensa){
        Gladiador gladiador = new Gladiador(nombre, vida, ataque, defensa);

        if(gladiadores.add(gladiador)){
            System.out.println("El gladiador " + nombre + " fue agragado.");
        }else{
            System.out.println("Ya existe un gladiador con el nomnre" + nombre);
        }
    }

    public void inscribirPersonalTrainer(String nombre, Double porcentajeAtributos){
        PersonalTrainer personalTrainer = new PersonalTrainer(nombre, porcentajeAtributos);
        if(trainers.add(personalTrainer)){
            System.out.println("El Personal trainer " + nombre + " fue agragado.");
        }else{
            System.out.println("Ya existe un personal trainer con el nomnre" + nombre);
        }
    }

    public void inscribirEnfermera(String nombre){
        Enfermera enfermera = new Enfermera(nombre);

        if(enfermeras.add(enfermera)){
            System.out.println("La enfermera " + nombre + " fue agragada.");
        }else{
            System.out.println("Ya existe una enfermera con el nomnre" + nombre);
        }
    }

    public void inscribirVendedor(String nombre, Integer matricula, Integer nivelCarisma, Integer nivelExperiencia ){
        Vendedor vendedor = new Vendedor(nombre, matricula, nivelCarisma, nivelExperiencia);

        if(vendedores.add(vendedor)){
            System.out.println("El vendedor " + nombre + " fue agragado.");
        }else{
            System.out.println("Ya existe un vendedor con el nomnre" + nombre);
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

    public PersonalTrainer getPersonalTrainerPorNombre(String nombre){
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

    public Enfermera getEnfermeraPorNombre(String nombre){
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

    public Vendedor getVendedorPorNombre(String nombre){
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


    public void entrenarGladiador(String nombrePersonalTriner, String nombreGladiador){
        PersonalTrainer personalTrainer = getPersonalTrainerPorNombre(nombrePersonalTriner);
        if(personalTrainer == null ){
            System.out.println("El nombre no correspnde a ningún Personal Trainer");
            return;
        }

        Gladiador gladiador =  getGladiadorPorNombre(nombreGladiador);
        if(gladiador == null ){
            System.out.println("El nombre no correspnde a ningún Gladiador");
            return;
        }

        Double multPorcentajeAttributos = 1 + personalTrainer.getPorcentajeAtributos();

        Integer ataque =  ((Double)(multPorcentajeAttributos * gladiador.getAtaque())).intValue();
        Integer defensa =  ((Double)(multPorcentajeAttributos * gladiador.getDefensa())).intValue();
        Integer vida =  ((Double)(multPorcentajeAttributos * gladiador.getVida())).intValue();

        gladiador.setAtaque(ataque > 100 ? 100: ataque);
        gladiador.setDefensa(defensa > 100 ? 100: defensa);
        gladiador.setVida(vida > 100 ? 100: vida);

        System.out.println("\nLos niveles del gladeados son: ");
        System.out.println("Ataque: " + gladiador.getAtaque());
        System.out.println("Defensa: " + gladiador.getDefensa() );
        System.out.println("Vída: " + gladiador.getVida());

    }

}
