package comportamiento;
public class Chillido implements ComportamientoDeGraznido {
    @Override
    public void quack(String tipoGraznido) {
        System.out.println(tipoGraznido + ": sonido de pato producido por un pito.");
    }
}
