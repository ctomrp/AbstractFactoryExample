package interfaces.abstractfactory;

import interfaces.abstractproduct.Instrument;

public interface InstrumentFactory {
    Instrument createInstrument();
    void playInstrument();
}