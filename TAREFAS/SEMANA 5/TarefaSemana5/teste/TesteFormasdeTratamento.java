import static org.junit.Assert.*;

import org.junit.Test;

public class TesteFormasdeTratamento {

	@Test
	public void testInformal() {
		Informal informal = new Informal();
		Autoridade politico = new Autoridade("Michel", "Temer", informal);
		assertEquals("Michel", politico.getTratamento());
	}
	
	@Test
	public void testRespeitoso() {
		Respeitoso respeitoso = new Respeitoso("masculino");
		Autoridade militar = new Autoridade("João", "Silva", respeitoso);
		assertEquals("Sr. Silva", militar.getTratamento());
	}
	
	@Test
	public void testComTítulo() {
		ComTítulo comtitulo = new ComTítulo("Excelentíssimo");
		Autoridade juiz = new Autoridade("Joaquim", "Barbosa", comtitulo);
		assertEquals("Excelentíssimo Joaquim Barbosa", juiz.getTratamento());
	}

}
