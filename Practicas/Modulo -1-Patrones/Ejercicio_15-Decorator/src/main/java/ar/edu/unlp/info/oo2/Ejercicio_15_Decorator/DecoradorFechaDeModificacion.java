package ar.edu.unlp.info.oo2.Ejercicio_15_Decorator;

public class DecoradorFechaDeModificacion extends Decorador {

	public DecoradorFechaDeModificacion(File002 file) {
		super(file);
	}

	public String prettyPrint() {
		return super.prettyPrint() + " Fecha de Ultima Modificación- " + this.getFile().getFechaDeModificacion() + "\n";
	}
}
