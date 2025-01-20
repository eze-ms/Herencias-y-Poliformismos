public class Telefono {
    private String marca;
    private String modelo;


    public Telefono(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }


    public void llamar(String numero) {
        System.out.println("Se está llamando al número: " + numero);
    }


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}
