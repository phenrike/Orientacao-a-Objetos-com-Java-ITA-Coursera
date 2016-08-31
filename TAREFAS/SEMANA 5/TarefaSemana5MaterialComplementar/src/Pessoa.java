
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pessoa {
	private Date dataDeNascimento;

	public Pessoa(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.dataDeNascimento = sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public int getIdade() {

		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(this.dataDeNascimento);
		Calendar hoje = Calendar.getInstance();

		int idade = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);

		if (hoje.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)) {
			idade--;
		} else {
			if (hoje.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH)
					&& hoje.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH)) {
				idade--;
			}
		}

		return idade;

	}

	public String getSigno() {

		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(this.dataDeNascimento);
		int Mes = dataNascimento.get(Calendar.MONTH) + 1;
		int Dia = dataNascimento.get(Calendar.DAY_OF_MONTH);
		String signo = "";

		if (Mes == 1 && Dia > 20 && Mes == 2 && Dia < 19)
			signo = "Aquarios";
		else if (Mes == 2 && Dia > 18 || Mes == 3 && Dia < 20)
			signo = "Peixes";
		else if (Mes == 3 && Dia > 19 || Mes == 4 && Dia < 21)
			signo = "Áries";
		else if (Mes == 4 && Dia > 20 || Mes == 5 && Dia < 21)
			signo = "Touro";
		else if (Mes == 5 && Dia > 20 || Mes == 6 && Dia < 21)
			signo = "Gêmeos";
		else if (Mes == 6 && Dia > 20 || Mes == 7 && Dia < 22)
			signo = "Câncer";
		else if (Mes == 7 && Dia > 21 || Mes == 8 && Dia < 23)
			signo = "Leão";
		else if (Mes == 8 && Dia > 22 || Mes == 9 && Dia < 23)
			signo = "Virgem";
		else if (Mes == 9 && Dia > 22 || Mes == 10 && Dia < 23)
			signo = "Libra";
		else if (Mes == 10 && Dia > 22 || Mes == 11 && Dia < 22)
			signo = "Escorpião";
		else if (Mes == 11 && Dia > 21 || Mes == 12 && Dia < 22)
			signo = "Sagitario";
		else if (Mes == 12 && Dia > 21 || Mes == 1 && Dia < 22)
			signo = "Capricornio";

		return signo;
	}

}
