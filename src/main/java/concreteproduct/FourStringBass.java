package concreteproduct;

import interfaces.abstractproduct.Instrument;

public class FourStringBass implements Instrument {
    @Override
    public void playInstrument() {
        System.out.println("Playing 4-string bass");
    }
}