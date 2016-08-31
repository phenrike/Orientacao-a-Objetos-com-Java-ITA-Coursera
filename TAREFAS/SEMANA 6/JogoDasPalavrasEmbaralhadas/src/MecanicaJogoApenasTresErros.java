
public class MecanicaJogoApenasTresErros implements MecanicaDoJogo {

	private int pontuacao;
	private int numeroDeErros;
	private int numeroDePalavras;
	BancoDePalavras bancoDePalavras = new BancoDePalavras();
	Embaralhador embaralhador = new FabricaEmbaralhadores().getEmbaralhador();
	private String palavra;

	public MecanicaJogoApenasTresErros() {
		super();
		this.pontuacao = 0;
		this.numeroDeErros = 0;
		this.numeroDePalavras = 0;
	}

	@Override
	public String mostrarPalavra() {
		palavra = bancoDePalavras.getPalavra();
		return "Tente acertar qual � a palavra: " + embaralhador.embaralhar(palavra);
	}

	@Override
	public String verificarPalavraDigitada(String palavraDoJogador) {
		if (palavra.equals(palavraDoJogador)) {
			adicionaPontuacao(palavra.length());
			numeroDePalavras++;
			return "Acertou, a palavra �: " + palavra;
		} else {
			numeroDeErros++;
			numeroDePalavras++;
			return "Errou, a palavra �: " + palavra;
		}
	}

	@Override
	public Boolean fimDoJogo() {
		if (numeroDePalavras < 20) {
			if (numeroDeErros < 3) {
				return false;
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@Override
	public void adicionaPontuacao(int numeroDeLetras) {
		pontuacao = pontuacao + numeroDeLetras * 2;
	}

	public int getPontuacao() {
		return pontuacao;
	}

}
