package comportamiento;
public class Mudo implements ComportamientoDeGraznido {
    @Override
    public void quack(String tipoGraznido) {
        System.out.println(tipoGraznido + ": este pato no emite sonido.");
    }
}
