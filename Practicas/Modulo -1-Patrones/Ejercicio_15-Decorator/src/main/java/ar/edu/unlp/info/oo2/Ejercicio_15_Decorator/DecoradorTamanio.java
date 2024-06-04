package ar.edu.unlp.info.oo2.Ejercicio_15_Decorator;

public class DecoradorTamanio extends Decorador {

	public DecoradorTamanio(File002 file) {
		super(file);
	}

	public String prettyPrint() {
		return super.prettyPrint() + " Tamaño- " + this.getTamanio() + "MB\n";
	}

}
