package MarcosUTN;

import MarcosUTN.entities.Espartano;
import MarcosUTN.entities.Humano;
import MarcosUTN.entities.Tournament;
import MarcosUTN.entities.Vikingo;
import MarcosUTN.implementations.BeberEspartanoImpl;
import MarcosUTN.implementations.BeberVikingoImpl;
import MarcosUTN.implementations.OrinarEspartanoImpl;
import MarcosUTN.implementations.OrinarVikingoImpl;
import MarcosUTN.repository.Connection;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * TP1 Marcos Davidovich.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Connection c = new Connection();
        try {
            c.connect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Tournament t = new Tournament();
        List<Humano> vikingos =
                Arrays.asList(
                        new Vikingo("Ragnar",43,80,new OrinarVikingoImpl(),new BeberVikingoImpl(),100),
                        new Vikingo("Floki",46,50,new OrinarVikingoImpl(),new BeberVikingoImpl(),80),
                        new Vikingo("Byorn",22,70,new OrinarVikingoImpl(),new BeberVikingoImpl(),85),
                        new Vikingo("Ivar",15,40,new OrinarVikingoImpl(),new BeberVikingoImpl(),65),
                        new Vikingo("Lagertha",43,30,new OrinarVikingoImpl(),new BeberVikingoImpl(),95));
        List<Humano> espartanos =
                Arrays.asList(
                        new Espartano("Prometeo",40,45,new OrinarEspartanoImpl(), new BeberVikingoImpl(),74),
                        new Espartano("Spartacus",45,68,new OrinarEspartanoImpl(), new BeberVikingoImpl(),20),
                        new Espartano("Gregorius",50,90,new OrinarEspartanoImpl(), new BeberVikingoImpl(),10),
                        new Espartano("Victorius",44,56,new OrinarEspartanoImpl(), new BeberVikingoImpl(),90),
                        new Espartano("Spartan",20,78,new OrinarEspartanoImpl(), new BeberVikingoImpl(),50));

        t.sortTeams(vikingos,espartanos);
        System.out.println("---------Vikingos---------");
        t.presentTeams(vikingos);

        System.out.println("---------Espartanos---------");
        t.presentTeams(espartanos);
        System.out.println("---------Competidores---------");
        List<Humano> fighters = t.getFighters(vikingos,espartanos);
        t.presentTeams(fighters);
        Humano winner = t.fight(fighters.get(0),fighters.get(1));
        System.out.println("Winner winner chicken dinner! "+winner.toString());
        c.insertResult(winner);
        Humano tabernOwner = new Humano("Tabern Owner",99,99,new OrinarEspartanoImpl(), new BeberVikingoImpl());
        Humano veryWinner = t.lastFight(tabernOwner,winner);
        System.out.println("\nThe very winner is... "+veryWinner.toString()+"!");
        c.insertResult(veryWinner);
    }

}
