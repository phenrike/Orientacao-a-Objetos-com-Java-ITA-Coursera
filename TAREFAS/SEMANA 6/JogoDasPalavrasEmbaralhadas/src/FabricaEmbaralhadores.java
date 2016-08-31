import java.util.Random;

public class FabricaEmbaralhadores {

	private Embaralhador embaralhador;

	public Embaralhador getEmbaralhador() {
		Random r = new Random();
		switch (r.nextInt(2)) {
		case 0:
			embaralhador = new EmbaralhadorImparPar();
			return embaralhador;
		case 1:
			embaralhador = new EmbaralhadorComStringBuilder();
			return embaralhador;
		default:
			return null;
		}
	}
}
