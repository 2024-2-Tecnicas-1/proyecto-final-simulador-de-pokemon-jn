package simulador.pokemon;
import java.util.List;
public abstract class Pokemon {

    public void setNombre(String nombrePokemon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public enum Estado {
        NORMAL, DEBILITADO, ENVENENADO, PARALIZADO;
    }
public String nombre;
protected List<TipoPokemon> tipo;
protected Estado estado;
public int salud;
protected int ataque;

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