package ar.edu.unlp.info.oo2.Ejercicio_11_State;

public class EnEvaluacion extends Estado {

	public EnEvaluacion(Proyecto proyecto) {
		super(proyecto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aprobarEtapa() {
		this.proyecto.cambiarEstado(new Confirmado(proyecto));
	}

}
