public class PatoDeHule extends Pato {
    public PatoDeHule() {
        comportamientoDeVuelo = new SinVuelo();
        comportamientoDeGraznido = new Quack();
    }

    @Override
    public void dibujar() {
        System.out.println("  _____");
        System.out.println(" /     \\");
        System.out.println("(  o o  )   Pato de hule con ojos redondos");
        System.out.println(" \\  ^  /");
        System.out.println("  -----");
    }
}
