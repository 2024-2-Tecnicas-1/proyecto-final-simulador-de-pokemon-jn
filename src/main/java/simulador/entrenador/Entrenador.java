package simulador.entrenador;
import java.util.ArrayList;
import java.util.List;
import simulador.pokemon.Pokemon;

public class Entrenador {
    private String nombre;
    private List<Pokemon> equipo;

    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.equipo = new ArrayList<>();
    }

    public void agregarPokemon(Pokemon pokemon) {
        equipo.add(pokemon);
        System.out.println(pokemon.getNombre() + " agregado al equipo de " + nombre);
    }

    public void mostrarEquipo() {
        System.out.println("Equipo de " + nombre + ":");
        for (Pokemon pokemon : equipo) {
            System.out.println("- " + pokemon.getNombre() + " (HP: " + pokemon.getSalud() + ")");
        }
    }

    public Pokemon seleccionarPokemon(int indice) {
        return equipo.get(indice);
    }

    public Object getEquipo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}