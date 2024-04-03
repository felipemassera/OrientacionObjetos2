package ar.edu.info.unlp.ejercicioDemo;

public abstract class EmpleadoFamilia extends Empleado {
	private int cantidadDeHijos;
	private boolean esCasado;

	public EmpleadoFamilia(int hijos, boolean esCasado) {
		this.cantidadDeHijos = hijos;
		this.esCasado = esCasado;
	}
	
	protected double calcularCasado() {
		double monto = 0;
		if (this.esCasado) {
			monto = 5000;
		}
		return monto;
	}
	protected double calcularHijos() {
		return this.cantidadDeHijos * 2000;
	}
	
	protected double calcularAdicional() {
		return calcularCasado() + calcularHijos();
	}
	
}
