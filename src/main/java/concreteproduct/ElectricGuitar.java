package concreteproduct;

import interfaces.abstractproduct.Instrument;

public class ElectricGuitar implements Instrument {
    @Override
    public void playInstrument() {
        System.out.println("Playing electric guitar");
    }
}