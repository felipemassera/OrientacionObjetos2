package ar.edu.unlp.info.oo2.Ejercicio_11_State;

public class EnConstruccion extends Estado {

	public EnConstruccion(Proyecto proyecto) {
		super(proyecto);
	}

	@Override
	public void aprobarEtapa() {
		if (this.proyecto.costoDelProyecto()>0) {
			Estado nuevoEstado= new EnEvaluacion(this.proyecto);
			this.proyecto.cambiarEstado(nuevoEstado);
		}else {
			throw new RuntimeException("ERROR, Costo = 0");
		}
		
	}
}
