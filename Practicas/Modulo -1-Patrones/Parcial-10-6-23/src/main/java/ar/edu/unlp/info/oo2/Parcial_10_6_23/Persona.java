package ar.edu.unlp.info.oo2.Parcial_10_6_23;

import java.util.List;

import Promo.Promocion;

public class Persona {
	private List<Vehiculo> vehiculos;
	private Promocion promo;
	private int edad;
		
	public Persona(List<Vehiculo> vehiculos, Promocion promo, int edad) {
		this.vehiculos = vehiculos;
		this.promo = promo;
		this.edad = edad;
	}

	public int getEdad() {
		return this.edad;
	}
	
	public void agregarVehiculo(Vehiculo vehiculo) {
		this.vehiculos.add(vehiculo);
	}
			
	public double costoTotal() {
		return calcularCostoSeguros() - promo.calcularDescuento(this);
	}
		
	public double calcularCostoSeguros() {
		return this.vehiculos.stream().mapToDouble(vehiculo-> vehiculo.calcularCostoSeguro(this)).sum();
	}
	
	
	
	public void setPromocion(Promocion promocion) {
		this.promo = promocion;
	}
	
	public int cantPolizas() {
		return this.vehiculos.size();
	}
	public double polizaMasChica() {
		return this.vehiculos.stream().mapToDouble(vehiculo-> vehiculo.calcularCostoSeguro(this)).min().orElse(0);
	}
	
}
