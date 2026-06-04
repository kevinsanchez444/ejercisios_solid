package tipo_pato;

import clase_abstracta.Pato;
public class PatoDeHule extends Pato {
    public PatoDeHule() {
        establecerComportamientoDeVuelo("Sin vuelo");
        establecerComportamientoDeGraznido("Quack");
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
