import interfaces.abstractfactory.InstrumentFactory;
import interfaces.abstractproduct.Instrument;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escoga un tipo de instrumento:");
            System.out.println("1. Guitarra eléctrica");
            System.out.println("2. Guitarra acústica");
            System.out.println("3. Guitarra clásica");
            System.out.println("4. Guitarra electroacústica");
            System.out.println("5. Bajo de 4 cuerdas");
            System.out.println("6. Bajo de 5 cuerdas");
            System.out.println("0. Salir");

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Saliendo del programa. Adiós!");
                break;
            }

            Instrument instrument = createInstrument(choice);

            if (instrument != null) {
                instrument.playInstrument();
            } else {
                System.out.println("Opción inválida. Por favor ingrese un número entre 1 y 6.");
            }
        }
    }

    private static Instrument createInstrument(int choice) {
        switch (choice) {
            case 1:
                return createInstrument(new concretefactory.ElectricGuitarFactory());
            case 2:
                return createInstrument(new concretefactory.AcousticGuitarFactory());
            case 3:
                return createInstrument(new concretefactory.ClassicalGuitarFactory());
            case 4:
                return createInstrument(new concretefactory.ElectroacousticGuitarFactory());
            case 5:
                return createInstrument(new concretefactory.FourStringBassFactory());
            case 6:
                return createInstrument(new concretefactory.FiveStringBassFactory());
            default:
                return null;
        }
    }

    private static Instrument createInstrument(InstrumentFactory factory) {
        return factory.createInstrument();
    }
}
