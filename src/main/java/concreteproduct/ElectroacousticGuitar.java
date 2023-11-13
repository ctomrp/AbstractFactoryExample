package concreteproduct;

import interfaces.abstractproduct.Instrument;

public class ElectroacousticGuitar implements Instrument {
    @Override
    public void playInstrument() {
        System.out.println("Playing electroacoustic guitar");
    }
}