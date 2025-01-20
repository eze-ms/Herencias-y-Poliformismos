package instrumentos.modelo;

import instrumentos.modelo.wind.Flute;
import instrumentos.modelo.wind.Saxophone;
import instrumentos.modelo.wind.Trumpet;
import instrumentos.modelo.string.Guitar;
import instrumentos.modelo.string.Violin;
import instrumentos.modelo.string.Cello;
import instrumentos.modelo.percusion.Drums;
import instrumentos.modelo.percusion.Xylophone;
import instrumentos.modelo.percusion.Tambourine;

public abstract class Instrument {
    private final String name;
    private final Double price;

    // Bloque estático
    static {
        System.out.println("Clase Instrument cargada en memoria.");
    }

    // Miembro estático
    public static final String CATEGORY = "Instrumento musical";

    // Constructor
    protected Instrument(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    // Método estático de fábrica para validar y crear instancias
    public static Instrument createInstrument(String type, String name, Double price) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío.");
        }
        if (price == null || price <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor que 0.");
        }

        // Lógica para retornar instancias específicas
        return switch (type.toLowerCase()) {
            case "flute" -> new Flute(name, price);
            case "saxophone" -> new Saxophone(name, price);
            case "trumpet" -> new Trumpet(name, price);
            case "guitar" -> new Guitar(name, price);
            case "violin" -> new Violin(name, price);
            case "cello" -> new Cello(name, price);
            case "drums" -> new Drums(name, price);
            case "xylophone" -> new Xylophone(name, price);
            case "tambourine" -> new Tambourine(name, price);
            default -> throw new UnsupportedOperationException(
                    "Tipo de instrumento desconocido: " + type
            );
        };
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public abstract void tocar();

    @Override
    public String toString() {
        return String.format("Instrumento: %s | Precio: %.2f€", name, price);
    }
}
