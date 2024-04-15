package ar.edu.unlp.info.oo2.Ejercicio_6_Composite;

public class Agua extends Topografia {

	public Agua() {
	}

	@Override
	public double proporcionAgua() {
		return 1;
	}

	@Override
	public boolean esIgual(Agua agua) {
		return true;
	}

	@Override
	public boolean esIgual(Tierra t) {
		return false;
	}

	@Override
	public boolean esIgual(Pantano p) {
		return false;
	}

	public boolean esIgual(Topografia otraTopografia) {
		return otraTopografia.esIgual(this);
	}

}
