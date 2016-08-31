
public class FabricaMecanicaDoJogo {

	private MecanicaDoJogo mecanica;

	public MecanicaDoJogo getMecanica(int opcao) {

		switch (opcao) {
		case 1:
			mecanica = new MecanicaJogoLivre();
			return mecanica;
		case 2:
			mecanica = new MecanicaJogoApenasTresErros();
			return mecanica;
		default:
			return null;
		}

	}

}
