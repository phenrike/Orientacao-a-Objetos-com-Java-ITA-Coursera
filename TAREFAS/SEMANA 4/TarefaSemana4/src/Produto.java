
public class Produto {

	private String nome;
	private int codigo;
	private double preco;

	public Produto(String nome, int codigo, double preco) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int hashCode() {
		return this.nome.length() * 42;
	}

	public boolean equals(Object obj) {
		Produto p = (Produto) obj;
		if ((p.getCodigo() == this.codigo) && (p.hashCode() == this.hashCode())) {
			return true;
		} else {
			return false;
		}
	}

}
