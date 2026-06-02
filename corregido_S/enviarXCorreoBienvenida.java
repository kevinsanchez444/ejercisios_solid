package mal;

public class enviarXCorreoBienvenida {
    private String correo;
    public enviarXCorreoBienvenida(String correo) {
        this.correo = correo;
    }
       public void enviarCorreoBienvenida() {

        System.out.println(
                "Enviando correo a: " + correo);
    }
}
