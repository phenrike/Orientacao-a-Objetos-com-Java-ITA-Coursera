import java.util.Scanner;

public class Principal {

	public static int recorde;

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String opcao = "";
		String nomeJogador = "";

		System.out.println(" ");
		System.out.println("Digite o seu nome: ");
		nomeJogador = teclado.next();

		System.out.println(" ");
		System.out.println("Escolha uma op��o de jogo abaixo: ");
		System.out.println(" ");
		System.out.println("Digite 1 para jogar no modo livre, onde voc� tenta acertar 20 palavras.");
		System.out.println(" ");
		System.out.println("Digite 2 para jogar no modo 3 erros, onde se voc� errar 3 palavras o jogo termina.");
		System.out.println(" ");
		opcao = teclado.next();

		if (opcao.equals("1") || opcao.equals("2")) {
			MecanicaDoJogo mecanica = new FabricaMecanicaDoJogo().getMecanica(Integer.parseInt(opcao));

			while (!mecanica.fimDoJogo()) {
				System.out.println(" ");
				System.out.println("------------------------------------------------------------------------");
				System.out.println(mecanica.mostrarPalavra());
				String palavraDigitada = teclado.next();
				System.out.println(" ");
				System.out.println(mecanica.verificarPalavraDigitada(palavraDigitada));
				System.out.println("------------------------------------------------------------------------");
			}

			if (mecanica.getPontuacao() > recorde) {
				recorde = mecanica.getPontuacao();
				System.out.println(" ");
				System.out.println("========================================================================");
				System.out.println("Parab�ns voc� quebrou o Recorde");
				System.out.println("Novo Recorde: " + mecanica.getPontuacao());
				System.out.println("========================================================================");
			}

			System.out.println(" ");
			System.out.println("========================================================================");
			System.out.println("Fim do jogo!");
			System.out.println(" ");
			System.out.println(nomeJogador + " sua pontu��o foi: " + mecanica.getPontuacao() + " pontos.");
			System.out.println(" ");
			System.out.println("Recorde: " + recorde);
			System.out.println("========================================================================");
			System.out.println(" ");
			System.out.println("========================================================================");
			System.out.println("Deseja jogar novamente? ");
			System.out.println("Responda 's' para Sim ou 'n' para N�o: ");
			if (teclado.next().equals("s")) {
				main(null);
			}
		} else {
			System.out.println(" ");
			System.out.println("A op��o digitada n�o existe! Por favor selecione a op��o 1 ou 2!");
			System.out.println(" ");
			System.out.println("========================================================================");
			main(null);
		}
	}
}
