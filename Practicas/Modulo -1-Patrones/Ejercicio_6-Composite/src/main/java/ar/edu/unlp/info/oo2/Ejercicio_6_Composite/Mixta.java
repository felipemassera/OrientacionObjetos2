package ar.edu.unlp.info.oo2.Ejercicio_6_Composite;

import java.util.ArrayList;
import java.util.List;

public class Mixta extends Topografia {

	private List<Topografia> partes;

	public Mixta(Topografia e1, Topografia e2, Topografia e3, Topografia e4) {
		partes = new ArrayList<Topografia>();
		partes.add(e1);
		partes.add(e2);
		partes.add(e3);
		partes.add(e4);
	}

	@Override
	public double proporcionAgua() {
		return this.partes.stream().mapToDouble(parte -> parte.proporcionAgua()).sum() / 4;
	}

	@Override
	public boolean esIgual(Agua a) {
		return false;
	}

	@Override
	public boolean esIgual(Tierra t) {
		return false;
	}

	@Override
	public boolean esIgual(Pantano p) {
		return false;
	}

	public List<Topografia> getPartes() {
		return partes;
	}

	@Override
	public boolean esIgual(Topografia otraTopografia) {
		return otraTopografia.esIgual(this);
	}

	@Override
	public boolean esIgual(Mixta otraTopografiaMixta) {
		Topografia componente1 = null;
		Topografia componente2 = null;
		for (int i = 0; i < this.getPartes().size(); i++) {
			componente1 = this.getPartes().get(i);
			componente2 = otraTopografiaMixta.getPartes().get(i);
			if (!componente1.esIgual(componente2)) {						
				return false;
			}
		}
		return true;
	}

}
