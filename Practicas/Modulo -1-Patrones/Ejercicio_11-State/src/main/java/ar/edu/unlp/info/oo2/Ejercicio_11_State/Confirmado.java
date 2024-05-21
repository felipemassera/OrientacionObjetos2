package ar.edu.unlp.info.oo2.Ejercicio_11_State;

public class Confirmado extends Estado{

	public Confirmado(Proyecto proyecto) {
		super(proyecto);
	}

	@Override
	public void aprobarEtapa() {
		throw new RuntimeException("ERROR, el proyecto ya fue confirmado");
		
	}

	public void modificarMargenDeGanancia(double ganancia) {
		throw new RuntimeException("ERROR, no se puede modificar la ganancia de un proyecto confirmado");
	}
}

