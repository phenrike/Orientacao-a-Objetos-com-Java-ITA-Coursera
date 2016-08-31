
public class Paciente {

	private double peso;
	private double altura;
	private double imc;

	public Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calcularIMC() {
		double imc;
		imc = this.peso / (this.altura * this.altura);
		this.imc = imc;
		return imc;
	}

	public String diagnostico() {
		String resultado = "";

		if (this.imc < 16.00) {
			resultado = "Baixo peso muito grave";
		} else if (this.imc >= 16.00 && this.imc <= 16.99) {
			resultado = "Baixo peso grave";
		} else if (this.imc >= 17.00 && this.imc <= 18.49) {
			resultado = "Baixo peso";
		} else if (this.imc >= 18.50 && this.imc <= 24.99) {
			resultado = "Peso normal";
		} else if (this.imc >= 25.00 && this.imc <= 29.99) {
			resultado = "Sobrepeso";
		} else if (this.imc >= 30.00 && this.imc <= 34.99) {
			resultado = "Obesidade grau I";
		} else if (this.imc >= 35.00 && this.imc <= 39.99) {
			resultado = "Obesidade grau II";
		} else if (this.imc >= 40.00) {
			resultado = "Obesidade grau III (obesidade mórbida)";
		}

		return resultado;
	}

}
