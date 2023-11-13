package concreteproduct;

import interfaces.abstractproduct.Instrument;

public class FiveStringBass implements Instrument {
    @Override
    public void playInstrument() {
        System.out.println("Playing 5-string bass");
    }
}