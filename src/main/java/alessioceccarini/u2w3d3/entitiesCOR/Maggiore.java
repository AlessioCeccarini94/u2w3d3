package alessioceccarini.u2w3d3.entitiesCOR;

public class Maggiore extends Militare {
	public Maggiore(int stipendio) {
		super(stipendio);
	}

	@Override
	public void filter(Militare militare) {
		if (militare.getStipendio() > 3000) this.next(militare);
		else System.out.println(militare.getClass().getSimpleName() + " percepisce " + militare.getStipendio());
	}
}
