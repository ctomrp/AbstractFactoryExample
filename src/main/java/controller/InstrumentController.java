package controller;

import interfaces.abstractfactory.InstrumentFactory;
import interfaces.abstractproduct.Instrument;

import java.util.Scanner;

public class InstrumentController {
    private Scanner scanner;

    public InstrumentController() {
        this.scanner = new Scanner(System.in);
    }

    public void runMenu() {
        while (true) {
            System.out.println("Escoge un tipo de instrumento:");
            System.out.println("1. Guitarra eléctrica");
            System.out.println("2. Guitarra acústica");
            System.out.println("3. Guitarra clásica");
            System.out.println("4. Guitarra electroacústica");
            System.out.println("5. Bajo de 4 cuerdas");
            System.out.println("6. Bajo de 5 cuerdas");
            System.out.println("0. Salir");

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Saliendo del programa. ¡Adiós!");
                break;
            }

            Instrument instrument = createInstrument(choice);

            if (instrument != null) {
                instrument.playInstrument();
            } else {
                System.out.println("Opción inválida. Por favor, ingrese un número entre 1 y 6.");
            }
        }
    }

    private Instrument createInstrument(int choice) {
        InstrumentFactory factory = null;

        switch (choice) {
            case 1:
                factory = new concretefactory.ElectricGuitarFactory();
                break;
            case 2:
                factory = new concretefactory.AcousticGuitarFactory();
                break;
            case 3:
                factory = new concretefactory.ClassicalGuitarFactory();
                break;
            case 4:
                factory = new concretefactory.ElectroacousticGuitarFactory();
                break;
            case 5:
                factory = new concretefactory.FourStringBassFactory();
                break;
            case 6:
                factory = new concretefactory.FiveStringBassFactory();
                break;
        }

        if (factory != null) {
            return factory.createInstrument();
        } else {
            return null;
        }
    }
}
