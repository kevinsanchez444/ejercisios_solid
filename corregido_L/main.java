public class main {
    public static void main(String[] args) {
        // Creando instancias de las clases (nombres en minúscula para que coincidan con archivos)
        aguila aguila = new aguila("Águila Real");
        pinguino pinguino = new pinguino("Pingüino Emperador");

        // Usar la interfaz `volador` sólo para los que realmente pueden volar
        if (aguila instanceof volador) {
            ((volador) aguila).volar();
        }

        if (pinguino instanceof volador) {
            ((volador) pinguino).volar();
        } else {
            System.out.println(pinguino.getNombre() + " no puede volar.");
        }
    }
}
