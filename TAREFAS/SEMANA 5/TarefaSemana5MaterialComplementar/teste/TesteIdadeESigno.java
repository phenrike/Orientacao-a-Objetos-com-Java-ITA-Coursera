import static org.junit.Assert.*;

import org.junit.Test;

public class TesteIdadeESigno {

	@Test
	public void testePessoa1() {

		Pessoa p = new Pessoa("28/06/1995");
		assertEquals(21, p.getIdade());
		assertEquals("Câncer", p.getSigno());
	}
	
	@Test
	public void testePessoa2() {

		Pessoa p = new Pessoa("13/12/1997");
		assertEquals(18, p.getIdade());
		assertEquals("Sagitario", p.getSigno());
	}
	
	@Test
	public void testePessoa3() {

		Pessoa p = new Pessoa("20/02/1971");
		assertEquals(45, p.getIdade());
		assertEquals("Peixes", p.getSigno());
	}
	
}
