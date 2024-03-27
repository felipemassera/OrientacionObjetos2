package ar.edu.info.unlp.ejercicioDemo;

public class EmpleadoTemporario extends EmpleadoFamilia {

	private int hsTabajadas;

	public EmpleadoTemporario(int hijos, boolean esCasado, int horas) {
		super(hijos, esCasado);
		this.hsTabajadas = horas;
	}

	@Override
	protected double calcularSueldoBasico() {

		return 20000 + this.hsTabajadas * 300;
	}

	@Override
	protected double calcularAdicional() {
		return super.calcularAdicional();
	}

}
