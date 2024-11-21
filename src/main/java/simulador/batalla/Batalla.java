package simulador.batalla;
import simulador.pokemon.Pokemon;

public class Batalla {
    public void iniciarBatalla(Pokemon pokemon1,Pokemon pokemon2){
        System.out.println("Comienza la Batalla " + pokemon1.nombre + " vs " + pokemon2.nombre);
        while(pokemon1.salud >0 && pokemon2.salud >0){
            pokemon1.atacar(pokemon2);
            if(pokemon2.salud >0){
                pokemon2.atacar(pokemon1);
            }
        }
        if(pokemon1.salud >0){
            System.out.println(pokemon1.nombre + " ha ganado la batalla pokemon");
        } else {
            System.out.println(pokemon2.nombre + " ha ganado la batalla pokemon");
        }
    }
}
