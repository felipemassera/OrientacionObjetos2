package ar.edu.unlp.info.oo2.examen_8_6_24;

public abstract class Estado {
	
	public void pagarCuota(Prestamo prestamo) {
		throw new Error ("error");
	}
	
	public abstract double gastoCancelacion(Prestamo prestamo);
	
}
