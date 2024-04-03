package ar.edu.info.unlp.ejercicioDemo;

public class EmpleadoPlanta extends EmpleadoFamilia {
	private int antiguedad;

	public EmpleadoPlanta(int hijos, boolean esCasado, int antiguedad) {
		super(hijos, esCasado);
		this.antiguedad = antiguedad;
	}

	@Override
	protected double calcularAdicional() {
		return super.calcularAdicional() + this.antiguedad * 2000;
	}

	@Override
	protected double calcularSueldoBasico() {
		return 50000;
	}
}
