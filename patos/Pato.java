public abstract class Pato {
    protected ComportamientoDeVuelo comportamientoDeVuelo;
    protected ComportamientoDeGraznido comportamientoDeGraznido;

    public void nadar() {
        System.out.println("El pato está nadando.");
    }

    public abstract void dibujar();

    public void hacerQuack() {
        comportamientoDeGraznido.quack();
    }

    public void emprenderVuelo() {
        comportamientoDeVuelo.volar();
    }

    public void establecerComportamientoDeVuelo(ComportamientoDeVuelo comportamientoDeVuelo) {
        this.comportamientoDeVuelo = comportamientoDeVuelo;
    }

    public void establecerComportamientoDeGraznido(ComportamientoDeGraznido comportamientoDeGraznido) {
        this.comportamientoDeGraznido = comportamientoDeGraznido;
    }
}
