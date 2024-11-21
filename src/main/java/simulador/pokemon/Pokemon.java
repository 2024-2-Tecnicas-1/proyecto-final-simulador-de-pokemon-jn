package simulador.pokemon;
import java.util.Arrays;
import java.util.List;
public abstract class Pokemon {
public String nombre;
protected List<TipoPokemon> tipo;
protected Estado estado;
public int salud;
protected int ataque;
public enum Estado {
    NORMAL, DEBILITADO, ENVENENADO, PARALIZADO;
    }
public Pokemon(String nombre,int salud,int ataque,List<TipoPokemon> tipo) {
    this.nombre=nombre;
    this.salud=salud;
    this.ataque=ataque;
    this.tipo=tipo;
    this.estado=Estado.NORMAL;
}
public abstract void atacar(Pokemon oponente);
public void recibirDaño(int daño){
    this.salud-= daño;
    if(this.salud<=0){
        this.salud=0;
        this.estado=Estado.DEBILITADO;
    }
}
public void entrenar(){
    this.ataque += 5;
    this.salud += 5;
    System.out.println(nombre +" ha mejorado las estadisticas");
}
    public String getNombre() { return nombre; }
    public int getSalud() { return salud; }
    public int getAtaque() { return ataque; }
    public List<TipoPokemon> getTipo() { return tipo; }
    public Estado getEstado() { return estado; }
    }
public class Magmar extends(pokemon){
    public Magmar(String nombre){
        super(nombre,65, 95, Arrays.asList(TipoPokemon.FUEGO));
        }
}
    public class Tentacool extends(pokemon){
    public Tentacool(String nombre){
        super(nombre,40, 40, Arrays.asList(TipoPokemon.AGUAVENENO));
        }
}
    public class Tangela extends(pokemon){
    public Tangela(String nombre){
        super(nombre,40, 40, Arrays.asList(TipoPokemon.AGUAVENENO));
        }
}
            public class Electabuzz extends(pokemon){
    public Electabuzz(String nombre){
        super(nombre,65, 83, Arrays.asList(TipoPokemon.ELECTRICO));
        }
        }
    public class Mime extends(pokemon){
    public Mime(String nombre){
        super(nombre,40, 45, Arrays.asList(TipoPokemon.PSIQUICOHADA));
        }
        }
        public class Sandshrew extends(pokemon){
    public Sandshrew(String nombre){
        super(nombre,50, 75, Arrays.asList(TipoPokemon.TIERRA));
        }
        }
        public class Jynx extends(pokemon){
    public Jynx(String nombre){
        super(nombre,65, 50, Arrays.asList(TipoPokemon.HIELOPSIQUICO));
        }
        }
        public class Aerodactyl extends(pokemon){
    public Aerodactyl(String nombre){
        super(nombre,80, 105, Arrays.asList(TipoPokemon.ROCAVOLADOR)));
        }
        }
        public class Gastly extends(pokemon){
    public Gastly(String nombre){
        super(nombre,30, 35, Arrays.asList(TipoPokemon.FANTASMAVENENO));
        }
                }
            public class Seel extends(pokemon){
    public class Seel(String nombre){
        super(nombre,65, 45, Arrays.asList(TipoPokemon.AGUA));
        }
      }