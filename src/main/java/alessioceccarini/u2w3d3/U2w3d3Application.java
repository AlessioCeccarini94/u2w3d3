package alessioceccarini.u2w3d3;

import alessioceccarini.u2w3d3.entitiesCOR.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class U2w3d3Application {

	public static void main(String[] args) {
		SpringApplication.run(U2w3d3Application.class, args);

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
	}
}
