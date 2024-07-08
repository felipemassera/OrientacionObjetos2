package ar.edu.unlp.info.oo2.Parcial_1_7_23_Composite_State;

public class EstadoIniciado extends Estado {
	@Override
	public void completarTarea(TareaSimple tarea) {
		tarea.setEstado(new EstadoFinalizado());
		tarea.setFin((int) System.currentTimeMillis());
	}

}
