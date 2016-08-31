
public class Principal {

	public static void main(String[] args) {
		Paciente p1 = new Paciente(60.00, 1.80);
		Paciente p2 = new Paciente(100.00, 1.75);
		Paciente p3 = new Paciente(35.00, 1.50);

		System.out.println("---------------- Paciente 1 ----------------");
		System.out.println("Valor do IMC: " + p1.calcularIMC());
		System.out.println("Diagnostico: " + p1.diagnostico());
		System.out.println("--------------------------------------------");
		System.out.println("                                            ");

		System.out.println("---------------- Paciente 2 ----------------");
		System.out.println("Valor do IMC: " + p2.calcularIMC());
		System.out.println("Diagnostico: " + p2.diagnostico());
		System.out.println("--------------------------------------------");
		System.out.println("                                            ");

		System.out.println("---------------- Paciente 3 ----------------");
		System.out.println("Valor do IMC: " + p3.calcularIMC());
		System.out.println("Diagnostico: " + p3.diagnostico());
		System.out.println("--------------------------------------------");
		System.out.println("                                            ");

	}

}
