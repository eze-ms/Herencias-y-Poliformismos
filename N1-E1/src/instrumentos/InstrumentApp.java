package instrumentos;

import instrumentos.modelo.Instrument;

public class InstrumentApp {
    public static void main(String[] args) {
        System.out.println("Inicio del programa.");

        // Acceder al miembro estático (sin crear instancias)
        System.out.println("Categoría de instrumentos: " + Instrument.CATEGORY);

        // Crear instrumentos de viento
        Instrument flute = Instrument.createInstrument("flute", "Flute", 130.0);
        Instrument saxophone = Instrument.createInstrument("saxophone", "Saxophone", 150.0);
        Instrument trumpet = Instrument.createInstrument("trumpet", "Trumpet", 90.0);

        // Llamar al método tocar()
        flute.tocar();
        saxophone.tocar();
        trumpet.tocar();

        // Crear instrumentos de cuerda
        Instrument guitar = Instrument.createInstrument("guitar", "Guitar", 300.0);
        Instrument violin = Instrument.createInstrument("violin", "Violin", 400.0);
        Instrument cello = Instrument.createInstrument("cello", "Cello", 250.0);

        // Llamar al método tocar()
        guitar.tocar();
        violin.tocar();
        cello.tocar();

        // Crear instrumentos de percusión
        Instrument drums = Instrument.createInstrument("drums", "Drums", 500.0);
        Instrument xylophone = Instrument.createInstrument("xylophone", "Xylophone", 200.0);
        Instrument tambourine = Instrument.createInstrument("tambourine", "Tambourine", 400.0);

        // Llamar al método tocar()
        drums.tocar();
        xylophone.tocar();
        tambourine.tocar();

        System.out.println("Fin del programa.");

        // Imprimir detalles de los instrumentos
        System.out.println("\nDetalles de los instrumentos de viento:");
        System.out.println(flute);
        System.out.println(saxophone);
        System.out.println(trumpet);

        System.out.println("\nDetalles de los instrumentos de cuerda:");
        System.out.println(guitar);
        System.out.println(violin);
        System.out.println(cello);

        System.out.println("\nDetalles de los instrumentos de percusión:");
        System.out.println(drums);
        System.out.println(xylophone);
        System.out.println(tambourine);
    }
}
