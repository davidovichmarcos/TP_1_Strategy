package MarcosUTN.entities;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Tournament {

    public static void sortTeams(List<Humano> vikingos, List<Humano> espartanos) {
        vikingos.sort(Comparator.comparing(Humano::getPeso));
        espartanos.sort(Comparator.comparing(Humano::getPeso));
    }
    public static void presentTeams(List<Humano> humanos) {
        for (Humano humano : humanos) {
            if (humano instanceof Vikingo)
            {
                Vikingo vikingo = (Vikingo) humano;
                System.out.println(vikingo.toString()+"\n");
            } else if (humano instanceof  Espartano) {
                Espartano espartano = (Espartano) humano;
                System.out.println(espartano.toString()+"\n");
            } else {
                System.out.println(humano.toString()+"\n");
            }
        }
    }

    public static List<Humano> getFighters(List<Humano> vikingos, List<Humano> espartanos) {
        List<Humano> fighters = new ArrayList<>();
        fighters.add(vikingos.get(0));
        fighters.add(espartanos.get(0));
        return fighters;
    }

    public static Humano fight(Humano vikingo, Humano espartano) {
        Vikingo v = (Vikingo) vikingo;
        Espartano e = (Espartano) espartano;
        Integer damageViking;
        Integer damageSpartan;
        damageViking = v.fight();
        damageSpartan = e.fight();

        if (damageViking > damageSpartan){
            return vikingo;
        } else if (damageSpartan > damageViking) {
            return espartano;
        } else {
            return null;
        }
    }

}
