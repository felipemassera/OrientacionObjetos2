package ar.edu.info.unlp.ejercicioDemo;

public abstract class EmpleadoFamilia {
	private int cantidadDeHijos;
	private boolean esCasado;

	private double calcularCasado() {
		double monto = 0;

		if (this.esCasado) {
			monto = 5000;
		}
		return monto;
	}

	private double tieneHijos() {
		return this.cantidadDeHijos * 2000;
	}

}
