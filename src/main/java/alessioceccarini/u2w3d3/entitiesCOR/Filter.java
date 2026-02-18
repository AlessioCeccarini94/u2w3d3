package alessioceccarini.u2w3d3.entitiesCOR;

import lombok.Setter;

@Setter
public abstract class Filter {
	private Filter next;

	public abstract void filter(Militare militare);

	public void next(Militare militare) {
		if (next != null) this.next.filter(militare);
		else System.out.println("catena terminata");
	}
}