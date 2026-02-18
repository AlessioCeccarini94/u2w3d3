package alessioceccarini.u2w3d3.entitiesCOR;

public class Capitano extends Militare {
	public Capitano(int stipendio) {
		super(stipendio);
	}

	@Override
	public void filter(Militare militare) {
		if (militare.getStipendio() > 2000) this.next(militare);
		else System.out.println(militare.getClass().getSimpleName() + " percepisce " + militare.getStipendio());
	}
}
