package tipo_pato;

import clase_abstracta.Pato;
public class PatoMallard extends Pato {
    public PatoMallard() {
        establecerComportamientoDeVuelo("Volar con alas");
        establecerComportamientoDeGraznido("Quack");
    }

    @Override
    public void dibujar() {
        System.out.println("  _  _");
        System.out.println("<( \\_\\_>  Pato Mallard");
        System.out.println("  (o o)   con plumaje verde y amarillo");
        System.out.println("   /_\\");
    }
}
