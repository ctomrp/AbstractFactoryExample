package concreteproduct;

import interfaces.abstractproduct.Instrument;

public class AcousticGuitar implements Instrument {
    @Override
    public void playInstrument() {
        System.out.println("Playing acoustic guitar");
    }
}