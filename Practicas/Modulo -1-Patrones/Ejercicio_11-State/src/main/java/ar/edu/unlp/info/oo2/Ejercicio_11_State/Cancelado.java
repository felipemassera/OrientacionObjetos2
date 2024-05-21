package ar.edu.unlp.info.oo2.Ejercicio_11_State;

public class Cancelado extends Estado{

	public Cancelado(Proyecto proyecto) {
		super(proyecto);
	}

	@Override
	public void aprobarEtapa() {
		throw new RuntimeException("ERROR, el proyecto fue cancelado");
	}

	public void modificarMargenDeGanancia(double ganancia) {
		throw new RuntimeException("ERROR, no se puede modificar la ganancia de un proyecto cancelado");
	}
}