import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class BancoDePalavras {

	private ArrayList<String> listaDePalavras;
	private String palavra;

	public BancoDePalavras() {
		lerArquivo();
	}

	public void lerArquivo() {
		listaDePalavras = new ArrayList<String>();

		try {
			FileReader arq = new FileReader("ListaDePalavras.txt");
			BufferedReader lerArq = new BufferedReader(arq);

			String linha = lerArq.readLine();
			while (linha != null) {
				listaDePalavras.add(linha);
				linha = lerArq.readLine();
			}

			arq.close();

		} catch (IOException e) {
			System.err.printf("Erro ao ler ou encontrar o arquivo: %s.\n", e.getMessage());
		}
	}

	public String getPalavra() {
		Random r = new Random();
		if (listaDePalavras.size() > 0) {
			int index = r.nextInt(listaDePalavras.size());
			palavra = listaDePalavras.get(index);
			listaDePalavras.remove(index);
		}
		return palavra;
	}
}
