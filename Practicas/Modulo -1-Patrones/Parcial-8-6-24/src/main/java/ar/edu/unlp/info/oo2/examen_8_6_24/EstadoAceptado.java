package ar.edu.unlp.info.oo2.examen_8_6_24;

public class EstadoAceptado extends Estado {

	@Override
	public void pagarCuota(Prestamo prestamo) {
		prestamo.pagarCuotaAceptado();
		
		if (prestamo.cuotasRestantes() == 0) {
			prestamo.setEstado(new EstadoFinalizado());
		}
	}

	@Override
	public double gastoCancelacion(Prestamo prestamo) {
		
		return prestamo.calcularGastoCancelacion();
	}
	
	
}
