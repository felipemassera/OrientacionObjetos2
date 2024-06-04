package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaInternacional extends Llamada {

	public LlamadaInternacional(String origen, String destino, int duracion) {
		super(origen, destino, duracion);
	}

	@Override
	protected double calcularPrecioBase() {
		return getDuracion() * 150;
	}
	@Override
	protected double calcularIva() {
		return (getDuracion() * 150 * 0.21);
	}
	@Override
	protected double calcularAdicional() {
		return 50;
	}

}
