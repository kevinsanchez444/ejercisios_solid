package tipo_vuelo;
import comportamiento.ComportamientoDeVuelo;

public class VolarConAlas implements ComportamientoDeVuelo {
    @Override
    public void volar(String tipoVuelo) {
        System.out.println(tipoVuelo + ": despegando y planeando.");
    }
}
