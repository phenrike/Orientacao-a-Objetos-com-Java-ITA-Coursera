import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteProdutoComTamanho {

	ProdutoComTamanho p1;
	ProdutoComTamanho p2;
	ProdutoComTamanho p3;

	@Before
	public void inicializaProduto() {
		p1 = new ProdutoComTamanho("Tênis Vans", 01, 200.00, 41);
		p2 = new ProdutoComTamanho("Tênis Nike", 02, 250.00, 40);
		p3 = new ProdutoComTamanho("Tênis Nike", 02, 250.00, 40);
	}

	@Test
	public void testHashCode() {
		assertEquals(51, p1.hashCode());
	}

	@Test
	public void testEqualsFalso() {
		assertEquals(false, p1.equals(p2));
	}

	@Test
	public void testEqualsVerdadeiro() {
		assertEquals(true, p2.equals(p3));
	}

}
