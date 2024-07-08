package ar.edu.unlp.info.oo2.examen_8_6_24;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nombre;
	private double sueldo;
	private List<Prestamo> prestamos;
	
	public Cliente (String nombre, double sueldo) {
		this.nombre = nombre;
		this.sueldo= sueldo;
		this.prestamos = new ArrayList<Prestamo>();
	}
	
	public double getSueldo() {
		return this.sueldo;
	}
		
	public Prestamo agregarPrestamoSimple(int cantidadCuotas, double monto, double interesPrestamoSimple) {
		Prestamo prestamo = new PrestamoSimple(cantidadCuotas, monto, this.getSueldo(),interesPrestamoSimple);
		this.prestamos.add(prestamo);
		return prestamo;
	}
	public Prestamo agregarPrestamoUva(int cantidadCuotas, double monto) {
		Prestamo prestamo = new PrestamoUva(cantidadCuotas, monto, this.getSueldo());
		this.prestamos.add(prestamo);
		return prestamo;
	}	
	
	
}
