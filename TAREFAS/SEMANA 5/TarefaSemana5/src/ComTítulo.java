
public class ComTítulo implements FormatadorNome {
	
	private String titulo;

	public ComTítulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		return this.titulo+" "+nome+" "+sobrenome;
	}

}
