
public class CarrinhoDeCompras {

	private int numerodepizzas;
	private double precototal;

	public void AdicionaPizza(Pizza pizza) {
		if (pizza.numeroingredientes > 0) {
			this.numerodepizzas = numerodepizzas + 1;
			precototal = precototal + pizza.GetPreco();
		}
	}

	public void GetPrecoTotal() {
		System.out.println("O total do carrinho é " + precototal);
	}

	public void CalculaTotalDePizzasAdicionadas() {
		System.out.println("O total de pizzas adicionadas é " + numerodepizzas);
	}

}
