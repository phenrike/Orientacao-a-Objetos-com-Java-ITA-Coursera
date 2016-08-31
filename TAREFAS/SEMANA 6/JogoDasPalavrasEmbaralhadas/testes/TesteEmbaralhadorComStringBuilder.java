import static org.junit.Assert.*;

import org.junit.Test;

public class TesteEmbaralhadorComStringBuilder {

	Embaralhador embaralhador = new EmbaralhadorComStringBuilder();

	@Test
	public void testEmbaralhar() {
		/*
		 * Como o método para embaralhar retorna a mesma palavra de formas
		 * diferentes, o teste verifica se a palavra retornada é diferente da
		 * palavra sem embaralhar
		 */
		String expected = "Teste";
		assertFalse(expected.equals(embaralhador.embaralhar("Teste")));
	}

}
