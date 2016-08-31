
public class Respeitoso implements FormatadorNome {

	private String genero;

	public Respeitoso(String genero) {
		this.genero = genero;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		if (this.genero == "masculino"){
			return "Sr. "+sobrenome;
		}else{
			return "Sra. "+sobrenome;
		}
	}

}
