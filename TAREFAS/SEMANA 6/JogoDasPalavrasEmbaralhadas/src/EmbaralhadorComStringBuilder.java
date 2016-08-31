import java.util.ArrayList;

public class EmbaralhadorComStringBuilder implements Embaralhador {

	@Override
	public String embaralhar(String palavra) {
		ArrayList<Character> characters = new ArrayList<Character>();

		for (char c : palavra.toCharArray()) {
			characters.add(c);
		}

		StringBuilder palavraembaralhada = new StringBuilder(palavra.length());

		while (characters.size() != 0) {
			int randPicker = (int) (Math.random() * characters.size());
			palavraembaralhada.append(characters.remove(randPicker));
		}

		return palavraembaralhada.toString();
	}

}