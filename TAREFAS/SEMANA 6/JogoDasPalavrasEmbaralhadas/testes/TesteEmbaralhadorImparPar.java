import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteEmbaralhadorImparPar {

	Embaralhador embaralhador = new EmbaralhadorImparPar();

	@Test
	public void testEmbaralhar() {
		assertEquals("tseet", embaralhador.embaralhar("teste"));
	}

}