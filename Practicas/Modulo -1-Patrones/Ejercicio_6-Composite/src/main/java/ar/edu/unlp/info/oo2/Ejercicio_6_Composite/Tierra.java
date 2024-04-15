package ar.edu.unlp.info.oo2.Ejercicio_6_Composite;

public class Tierra extends Topografia {

	public Tierra() {
	}

	@Override
	public double proporcionAgua() {
		return 0;
	}

	@Override
	public boolean esIgual(Agua agua) {
		return false;
	}

	@Override
	public boolean esIgual(Tierra t) {
		return true;
	}

	@Override
	public boolean esIgual(Pantano p) {
		return false;
	}

	public boolean esIgual(Topografia otraTopografia) {
		return otraTopografia.esIgual(this);
	}

}
