package alessioceccarini.u2w3d3.adapter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserData {
	private String nomeCompleto;
	private int eta;

	public void getData(DataSource dataSource) {
		nomeCompleto = dataSource.getNomeCompleto();
		eta = dataSource.getEta();
	}
}
