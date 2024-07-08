package ar.edu.unlp.info.oo2.Parcial_1_7_23_Composite_State;

public class TareaSimple extends Tarea {

	private int inicio;
	private int fin;
	private int estimado;
	private Estado estado;
		
	
	public TareaSimple(String nombre, String descripcion, int estimado) {
		super(nombre, descripcion);
		this.inicio = 0;
		this.fin = 0;
		this.estimado = estimado;
		this.estado = new EstadoPendiente();
	}

	@Override
	public int estimacionTotalDeTarea() {
		return this.estimado;
	}

	@Override
	public int tiempoUtilizadoEnTarea() {
		return this.estado.tiempoUtilizadoEnTarea(this);
	}

	@Override
	public void iniciarTarea() {
		this.estado.iniciarTarea(this);
	}

	@Override
	public void completarTarea() {
		this.estado.completarTarea(this);
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public int calcularTiempoCompletado() {
		return this.fin - this.inicio;
	}

	public void setInicio(int inicio) {
		this.inicio = inicio;
	}

	public void setFin(int fin) {
		this.fin = fin;
	}
	
	
}
