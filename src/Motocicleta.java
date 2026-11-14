public class Motocicleta extends Vehiculo {

    private int cilindrada;

    public Motocicleta(String marca, String modelo, int anio, int cilindrada) {
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
    }

    @Override
    public void arrancar() {
        System.out.println("La motocicleta arranca al encender el motor.");
    }

    public void hacerCaballito() {
        System.out.println("La motocicleta realiza una demostracion.");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}
