package simulador.pokemon;
public abstract class Pokemon {
protected String nombre;
protected List<TipoPokemon> tipo;
protected String estado;
protected int salud;
protected int ataque;

public Pokemon(String nombre,int salud,int ataque, List<TipoPokemon> tipo, String estado){
    this.nombre=nombre;
    this.tipo=tipo;
    this.estado="normal";
    this.salud=salud;
    this.ataque=ataque;
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
    this.salud += 10;
    System.out.println(nombre +" ha mejorado las estadisticas");
}
@Override
    public String toString() {
        return nombre + " (Tipo: " + tipo + ", Salud: " + salud + ", Ataque: " + ataque + ", Estado: " + estado + ")";
    }
}