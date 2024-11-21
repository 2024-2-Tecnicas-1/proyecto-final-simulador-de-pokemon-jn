package simulador.pokemon;
public abstract class Pokemon {
protected String nombre;
protected TipoPokemon tipo;
protected String estado;
protected int salud;
protected int ataque;

public Pokemon(String nombre,int salud,int ataque,TipoPokemon tipo) {
    this.nombre=nombre;
    this.salud=salud;
    this.ataque=ataque;
    this.tipo=tipo;
    this.estado=estado;
}
public abstract void atacar(Pokemon oponente);
public void recibirDaño(int daño){
    this.salud-= daño;
    if(this.salud<=0){
        this.salud=0;
        this.estado="Debilitado";
    }
}
public void entrenar(){
    this.ataque += 5;
    this.salud += 5;
    System.out.println(nombre +" ha mejorado las estadisticas");
}
    public String getNombre() { return nombre; }
    public int getSalud() { return salud; }
    public int getPuntosDeAtaque() { return ataque; }
    public TipoPokemon getTipo() { return tipo; }
    public String getEstado() { return estado; }
    }