package clase_abstracta;

import comportamiento.Chillido;
import comportamiento.ComportamientoDeGraznido;
import comportamiento.ComportamientoDeVuelo;
import comportamiento.Mudo;
import comportamiento.Quack;
import tipo_vuelo.SinVuelo;
import tipo_vuelo.VolarConAlas;

import java.util.HashMap;
import java.util.Map;

public abstract class Pato {
    private ComportamientoDeVuelo comportamientoDeVuelo;
    private ComportamientoDeGraznido comportamientoDeGraznido;
    private String tipoVuelo;
    private String tipoGraznido;

    private static final Map<String, ComportamientoDeVuelo> COMPORTAMIENTOS_VUELO = new HashMap<>();
    private static final Map<String, ComportamientoDeGraznido> COMPORTAMIENTOS_GRAZNIDO = new HashMap<>();

    static {
        COMPORTAMIENTOS_VUELO.put("volar con alas", new VolarConAlas());
        COMPORTAMIENTOS_VUELO.put("con alas", new VolarConAlas());
        COMPORTAMIENTOS_VUELO.put("volar", new VolarConAlas());
        COMPORTAMIENTOS_VUELO.put("sin vuelo", new SinVuelo());
        COMPORTAMIENTOS_VUELO.put("no vuela", new SinVuelo());

        COMPORTAMIENTOS_GRAZNIDO.put("quack", new Quack());
        COMPORTAMIENTOS_GRAZNIDO.put("normal", new Quack());
        COMPORTAMIENTOS_GRAZNIDO.put("chillido", new Chillido());
        COMPORTAMIENTOS_GRAZNIDO.put("pito", new Chillido());
        COMPORTAMIENTOS_GRAZNIDO.put("mudo", new Mudo());
        COMPORTAMIENTOS_GRAZNIDO.put("silencio", new Mudo());
    }

    public void nadar() {
        System.out.println("El pato está nadando.");
    }

    public abstract void dibujar();

    public void hacerQuack() {
        comportamientoDeGraznido.quack(tipoGraznido);
    }

    public void emprenderVuelo() {
        comportamientoDeVuelo.volar(tipoVuelo);
    }
    protected void establecerComportamientoDeVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
        this.comportamientoDeVuelo = COMPORTAMIENTOS_VUELO.getOrDefault(tipoVuelo.toLowerCase(), new SinVuelo());
    }

    protected void establecerComportamientoDeGraznido(String tipoGraznido) {
        this.tipoGraznido = tipoGraznido;
        this.comportamientoDeGraznido = COMPORTAMIENTOS_GRAZNIDO.getOrDefault(tipoGraznido.toLowerCase(), new Mudo());
    }
}
