public class aguila extends ave implements volador {

    public aguila(String nombre) {
        super(nombre);
    }

    @Override
    public void volar() {
        System.out.println(nombre + " está volando alto.");
    }
}
