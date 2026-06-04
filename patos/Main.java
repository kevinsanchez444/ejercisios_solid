
import clase_abstracta.Pato;
import tipo_pato.PatoMallard;
import tipo_pato.PatoMandarin;
import tipo_pato.PatoDeHule;
import tipo_pato.PatoDeCasa;

public class Main {
	public static void main(String[] args) {
		Pato patoMallard = new PatoMallard();
		Pato patoMandarin = new PatoMandarin();
		Pato patoDeHule = new PatoDeHule();
		Pato patoDeCasa = new PatoDeCasa();

		mostrarPato(patoMallard);
		mostrarPato(patoMandarin);
		mostrarPato(patoDeHule);
		mostrarPato(patoDeCasa);
	}


	private static void mostrarPato(Pato pato) {
		pato.dibujar();
		pato.nadar();
		pato.emprenderVuelo();
		pato.hacerQuack();
		System.out.println();
	}
}
