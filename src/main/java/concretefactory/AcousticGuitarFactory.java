package concretefactory;

import concreteproduct.AcousticGuitar;
import interfaces.abstractfactory.GuitarFactory;
import interfaces.abstractproduct.Instrument;

public class AcousticGuitarFactory implements GuitarFactory {
    @Override
    public Instrument createInstrument() {
        return new AcousticGuitar();
    }

    @Override
    public void playInstrument() {
        System.out.println("Playing acoustic guitar");
    }
}