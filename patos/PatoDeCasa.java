public class PatoDeCasa extends Pato {
    public PatoDeCasa() {
        comportamientoDeVuelo = new SinVuelo();
        comportamientoDeGraznido = new Mudo();
    }

    @Override
    public void dibujar() {
        System.out.println("  ____");
        System.out.println(" /____\\");
        System.out.println("| [] [] |  Pato de casa cuadrado");
        System.out.println("|  __  |");
        System.out.println(" \\____/");
    }
}
