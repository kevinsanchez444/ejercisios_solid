package tipo_pato;

import clase_abstracta.Pato;
public class PatoDeCasa extends Pato {
    public PatoDeCasa() {
        establecerComportamientoDeVuelo("Sin vuelo");
        establecerComportamientoDeGraznido("Mudo");
    }

    @Override
    public void dibujar() {
        System.out.println("  ____");
        System.out.println(" /____\\");
        System.out.println("| [] [] |  Pato de casa cuadrado");
        System.out.println("|  __  |");
        System.out.println(" \\____/");
    }
}
