
public class ComT�tulo implements FormatadorNome {
	
	private String titulo;

	public ComT�tulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		return this.titulo+" "+nome+" "+sobrenome;
	}

}
