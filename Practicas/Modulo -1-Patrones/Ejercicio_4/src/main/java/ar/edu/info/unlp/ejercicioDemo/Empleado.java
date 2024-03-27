package ar.edu.info.unlp.ejercicioDemo;

public abstract class Empleado {

	protected Double sueldo() {
		return this.calcularAdicional() + this.calcularSueldoBasico() - this.calcularDescuentos();
	}

	protected double calcularDescuentos() {
		return this.calcularSueldoBasico() * 0.13 + this.calcularAdicional() * 0.05;
	}
	
//	protected Double sueldo() {
//		double adicional = this.calcularAdicional();
//		double sueldoBasico = this.calcularSueldoBasico();
//		return adicional + sueldoBasico - this.calcularDescuentos2(adicional, sueldoBasico);
//	}
//
//	protected double calcularDescuentos(double adicional, double sueldoBasico) {
//		return sueldoBasico * 0.13 + adicional * 0.05;
//	}

	protected abstract double calcularSueldoBasico();
	
	protected abstract double calcularAdicional();
}
