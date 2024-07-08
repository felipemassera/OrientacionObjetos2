package ar.edu.unlp.info.oo2.Parcial_1_7_23_Composite_State;

public class EstadoFinalizado extends Estado {
	@Override
	public int tiempoUtilizadoEnTarea(TareaSimple tarea) {
		return tarea.calcularTiempoCompletado();
	}
}
