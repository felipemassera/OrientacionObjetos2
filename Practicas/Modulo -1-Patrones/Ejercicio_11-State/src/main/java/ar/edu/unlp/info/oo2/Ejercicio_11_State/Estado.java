package ar.edu.unlp.info.oo2.Ejercicio_11_State;

public abstract class Estado {

	protected Proyecto proyecto;
	
	public Estado(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	public abstract void aprobarEtapa();
	
	public void cancelarProyecto() {
		this.proyecto.setObjetivo("Cancelado");
		this.proyecto.cambiarEstado(new Cancelado(this.proyecto));
	}
			
	public void modificarMargenDeGanancia(double ganancia) {
		this.proyecto.modificarMargenDeGanancia(ganancia);
	}
	
	
}
