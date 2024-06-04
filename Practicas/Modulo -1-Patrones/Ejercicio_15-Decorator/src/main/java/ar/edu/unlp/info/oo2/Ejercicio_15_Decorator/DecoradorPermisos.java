package ar.edu.unlp.info.oo2.Ejercicio_15_Decorator;

public class DecoradorPermisos extends Decorador {
	public DecoradorPermisos(File002 file) {
		super(file);
	}

	public String prettyPrint() {
		return super.prettyPrint() + " Permisos- " + this.getPermisos() + "\n";
	}
}
