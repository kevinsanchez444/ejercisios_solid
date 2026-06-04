package comportamiento;
public class Quack implements ComportamientoDeGraznido {
    @Override
    public void quack(String tipoGraznido) {
        System.out.println(tipoGraznido + ": sonido normal de pato.");
    }
}
