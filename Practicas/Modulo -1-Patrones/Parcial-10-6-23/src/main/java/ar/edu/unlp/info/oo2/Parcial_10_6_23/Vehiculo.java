package ar.edu.unlp.info.oo2.Parcial_10_6_23;


import java.time.Year;
import java.time.temporal.ChronoUnit;

import Seguro.Seguro;

public class Vehiculo {

	private double valor;
	private int cantOcupantes;
	private Year anioFabricacion;
	private Seguro seguro;
	
	public Vehiculo(double valor, int cantOcupantes, Year anioFabricacion, Seguro seguro) {
		this.valor = valor;
		this.cantOcupantes = cantOcupantes;
		this.anioFabricacion = anioFabricacion;
		this.seguro = seguro;
	}
	
	public double getValor() {
		return valor;
	}
	
	public int getCantOcupantes() {
		return cantOcupantes;
	}

	public int calcularAntiguedad() {
		return (int) ChronoUnit.YEARS.between(this.anioFabricacion, Year.now());
	}
	
	public double calcularCostoSeguro(Persona persona) {
		return seguro.calcularCostoSeguro(persona, this);
	}
	
}
