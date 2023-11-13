package concretefactory;

import concreteproduct.FourStringBass;
import interfaces.abstractfactory.BassFactory;
import interfaces.abstractproduct.Instrument;

public class FourStringBassFactory implements BassFactory {
    @Override
    public Instrument createInstrument() {
        return new FourStringBass();
    }

    @Override
    public void playInstrument() {
        System.out.println("Playing four string bass");
    }
}