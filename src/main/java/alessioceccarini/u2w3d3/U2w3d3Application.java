package alessioceccarini.u2w3d3;

import alessioceccarini.u2w3d3.adapter.DataSource;
import alessioceccarini.u2w3d3.adapter.Info;
import alessioceccarini.u2w3d3.adapter.InfoAdapt;
import alessioceccarini.u2w3d3.adapter.UserData;
import alessioceccarini.u2w3d3.entitiesCOR.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class U2w3d3Application {

	public static void main(String[] args) {
		SpringApplication.run(U2w3d3Application.class, args);

		//------------------------------ C O R --------------------------------------------

		Militare tenente = new Tenente(1000);
		Militare capitano = new Capitano(2000);
		Militare maggiore = new Maggiore(3000);
		Militare colonnello = new Colonnello(4000);
		Militare generale = new Generale(5000);

		tenente.setNext(capitano);
		capitano.setNext(maggiore);
		capitano.setNext(colonnello);
		capitano.setNext(generale);

		maggiore.filter(tenente);

		//------------------------- A D A P T E R ----------------------------------------

		Info info = new Info();
		info.setNome("Alessio");
		info.setCognome("Ceccarini");
		info.setDataNascita(new Date(1994, 9, 19));

		DataSource adapter = new InfoAdapt(info);

		UserData userData = new UserData();
		userData.getData(adapter);
	}

}
