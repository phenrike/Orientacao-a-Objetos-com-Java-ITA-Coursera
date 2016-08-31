import java.util.HashMap;
import java.util.Map;

public class Pizza {

	double preco;
	int numeroingredientes;
	static Map<String, Integer> ingredientes = new HashMap<String, Integer>();

	public void AdicionaIngrediente(String ingrediente) {
		numeroingredientes = numeroingredientes + 1;
		ContabilizaIngrediente(ingrediente);
	}

	public double GetPreco() {

		if (numeroingredientes <= 2) {
			preco = 15.00;
		} else if (numeroingredientes <= 5) {
			preco = 20.00;
		} else if (numeroingredientes > 5) {
			preco = 23.00;
		}
		
		System.out.println("O preço da pizza é " + preco);

		return preco;
	}

	private static void ContabilizaIngrediente(String nomeingrediente) {

		Integer qtd = ingredientes.get(nomeingrediente);
		if (qtd == null) {
			ingredientes.put(nomeingrediente, new Integer(1));
		} else {
			qtd++;
			ingredientes.remove(nomeingrediente);
			ingredientes.put(nomeingrediente, new Integer(qtd));
		}
	}

	public static void QuantidadeDeCadaIngrediente() {
		for (String key : ingredientes.keySet()) {
			System.out.println("A quantidade do ingrediente " + key + " é " + ingredientes.get(key));
		}
	}
	
	public static void ZerarValor() {
		ingredientes.clear();
	}
}
