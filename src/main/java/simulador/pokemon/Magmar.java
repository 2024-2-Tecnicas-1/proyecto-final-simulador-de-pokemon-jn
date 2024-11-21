package simulador.pokemon;
public class Magmar extends Pokemon {
    public Magmar() {
        super("Magmar", 65, 95, TipoPokemon.FUEGO);
    }

    @Override
    public void atacar(Pokemon oponente) {
        double multiplicador = TipoPokemon.multiplicarDaño(this.tipo, oponente.getTipo());
        int daño = (int) (this.ataque * multiplicador);
        System.out.println(this.nombre + " ataca a " + oponente.getNombre() + " causando " + daño + " de daño.");
        oponente.recibirDaño(daño);
    }
}