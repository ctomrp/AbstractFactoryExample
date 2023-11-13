package concretefactory;

import concreteproduct.ClassicalGuitar;
import interfaces.abstractfactory.GuitarFactory;
import interfaces.abstractproduct.Instrument;

public class ClassicalGuitarFactory implements GuitarFactory {
    @Override
    public Instrument createInstrument() {
        return new ClassicalGuitar();
    }

    @Override
    public void playInstrument() {
        System.out.println("Playing classical guitar");
    }
}