package alessioceccarini.u2w3d3.entitiesCOR;

public class Tenente extends Militare {
	public Tenente(int stipendio) {
		super(stipendio);
	}

	@Override
	public void filter(Militare militare) {

		if (militare.getStipendio() > 1000) this.next(militare);
		else System.out.println(militare.getClass().getSimpleName() + " percepisce " + militare.getStipendio());
	}
}
