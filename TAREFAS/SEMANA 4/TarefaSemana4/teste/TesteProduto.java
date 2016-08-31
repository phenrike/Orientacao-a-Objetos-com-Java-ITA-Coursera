import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteProduto {

	Produto p1;
	Produto p2;
	Produto p3;

	@Before
	public void inicializaProduto() {
		p1 = new Produto("Celular", 01, 2.000);
		p2 = new Produto("TV", 02, 2.500);
		p3 = new Produto("TV", 02, 2.500);
	}

	@Test
	public void testHashCode() {
		assertEquals(84, p2.hashCode());
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
