public class SinVuelo implements ComportamientoDeVuelo {
    @Override
    public void volar() {
        System.out.println("No puede volar: se queda en el agua o en tierra.");
    }
}
