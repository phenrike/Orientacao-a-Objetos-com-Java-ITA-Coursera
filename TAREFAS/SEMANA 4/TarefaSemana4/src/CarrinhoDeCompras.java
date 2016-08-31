import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {

	private Map<Produto, Integer> produtos = new HashMap<>();
	private double valorTotalDaCompra;

	public void adicionaProduto(Produto p, int quantidade) {
		if (produtos.containsKey(p)) {
			for (Produto key : produtos.keySet()) {
				if (p.equals(key)) {
					produtos.put(p, produtos.get(p) + quantidade);
					this.valorTotalDaCompra += p.getPreco() * quantidade;
				}
			}
		} else {
			produtos.put(p, quantidade);
			this.valorTotalDaCompra += p.getPreco() * quantidade;
		}
	}

	public void removeProduto(Produto p, int quantidade) {
		if (produtos.containsKey(p)) {
			for (Produto key : produtos.keySet()) {
				if (p.equals(key)) {

					if (quantidade <= produtos.get(p)) {
						produtos.put(p, produtos.get(p) - quantidade);
						this.valorTotalDaCompra -= p.getPreco() * quantidade;

						if (produtos.get(p) == 0) {
							produtos.remove(p);
						}
					} else {
						System.out.println(
								"A quantidade a ser removida deve ser menor ou a igual à desse produto na lista");
					}
				}

			}
		} else {
			System.out.println("Esse produto não existe no carrinho!");
		}
	}

	public int getQuantidadeTotalDeProdutos() {
		int qtd = 0;

		for (int valor : produtos.values()) {
			qtd += valor;
		}

		return qtd;
	}

	public int getQuantidadeDoProduto(Produto p) {
		return produtos.get(p);
	}

	public double getValorTotalDaCompra() {
		return this.valorTotalDaCompra;
	}

}
