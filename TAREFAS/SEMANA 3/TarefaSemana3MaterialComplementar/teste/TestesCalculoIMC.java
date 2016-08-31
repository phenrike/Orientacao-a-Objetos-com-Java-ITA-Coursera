import static org.junit.Assert.*;

import org.junit.Test;

public class TestesCalculoIMC {

	@Test
	public void TesteBaixoPesoMuitoGrave() {
		Paciente p = new Paciente(45, 1.80);
		p.calcularIMC();
		assertEquals("Baixo peso muito grave", p.diagnostico());
	}

	@Test
	public void TesteBaixoPesoGrave() {
		Paciente p = new Paciente(55, 1.80);
		p.calcularIMC();
		assertEquals("Baixo peso grave", p.diagnostico());
	}
	
	@Test
	public void TesteBaixoPeso() {
		Paciente p = new Paciente(59, 1.80);
		p.calcularIMC();
		assertEquals("Baixo peso", p.diagnostico());
	}
	
	@Test
	public void TestePesoNormal() {
		Paciente p = new Paciente(65, 1.80);
		p.calcularIMC();
		assertEquals("Peso normal", p.diagnostico());
	}
	
	@Test
	public void TesteSobrepeso() {
		Paciente p = new Paciente(89, 1.80);
		p.calcularIMC();
		assertEquals("Sobrepeso", p.diagnostico());
	}
	
	@Test
	public void TesteObesidadeI() {
		Paciente p = new Paciente(105, 1.80);
		p.calcularIMC();
		assertEquals("Obesidade grau I", p.diagnostico());
	}	

	@Test
	public void TesteObesidadeII() {
		Paciente p = new Paciente(120, 1.80);
		p.calcularIMC();
		assertEquals("Obesidade grau II", p.diagnostico());
	}	
	
	@Test
	public void TesteObesidadeIII() {
		Paciente p = new Paciente(180, 1.80);
		p.calcularIMC();
		assertEquals("Obesidade grau III (obesidade mórbida)", p.diagnostico());
	}	
}
