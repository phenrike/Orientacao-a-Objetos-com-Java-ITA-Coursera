
public class CompraParcelada extends Compra {

	public int quantidadeparcelas;
	public double jurosmensal;

	public CompraParcelada(double valor, int quantidadeparcelas, double jurosmensal) {
		super(valor);
		this.quantidadeparcelas = quantidadeparcelas;
		this.jurosmensal = jurosmensal;
	}

	@Override
	public double total() {
		if (quantidadeparcelas > 1) {
			valor = valor * Math.pow((1 + jurosmensal), quantidadeparcelas);
		}
		return valor;
	}

}
