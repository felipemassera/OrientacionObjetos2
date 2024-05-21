package ar.edu.unlp.info.oo2.Ejercicio_9_State;

public abstract class State {

	protected Excursion excursion;

	public State(Excursion excursion) {
		this.excursion = excursion;
	}
	
	public abstract void anotarse(Usuario usuario);
	
	public abstract String getInfo();
	
	
}
