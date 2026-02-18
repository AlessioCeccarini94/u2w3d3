package alessioceccarini.u2w3d3.adapter;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class InfoAdapt implements DataSource {

	private Info info;

	public InfoAdapt(Info info) {
		this.info = info;
	}

	@Override
	public String getNomeCompleto() {
		return info.getNome() + " " + info.getCognome();
	}

	@Override
	public int getEta() {
		Date data = info.getDataNascita();
		LocalDate birthdate = data.toInstant()
				.atZone(ZoneId.systemDefault())
				.toLocalDate();
		return Period.between(birthdate, LocalDate.now()).getYears();
	}
}
