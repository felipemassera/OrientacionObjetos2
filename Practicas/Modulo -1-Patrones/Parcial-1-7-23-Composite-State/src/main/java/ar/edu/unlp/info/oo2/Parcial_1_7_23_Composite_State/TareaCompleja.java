package ar.edu.unlp.info.oo2.Parcial_1_7_23_Composite_State;

import java.util.ArrayList;
import java.util.List;

public class TareaCompleja extends Tarea {

	private List<Tarea> listaTareas;

	public TareaCompleja(String nombre, String descripcion) {
		super(nombre, descripcion);
		this.listaTareas = new ArrayList<>();
	}

	public void agregarTarea(Tarea tarea) {
		this.listaTareas.add(tarea);
	}

	@Override
	public int estimacionTotalDeTarea() {
		return listaTareas.stream().mapToInt(tarea -> tarea.estimacionTotalDeTarea()).sum();
	}

	@Override
	public int tiempoUtilizadoEnTarea() {
		return listaTareas.stream().mapToInt(tarea -> tarea.tiempoUtilizadoEnTarea()).sum();
	}

	@Override
	public void iniciarTarea() {
		listaTareas.stream().forEach(tarea -> tarea.iniciarTarea());
	}

	@Override
	public void completarTarea() {
		listaTareas.stream().forEach(tarea -> tarea.completarTarea());
	}

}
