package tipo_pato;

import clase_abstracta.Pato;
public class PatoMandarin extends Pato {
    public PatoMandarin() {
        establecerComportamientoDeVuelo("Volar con alas");
        establecerComportamientoDeGraznido("Quack");
    }

    @Override
    public void dibujar() {
        System.out.println("   __");
        System.out.println(" _( o>");
        System.out.println(" \\_/");
        System.out.println("Pato Mandarín con plumaje exótico");
    }
}
