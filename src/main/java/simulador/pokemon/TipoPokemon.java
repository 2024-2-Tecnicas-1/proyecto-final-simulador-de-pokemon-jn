package simulador.pokemon;
import java.util.List;

public enum TipoPokemon {
    FUEGO,AGUA,PLANTA,ELECTRICO,VENENO,PSIQUICO,HADA,TIERRA,HIELO,ROCA,VOLADOR,FANTASMA;
    public static double obtenerMultiplicadorDeDaño(TipoPokemon atacante, List<TipoPokemon> defensores){
        double multiplicador=1.0;
        for(TipoPokemon defensor:defensores){
            multiplicador*=obtenerEfectividad(atacante, defensor); 
        }
        return multiplicador;
    }
     private static double obtenerEfectividad(TipoPokemon atacante,TipoPokemon defensor){
       if(atacante==FUEGO){
           if (defensor==PLANTA) return 2.0;
           if (defensor==AGUA) return 0.5;
           if (defensor==ELECTRICO) return 1.0;
           if (defensor==TIERRA) return 0.5;
           if (defensor==ROCA) return 0.5;
       }
       if(atacante==AGUA){
           if (defensor==FUEGO) return 2.0;
           if (defensor==PLANTA) return 0.5;
           if (defensor==ELECTRICO) return 0.5;
           if (defensor==TIERRA) return 2.0;
       }
       if(atacante==PLANTA){
           if (defensor==AGUA) return 2.0;
           if (defensor==FUEGO) return 0.5;
           if (defensor==TIERRA) return 2.0;
           if (defensor==VOLADOR) return 0.5;
       }
       if(atacante==ELECTRICO){
           if (defensor==AGUA) return 2.0;
           if (defensor==TIERRA) return 0.0;
           if (defensor==VOLADOR) return 1.0;
       }
       if(atacante==VENENO){
           if (defensor==PLANTA) return 2.0;
           if (defensor==VENENO) return 0.5;
           if (defensor==HADA) return 2.0;
       }
       if(atacante==PSIQUICO){
           if (defensor==PSIQUICO) return 0.5;
           if (defensor==FANTASMA) return 2.0;
       }
       if(atacante==HADA){
           if (defensor==FANTASMA) return 1.0;
       }
       if(atacante==TIERRA){
           if (defensor==AGUA) return 0.5;
           if (defensor==FUEGO) return 2.0;
       }
       if(atacante==HIELO){
           if (defensor==PLANTA) return 2.0;
           if (defensor==AGUA) return 0.5;
     }
       if(atacante==ROCA){
           if (defensor==FUEGO) return 2.0;
           if (defensor==AGUA) return 0.5;
}
        if(atacante==VOLADOR){
           if (defensor==TIERRA) return 2.0;      
}
        if(atacante==FANTASMA){
           if (defensor==FANTASMA) return 2.0;
}
        return 1.0;
     }
     }
