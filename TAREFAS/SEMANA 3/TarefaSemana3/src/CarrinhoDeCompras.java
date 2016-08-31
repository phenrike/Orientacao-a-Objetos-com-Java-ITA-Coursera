
public class CarrinhoDeCompras {

	private int numerodepizzas;
	private double precototal;

	public void AdicionaPizza(Pizza pizza) {
		if (pizza.numeroingredientes > 0) {
			this.numerodepizzas = numerodepizzas + 1;
			precototal = precototal + pizza.GetPreco();
			System.out.println("A pizza foi adicionada ao carrinho");
		}else {
			System.out.println("A pizza deve conter pelo menos um ingrediente para ser adicionada ao carrinho");
		}
	}

	public double GetPrecoTotal() {
		System.out.println("O total do carrinho é " + precototal);
		return this.precototal;
	}

	public int CalculaTotalDePizzasAdicionadas() {
		System.out.println("O total de pizzas adicionadas é " + numerodepizzas);
		return this.numerodepizzas;
	}

}
