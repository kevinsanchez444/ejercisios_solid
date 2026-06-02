package mal;

public class generarReportePuntos {
    private int puntos;

    public generarReportePuntos(int puntos) {
        this.puntos = puntos;
    }

       public void generarReportePuntos() {

        System.out.println(
                "Puntos acumulados: " + puntos);
    }
}

