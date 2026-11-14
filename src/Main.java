
public class Main {

    public static void main(String[] args) {

        // Crear objeto Automovil
        Automovil auto = new Automovil(
                "Toyota", "Corolla", 2022, 4
        );

        // Crear objeto Motocicleta
        Motocicleta moto = new Motocicleta(
                "Yamaha", "FZ", 2023, 150
        );

        System.out.println("===== AUTOMOVIL =====");

        auto.mostrarInformacion();
        auto.arrancar();
        auto.abrirCajuela();

        System.out.println();

        System.out.println("===== MOTOCICLETA =====");

        moto.mostrarInformacion();
        moto.arrancar();
        moto.hacerCaballito();
    }
}
