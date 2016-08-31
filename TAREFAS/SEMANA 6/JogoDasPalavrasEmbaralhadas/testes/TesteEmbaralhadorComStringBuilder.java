import static org.junit.Assert.*;

import org.junit.Test;

public class TesteEmbaralhadorComStringBuilder {

	Embaralhador embaralhador = new EmbaralhadorComStringBuilder();

	@Test
	public void testEmbaralhar() {
		/*
		 * Como o m�todo para embaralhar retorna a mesma palavra de formas
		 * diferentes, o teste verifica se a palavra retornada � diferente da
		 * palavra sem embaralhar
		 */
		String expected = "Teste";
		assertFalse(expected.equals(embaralhador.embaralhar("Teste")));
	}

}
