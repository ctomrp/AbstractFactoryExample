package concretefactory;

import concreteproduct.ElectroacousticGuitar;
import interfaces.abstractfactory.GuitarFactory;
import interfaces.abstractproduct.Instrument;

public class ElectroacousticGuitarFactory implements GuitarFactory {
    @Override
    public Instrument createInstrument() {
        return new ElectroacousticGuitar();
    }

    @Override
    public void playInstrument() {
        System.out.println("Playing electroacoustic guitar");
    }
}