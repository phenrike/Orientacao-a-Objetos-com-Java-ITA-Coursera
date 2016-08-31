import static org.junit.Assert.*;
import org.junit.Test;

public class TesteCompraParcelada {

	@Test
	public void testCompraUmaParcela() {
		CompraParcelada cp = new CompraParcelada(200.00, 1, 1.0);
		assertEquals(200.00, cp.total(), 00.00);
	}

	@Test
	public void testCompraDuasParcelas() {
		CompraParcelada cp = new CompraParcelada(200.00, 2, 1.0);
		assertEquals(800.00, cp.total(), 00.00);
	}

	@Test
	public void testCompraCincoParcelas() {
		CompraParcelada cp = new CompraParcelada(200.00, 5, 1.0);
		assertEquals(6400.00, cp.total(), 00.00);
	}

	@Test
	public void testCompraDezParcelas() {
		CompraParcelada cp = new CompraParcelada(200.00, 10, 0.01);
		assertEquals(220.924425082240902002, cp.total(), 00.00);
	}

}
