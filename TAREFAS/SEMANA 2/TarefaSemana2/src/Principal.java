
public class Principal {

	public static void main(String[] args) {

		Pizza pizza1 = new Pizza();

		pizza1.AdicionaIngrediente("Queijo");

		Pizza pizza2 = new Pizza();

		pizza2.AdicionaIngrediente("Frango");

		Pizza pizza3 = new Pizza();

		pizza3.AdicionaIngrediente("Calabresa");

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

		carrinho.AdicionaPizza(pizza1);
		carrinho.AdicionaPizza(pizza2);
		carrinho.AdicionaPizza(pizza3);

		System.out.println("----------- Preço total do carrinho -----------");

		carrinho.GetPrecoTotal();
		System.out.println("-----------------------------------------------");
		System.out.println("");
		System.out.println("----------- Nº de ingredientes ----------------");

		Pizza.QuantidadeDeCadaIngrediente();

		System.out.println("-----------------------------------------------");
	}

}
