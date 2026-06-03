public class PatoMandarin extends Pato {
    public PatoMandarin() {
        comportamientoDeVuelo = new VolarConAlas();
        comportamientoDeGraznido = new Quack();
    }

    @Override
    public void dibujar() {
        System.out.println("   __");
        System.out.println(" _( o>");
        System.out.println(" \\_/");
        System.out.println("Pato Mandarín con plumaje exótico");
    }
}
