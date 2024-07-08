package ar.edu.unlp.info.oo2.Parcial_1_7_23_Composite_State;

public abstract class Tarea {
	private String nombre;
	private String descripcion;
	
	public Tarea(String nombre, String descripcion) {
		this.nombre=nombre;
		this.descripcion = descripcion;
	}

	public abstract int estimacionTotalDeTarea();

	public abstract int tiempoUtilizadoEnTarea();

	public double avanceDeTarea() {
		return (double) this.tiempoUtilizadoEnTarea()/this.estimacionTotalDeTarea();
	}

	public abstract void iniciarTarea();

	public abstract void completarTarea();
}
