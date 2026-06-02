package mal;

public class imprimirCarnet {
    private String nombre;

    public imprimirCarnet(String nombre) {
        this.nombre = nombre;
    }

    public void imprimirCarnet() {

        System.out.println("===== CARNET =====");
        System.out.println("Cliente: " + nombre);
        System.out.println("==================");
    }
}
