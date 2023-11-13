package concreteproduct;

import interfaces.abstractproduct.Instrument;

public class ClassicalGuitar implements Instrument {
    @Override
    public void playInstrument() {
        System.out.println("Playing classical guitar");
    }
}