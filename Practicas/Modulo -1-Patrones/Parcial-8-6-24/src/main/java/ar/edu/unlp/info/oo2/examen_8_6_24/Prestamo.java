package ar.edu.unlp.info.oo2.examen_8_6_24;

import java.util.ArrayList;
import java.util.List;

public abstract class Prestamo {
	private List<Pago> cuotasPagas;
	private int cantCuotas;
	private double monto;
	private Estado estado;
	
	public Prestamo (int cantCuotas, double monto, double sueldo) {
		cuotasPagas = new ArrayList<Pago>();
		this.cantCuotas = cantCuotas;
		this.monto = monto;
		
		if (aptoPrestamo( this.valorCuota(), sueldo)) {
			this.estado = new EstadoAceptado();
		}else {
			this.estado = new EstadoRechazado();
		}
	}
	
	public void setEstado(Estado nuevoEstado) {
		this.estado = nuevoEstado;
	}
	
	public boolean aptoPrestamo(double valorCuota, double sueldo) {
		return valorCuota <= sueldo*0.3; 
	}
	
	/////////////TEMPLATE
	public double valorCuota() {
		return (getMonto()/ getCantCuotas()) * (1+getInteres());
	}
	protected abstract double getInteres();
	protected double getMonto(){
		return this.monto;
	}
	protected double getCantCuotas(){
		return this.cantCuotas;
	}
	///////////////////
	public void pagarCuota(){
		estado.pagarCuota(this);
	}
	public int cuotasRestantes() {
		return this.cantCuotas -this.cuotasPagas.size();  
	}
	
	public void pagarCuotaAceptado() {
		double montoAPagar = this.valorCuota();
		Pago pago = new Pago (montoAPagar);
		this.cuotasPagas.add(pago);
	}
	
	public double montoTotalPagado() {
		return this.cuotasPagas.stream().mapToDouble(pago -> pago.getMonto()).sum();
	}
	
	
	public double montoRestante() {
		return this.valorCuota() * cuotasRestantes();
	}
	
	public double gastoCancelacion() {
		return this.estado.gastoCancelacion(this);
	}
	protected abstract int getGastoSellado();

	public double calcularGastoCancelacion() {
		double valorAdministrativo = 0.1;
		return valorAdministrativo * this.montoRestante() + this.getGastoSellado()+this.montoRestante();
	}
}

