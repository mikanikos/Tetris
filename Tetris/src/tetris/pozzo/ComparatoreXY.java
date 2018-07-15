package tetris.pozzo;

import java.util.Comparator;

public class ComparatoreXY implements Comparator<Cella> {

	@Override
	public int compare(Cella c1, Cella c2) {
		int cmp = c1.getPosizione().getX() - c2.getPosizione().getX();
		if (cmp == 0)
			return c1.getPosizione().getY() - c2.getPosizione().getY();
		return cmp;
	}

}
