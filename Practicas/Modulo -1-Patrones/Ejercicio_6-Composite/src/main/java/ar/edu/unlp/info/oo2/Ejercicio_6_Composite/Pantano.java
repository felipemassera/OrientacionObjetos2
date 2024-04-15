package ar.edu.unlp.info.oo2.Ejercicio_6_Composite;

public class Pantano extends Topografia{
	public Pantano() {}

	@Override
	public double proporcionAgua() {
		return 0.7;
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
		return true;
	};

	@Override
	public boolean esIgual(Topografia t) {
		return t.esIgual(this);
	}
	
}
