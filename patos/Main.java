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

		System.out.println("\nCambiando comportamiento en tiempo de ejecución para el pato de casa:");
		patoDeCasa.establecerComportamientoDeVuelo(new VolarConAlas());
		patoDeCasa.establecerComportamientoDeGraznido(new Quack());
		patoDeCasa.emprenderVuelo();
		patoDeCasa.hacerQuack();
	}

	private static void mostrarPato(Pato pato) {
		pato.dibujar();
		pato.nadar();
		pato.emprenderVuelo();
		pato.hacerQuack();
		System.out.println();
	}
}
