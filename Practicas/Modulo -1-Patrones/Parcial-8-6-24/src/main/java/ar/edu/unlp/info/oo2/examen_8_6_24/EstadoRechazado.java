package ar.edu.unlp.info.oo2.examen_8_6_24;

public class EstadoRechazado extends Estado {

	@Override
	public double gastoCancelacion(Prestamo prestamo) {
		throw new Error ("error");
	}

	

}
