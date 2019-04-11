package MarcosUTN.implementations;

import MarcosUTN.interfaces.Orinar;

import java.util.Random;

public class OrinarVikingoImpl implements Orinar {
    public Integer Orinar() {
        Integer ran =  new Random().nextInt(100);
        return ran;
    }
}
