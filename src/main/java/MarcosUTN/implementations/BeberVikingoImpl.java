package MarcosUTN.implementations;

import MarcosUTN.interfaces.Beber;

import java.util.Random;

public class BeberVikingoImpl implements Beber {
    public Integer Beber() {
        Integer ran =  new Random().nextInt(100);
        return ran;
    }
}
