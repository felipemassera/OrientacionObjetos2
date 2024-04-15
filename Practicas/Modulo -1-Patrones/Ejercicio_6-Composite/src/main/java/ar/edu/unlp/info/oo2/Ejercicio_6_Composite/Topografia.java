package ar.edu.unlp.info.oo2.Ejercicio_6_Composite;

public abstract class Topografia {

	public abstract double proporcionAgua();

	public double calcularProporcionDeTierra() {
		return (1 - this.proporcionAgua());
	}

	public abstract boolean esIgual(Agua a);

	public abstract boolean esIgual(Tierra t);
	
	public abstract boolean esIgual(Pantano p);

	public abstract boolean esIgual(Topografia t);
	
	public boolean esIgual(Mixta m) {
		return false;
	}
}
