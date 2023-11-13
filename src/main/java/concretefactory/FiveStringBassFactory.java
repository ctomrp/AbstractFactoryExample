package concretefactory;

import concreteproduct.FiveStringBass;
import interfaces.abstractfactory.BassFactory;
import interfaces.abstractproduct.Instrument;

public class FiveStringBassFactory implements BassFactory {
    @Override
    public Instrument createInstrument() {
        return new FiveStringBass();
    }

    @Override
    public void playInstrument() {
        System.out.println("Playing five string bass");
    }
}