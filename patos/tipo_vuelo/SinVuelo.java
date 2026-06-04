package tipo_vuelo;
import comportamiento.ComportamientoDeVuelo;

public class SinVuelo implements ComportamientoDeVuelo {
    @Override
    public void volar(String tipoVuelo) {
        System.out.println(tipoVuelo + ": no puede volar; se queda en el agua o en tierra.");
    }
}
