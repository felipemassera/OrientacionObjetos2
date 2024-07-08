package ar.edu.unlp.info.oo2.examen_8_6_24;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<Cliente> clientes;
	private double interesPrestamoSimple = 0.15;
	
	public Banco() {
		clientes = new ArrayList<Cliente>();
	}
	
	public void registrarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public Prestamo SolicitarUnPrestamoSimple(int cantidadCuotas, double monto, Cliente cliente) {
		return cliente.agregarPrestamoSimple(cantidadCuotas, monto, this.interesPrestamoSimple);
		
	}
	public Prestamo SolicitarUnPrestamoUva(int cantidadCuotas, double monto, Cliente cliente) {
		return cliente.agregarPrestamoUva(cantidadCuotas, monto);
	}	
	
	public double valorCuota(Prestamo prestamo) {
		return prestamo.valorCuota();
	}
	
	public void pagarCuota(Prestamo prestamo) {
		prestamo.pagarCuota();
	}
	
	public double montoTotalPagado(Prestamo prestamo) {
		return prestamo.montoTotalPagado();
	}
	
	public double montoRestante(Prestamo prestamo) {
		return prestamo.montoRestante();
	}
	
	public double gastoCancelacion(Prestamo prestamo) {
		return prestamo.gastoCancelacion();
	}
}
