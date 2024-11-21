package simulador.pokemon;
public abstract class Pokemon {
    public enum Estado {
        NORMAL, DEBILITADO, ENVENENADO, PARALIZADO;
    }
public String nombre;
protected TipoPokemon tipo;
protected Estado estado;
public int salud;
protected int ataque;

public Pokemon(String nombre,int salud,int ataque,TipoPokemon tipo) {
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
    public TipoPokemon getTipo() { return tipo; }
    public Estado getEstado() { return estado; }
    }