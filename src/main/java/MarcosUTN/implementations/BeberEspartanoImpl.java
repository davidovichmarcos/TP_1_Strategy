package MarcosUTN.implementations;

import MarcosUTN.interfaces.Beber;

import java.util.Random;

public class BeberEspartanoImpl implements Beber {
    public Integer Beber() {
        Integer ran =  new Random().nextInt(100);
        return ran;
    }
}
