package ar.edu.unlp.info.oo2.Parcial_1_7_23_Composite_State;

public class EstadoPendiente extends Estado {
	@Override
	public void iniciarTarea(TareaSimple tarea) {
		tarea.setEstado(new EstadoIniciado());
		tarea.setInicio((int) System.currentTimeMillis());
	}
	
	

}