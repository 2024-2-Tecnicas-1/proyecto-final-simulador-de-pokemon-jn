import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import simulador.entrenador.Entrenador;
import simulador.pokemon.Pokemon;

public class Principal {
    static List<Entrenador> entrenadores = new ArrayList<>();
    static List<Pokemon> pokemones = new ArrayList<>();
    
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        agregarPokemones();
        while (true) {
            System.out.println("Simulador de Batallas Pokémon");
            System.out.println("1. Gestionar Entrenadores");
            System.out.println("2. Gestionar Pokémones");
            System.out.println("3. Iniciar Batalla");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    gestionarEntrenadores();
                    break;
                case 2:
                    gestionarPokemon();
                    break;
                case 3:
                    iniciarBatalla();
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        }
    }
    public static void gestionarEntrenadores() {
        while (true) {
            System.out.println("Gestionar Entrenadores");
            System.out.println("1. Registrar nuevo entrenador");
            System.out.println("2. Ver lista de entrenadores");
            System.out.println("3. Seleccionar un entrenador");
            System.out.println("4. Volver al menú principal");
            System.out.print("Elige una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    registrarEntrenador();
                    break;
                case 2:
                    verEntrenadores();
                    break;
                case 3:
                    seleccionarEntrenador();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        }
    }
    public static void registrarEntrenador() {
        System.out.print("Ingrese el nombre del entrenador: ");
        String nombre = scanner.nextLine();
        Entrenador entrenador = new Entrenador(nombre);
        entrenadores.add(entrenador);
        System.out.println("Entrenador " + nombre + " registrado con éxito.");
    }

    public static void verEntrenadores() {
        if (entrenadores.isEmpty()) {
            System.out.println("No hay entrenadores registrados.");
        } else {
            System.out.println("Entrenadores registrados:");
            for (Entrenador entrenador : entrenadores) {
                System.out.println("- " + entrenador.getNombre());
            }
        }
    }
    public static void seleccionarEntrenador() {
        if (entrenadores.isEmpty()) {
            System.out.println("No hay entrenadores registrados.");
            return;
        }
        System.out.print("Ingrese el nombre del entrenador: ");
        String nombre = scanner.nextLine();
        Entrenador entrenadorSeleccionado = null;
        for (Entrenador entrenador : entrenadores) {
            if (entrenador.getNombre().equalsIgnoreCase(nombre)) {
                entrenadorSeleccionado = entrenador;
                break;
            }
        }

        if (entrenadorSeleccionado == null) {
            System.out.println("Entrenador no encontrado.");
        } else {
            gestionarEquipoPokemon(entrenadorSeleccionado);
        }
    }
    public static void gestionarEquipoPokemon(Entrenador entrenador) {
        while (true) {
            System.out.println("Gestionar Pokémon de " + entrenador.getNombre());
            System.out.println("1. Ver equipo de Pokémones");
            System.out.println("2. Agregar Pokémon al equipo");
            System.out.println("3. Entrenar Pokémon");
            System.out.println("4. Volver a Gestionar Entrenadores");
            System.out.print("Elige una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    verEquipoPokemon(entrenador);
                    break;
                case 2:
                    agregarPokemonAEquipo(entrenador);
                    break;
                case 3:
                    entrenarPokemon(entrenador);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        }
    }
    public static void verEquipoPokemon(Entrenador entrenador) {
        if (entrenador.getEquipo().isEmpty()) {
            System.out.println("El entrenador no tiene Pokémon en su equipo.");
        } else {
            System.out.println("Equipo de " + entrenador.getNombre() + ":");
            for (Pokemon pokemon : entrenador.getEquipo()) {
                System.out.println("- " + pokemon.getNombre() + " (HP: " + pokemon.getSalud() + ", ATK: " + pokemon.getAtaque() + ")");
                System.out.println("  Tipos: " + pokemon.getTipos());
            }
        }
    }
    public static void agregarPokemonAEquipo(Entrenador entrenador) {
        System.out.print("Ingrese el nombre del Pokémon: ");
        String nombrePokemon = scanner.nextLine();
        Pokemon pokemon = crearPokemon(nombrePokemon);
        entrenador.agregarPokemon(pokemon);
        System.out.println("Pokémon " + pokemon.getNombre() + " agregado al equipo.");
    }
    public static Pokemon crearPokemon(String nombre) {
        Pokemon pokemon = new Magmar();
        pokemon.setNombre(nombre);
        return pokemon;
    }
    public static void entrenarPokemon(Entrenador entrenador) {
        if (entrenador.getEquipo().isEmpty()) {
            System.out.println("El entrenador no tiene Pokémon en su equipo.");
            return;
        }
        System.out.print("Ingrese el nombre del Pokémon a entrenar: ");
        String nombrePokemon = scanner.nextLine();
        Pokemon pokemonSeleccionado = null;
        for (Pokemon pokemon : entrenador.getEquipo()) {
            if (pokemon.getNombre().equalsIgnoreCase(nombrePokemon)) {
                pokemonSeleccionado = pokemon;
                break;
            }
        }
        if (pokemonSeleccionado == null) {
            System.out.println("Pokémon no encontrado.");
        } else {
            pokemonSeleccionado.entrenar();
            System.out.println(pokemonSeleccionado.getNombre() + " ha sido entrenado.");
        }
    }
    public static void gestionarPokemon() {
        while (true) {
            System.out.println("Gestionar Pokémones");
            System.out.println("1. Ver todos los Pokémones registrados");
            System.out.println("2. Registrar nuevo Pokémon");
            System.out.println("3. Volver al menú principal");
            System.out.print("Elige una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer
            
            switch (opcion) {
                case 1:
                    verPokemonRegistrados();
                    break;
                case 2:
                    registrarPokemon();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        }
    }
    public static void verPokemonRegistrados() {
        if (pokemones.isEmpty()) {
            System.out.println("No hay Pokémones registrados.");
        } else {
            System.out.println("Pokémones registrados:");
            for (Pokemon pokemon : pokemones) {
                System.out.println("- " + pokemon.getNombre());
            }
        }
    }
    public static void registrarPokemon() {
        System.out.print("Ingrese el nombre del Pokémon: ");
        String nombrePokemon = scanner.nextLine();
        Pokemon pokemon = new Pokemon();  
        pokemon.setNombre(nombrePokemon);
        pokemones.add(pokemon);
        System.out.println("Pokémon " + nombrePokemon + " registrado con éxito.");
    }
    public static void iniciarBatalla() {
        System.out.println("Batalla iniciada...");
    }
    public static void agregarPokemones() {
    pokemones.add(new Pokemon("Magmar", 65, 95, Arrays.asList(TipoPokemon.FUEGO)));
    pokemones.add(new Pokemon("Magmar", 65, 95, Arrays.asList(TipoPokemon.FUEGO)));
    pokemones.add(new Pokemon("Tentacool", 40, 40, Arrays.asList(TipoPokemon.AGUAVENENO)));
    pokemones.add(new Pokemon("Tangela", 65, 55, Arrays.asList(TipoPokemon.PLANTA)));
    pokemones.add(new Pokemon("Electabuzz", 65, 83, Arrays.asList(TipoPokemon.ELECTRICO)));
    pokemones.add(new Pokemon("Mr. Mime", 40, 45, Arrays.asList(TipoPokemon.PSIQUICOHADA)));
    pokemones.add(new Pokemon("Sandshrew", 50, 75, Arrays.asList(TipoPokemon.TIERRA)));
    pokemones.add(new Pokemon("Jynx", 65, 50, Arrays.asList(TipoPokemon.HIELOPSIQUICO)));
    pokemones.add(new Pokemon("Aerodactyl", 80, 105, Arrays.asList(TipoPokemon.ROCAVOLADOR)));
    pokemones.add(new Pokemon("Gastly", 30, 35, Arrays.asList(TipoPokemon.FANTASMAVENENO)));
    pokemones.add(new Pokemon("Seel", 65, 45, Arrays.asList(TipoPokemon.AGUA)));
    }
}
