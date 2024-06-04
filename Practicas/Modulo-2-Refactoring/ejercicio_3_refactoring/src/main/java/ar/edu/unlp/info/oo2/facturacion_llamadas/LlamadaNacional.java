package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaNacional extends Llamada{

	public LlamadaNacional(String origen, String destino, int duracion) {
		super(origen, destino, duracion);
	}
	
	@Override
	protected double calcularPrecioBase() {
		return getDuracion() * 3 ;
	}

	@Override
	protected double calcularIva() {
		return (getDuracion() * 3 * 0.21);
	}

	@Override
	protected double calcularAdicional() {
		return 0;
	}

}
