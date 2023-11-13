package concretefactory;

import concreteproduct.ElectricGuitar;
import interfaces.abstractfactory.GuitarFactory;
import interfaces.abstractproduct.Instrument;

public class ElectricGuitarFactory implements GuitarFactory {
    @Override
    public Instrument createInstrument() {
        return new ElectricGuitar();
    }

    @Override
    public void playInstrument() {
        System.out.println("Playing electric guitar");
    }
}