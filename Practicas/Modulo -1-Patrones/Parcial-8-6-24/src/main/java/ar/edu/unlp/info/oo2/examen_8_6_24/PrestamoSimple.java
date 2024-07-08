package ar.edu.unlp.info.oo2.examen_8_6_24;

public class PrestamoSimple extends Prestamo{

	private double interes;
	
	public PrestamoSimple(int cantCuotas, double monto, double sueldo, double interes) {
		super(cantCuotas, monto, sueldo);
		this.interes= interes;
	}
	@Override
	protected double getInteres() {
		return this.interes;
	}
	
	@Override
	public int getGastoSellado() {
		return 5000;
	}
	
}
