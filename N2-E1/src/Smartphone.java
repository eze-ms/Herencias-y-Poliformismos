public class Smartphone extends Telefono implements Camara, Reloj {
    // Constructor
    public Smartphone(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void fotografiar() {
        System.out.println("Se está haciendo una foto.");
    }

    @Override
    public void alarma() {
        System.out.println("Está sonando la alarma.");
    }
}
