package simulador.pokemon;
public enum TipoPokemon {
    FUEGO,AGUA,PLANTA,ELECTRICO,VENENO,PSIQUICO,HADA,TIERRA,HIELO,ROCA,VOLADOR,FANTASMA,AGUAVENENO,PSICOHADA,HIELOPSIQUICO,ROCAVOLADORA,FANTASMAVENENO;
    public static double multiplicarDaño(TipoPokemon atacante, TipoPokemon defensor){
        if (atacante == FUEGO && defensor == PLANTA) return 2.0;
        if (atacante == FUEGO && defensor == AGUA) return 0.5;
        if (atacante == FUEGO && defensor == ELECTRICO) return 1.0;
        if (atacante == FUEGO && defensor == TIERRA) return 0.5;
        if (atacante == FUEGO && defensor == ROCA) return 0.5;
        if (atacante == AGUA && defensor == FUEGO) return 2.0;
        if (atacante == AGUA && defensor == PLANTA) return 0.5;
        if (atacante == AGUA && defensor == ELECTRICO) return 0.5;
        if (atacante == AGUA && defensor == TIERRA) return 2.0;
        if (atacante == PLANTA && defensor == AGUA) return 2.0;
        if (atacante == PLANTA && defensor == FUEGO) return 0.5;
        if (atacante == PLANTA && defensor == TIERRA) return 2.0;
        if (atacante == PLANTA && defensor == VOLADOR) return 0.5;
        if (atacante == ELECTRICO && defensor == AGUA) return 2.0;
        if (atacante == ELECTRICO && defensor == TIERRA) return 0.0;
        if (atacante == ELECTRICO && defensor == VOLADOR) return 1.0;
        if (atacante == VENENO && defensor == PLANTA) return 2.0;
        if (atacante == VENENO && defensor == VENENO) return 0.5;
        if (atacante == VENENO && defensor == HADA) return 2.0;
        if (atacante == PSIQUICO && defensor == PSIQUICO) return 0.5;
        if (atacante == PSIQUICO && defensor == FANTASMA) return 2.0;
        if (atacante == HADA && defensor == FANTASMA) return 1.0;
        if (atacante == TIERRA && defensor == AGUA) return 0.5;
        if (atacante == TIERRA && defensor == FUEGO) return 2.0;
        if (atacante == HIELO && defensor == PLANTA) return 2.0;
        if (atacante == HIELO && defensor == AGUA) return 0.5;
        if (atacante == ROCA && defensor == FUEGO) return 1.0;
        if (atacante == ROCA && defensor == AGUA) return 1.0;
        if (atacante == VOLADOR && defensor == TIERRA) return 2.0;
        if (atacante == FANTASMA && defensor == FANTASMA) return 2.0;
        return 1.0;
    }
}
