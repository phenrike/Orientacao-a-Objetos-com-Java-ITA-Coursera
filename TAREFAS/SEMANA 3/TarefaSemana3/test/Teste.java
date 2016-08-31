import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Teste {
	
	/*Crie um m�todo est�tico na classe Pizza que zera o registro de ingredientes 
	e invoque ele em um m�todo de inicializa��o ou finaliza��o na classe de testes.*/
	@BeforeClass
	public static void ZerarValor() {
		Pizza.ZerarValor();
	}
		
	//Verifique se o valor da Pizza est� correto de acordo com a quantidade de ingredientes.
	@Test
	public void TesteValorPizza() {
		Pizza p = new Pizza();	
		p.AdicionaIngrediente("Queijo");
		p.AdicionaIngrediente("Tomate");
		p.AdicionaIngrediente("Manjeric�o");
		p.AdicionaIngrediente("Molho");
		assertEquals(20.00, p.GetPreco(),00.00);
	}
	
	 //Verifique tamb�m se o registro de ingredientes funcionou corretamente.
	 @Test
	public void TesteNumeroIngredientes() {
		Pizza p = new Pizza();
		p.AdicionaIngrediente("Queijo"); //Ingrediente 1
		p.AdicionaIngrediente("Tomate"); //Ingrediente 2
		p.AdicionaIngrediente("Manjeric�o"); //Ingrediente 3
		p.AdicionaIngrediente("Molho"); //Ingrediente 4
		assertEquals(4, p.numeroingredientes);
	}
	
	//Fa�a os testes da classe CarrinhoDeCompras, verificando se o pre�o das pizzas s�o somados corretamente.
	 @Test
	public void TesteSomaPrecosPizzas() {
		CarrinhoDeCompras c = new CarrinhoDeCompras();
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		Pizza p3 = new Pizza();
		p1.AdicionaIngrediente("Queijo");
		p1.AdicionaIngrediente("Tomate");
		p2.AdicionaIngrediente("Calabresa");
		p2.AdicionaIngrediente("Cebola");
		p3.AdicionaIngrediente("Frango");
		p3.AdicionaIngrediente("Catupiry");
		p3.AdicionaIngrediente("Bacon");
		c.AdicionaPizza(p1);
		c.AdicionaPizza(p2);
		c.AdicionaPizza(p3);
		assertEquals(50.00, c.GetPrecoTotal(),00.00);
	}
	
	//Fa�a os testes da classe CarrinhoDeCompras, verificando se impede a adi��o de uma pizza sem ingredientes. 
	@Test
	public void TesteNaoAdicionaPizza() {
		CarrinhoDeCompras c = new CarrinhoDeCompras();
		Pizza p1 = new Pizza(); 
		c.AdicionaPizza(p1); //Tentativa de adicionar pizza sem ingresientes
		assertEquals(0, c.CalculaTotalDePizzasAdicionadas());
	}
	
	/*Crie um m�todo est�tico na classe Pizza que zera o registro de ingredientes 
	e invoque ele em um m�todo de inicializa��o ou finaliza��o na classe de testes.*/	
	@AfterClass
	public static void TesteZeraValor() {
		Pizza.ZerarValor();
	}
	

}
