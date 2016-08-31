
public class ProdutoComTamanho extends Produto {

	private int tamanho;

	public ProdutoComTamanho(String nome, int codigo, double preco, int tamanho) {
		super(nome, codigo, preco);
		this.tamanho = tamanho;
	}

	public int getTamanho() {
		return this.tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public int hashCode() {
		return super.getNome().length() + this.tamanho;
	}

	public boolean equals(Object obj) {
		ProdutoComTamanho p = (ProdutoComTamanho) obj;
		if ((p.getCodigo() == super.getCodigo()) && (p.hashCode() == this.hashCode())
				&& (p.getTamanho() == this.tamanho)) {
			return true;
		} else {
			return false;
		}
	}
}
