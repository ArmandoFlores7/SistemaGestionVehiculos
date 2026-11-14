public class Automovil extends Vehiculo {

    private int numeroPuertas;

    public Automovil(String marca, String modelo, int anio, int numeroPuertas) {
        super(marca, modelo, anio);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void arrancar() {
        System.out.println("El automovil arranca con llave o boton.");
    }

    public void abrirCajuela() {
        System.out.println("La cajuela esta abierta.");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Numero de puertas: " + numeroPuertas);
    }
}
