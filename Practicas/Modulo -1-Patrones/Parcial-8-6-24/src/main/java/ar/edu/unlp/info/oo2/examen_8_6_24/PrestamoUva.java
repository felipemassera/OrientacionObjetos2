package ar.edu.unlp.info.oo2.examen_8_6_24;

public class PrestamoUva extends Prestamo{

	public PrestamoUva(int cantCuotas, Double monto, double sueldo) {
		super(cantCuotas, monto, sueldo);
	}

	@Override
	protected double getInteres() {
		/**
		 * EN el examen nos dieron para que lo hagamos con la sig formula (que no existe)
		 * lo reemplazo por una inflacion estatica del 10% para hacer pruebas
		 * return Indec.getIndiceInflacion();   
		 */
		return 0.1; 
	}

	@Override
	protected int getGastoSellado() {
		return 0;
	}

	
}
