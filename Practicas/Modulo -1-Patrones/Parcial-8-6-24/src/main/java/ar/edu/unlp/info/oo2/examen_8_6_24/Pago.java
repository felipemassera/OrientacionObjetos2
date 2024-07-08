package ar.edu.unlp.info.oo2.examen_8_6_24;

import java.time.LocalDate;

public class Pago {
	private double monto;
	private LocalDate fecha;
	
	public Pago (double monto) {
		this.monto = monto;
		this.fecha = LocalDate.now();
	}
	
	public double getMonto() {
		return this.monto;
	}
}
