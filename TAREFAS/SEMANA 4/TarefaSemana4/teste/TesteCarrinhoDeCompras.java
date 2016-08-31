import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteCarrinhoDeCompras {

	CarrinhoDeCompras cc;
	Produto p1;
	Produto p2;
	Produto p3;
	Produto p4;

	@Before
	public void inicializaProduto() {
		cc = new CarrinhoDeCompras();
		p1 = new Produto("Celular", 01, 200.00);
		p2 = new ProdutoComTamanho("Tênis Nike", 02, 250.00, 40);
		p3 = new ProdutoComTamanho("Tênis Nike", 02, 250.00, 40);
		p4 = new Produto("Mochila", 03, 100.00);
	}

	@Test
	public void testAdicionarProdutoNovo() {
		cc.adicionaProduto(p2, 1);
		assertEquals(1, cc.getQuantidadeTotalDeProdutos());
	}

	@Test
	public void testAdicionarProdutoRepetido() {
		cc.adicionaProduto(p2, 1); // Produto com tamanho
		cc.adicionaProduto(p3, 2); // Produto com tamanho
		assertEquals(3, cc.getQuantidadeDoProduto(p2));
	}

	@Test
	public void testRemoverProduto() {
		cc.adicionaProduto(p3, 2); // Produto com tamanho
		cc.removeProduto(p3, 1);
		assertEquals(1, cc.getQuantidadeDoProduto(p3));
	}

	@Test
	public void testValorTotalDoCarrinho() {
		cc.adicionaProduto(p1, 1);
		cc.adicionaProduto(p2, 2); // Produto com tamanho
		cc.adicionaProduto(p4, 1);
		assertEquals(800.00, cc.getValorTotalDaCompra(), 00.00);
	}

}
