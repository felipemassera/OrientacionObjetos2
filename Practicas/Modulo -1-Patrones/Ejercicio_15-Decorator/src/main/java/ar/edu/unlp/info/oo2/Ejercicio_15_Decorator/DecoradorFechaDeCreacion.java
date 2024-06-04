package ar.edu.unlp.info.oo2.Ejercicio_15_Decorator;

public class DecoradorFechaDeCreacion extends Decorador{

	public DecoradorFechaDeCreacion(File002 file) {
		super(file);
	}

	public String prettyPrint() {
		return super.prettyPrint() + " fecha de creacion- " + this.getFechaDeCreacion()+ "\n";
	}
}
