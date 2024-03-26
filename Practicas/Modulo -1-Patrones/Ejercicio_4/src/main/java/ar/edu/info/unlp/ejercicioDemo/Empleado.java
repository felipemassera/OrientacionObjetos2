package ar.edu.info.unlp.ejercicioDemo;

public abstract class Empleado {

	protected Double sueldo() {
		return this.calcularAdicional() + this.calcularSueldoBasico() - this.calcularDescuentos();
	}

	protected abstract double calcularSueldoBasico();

	protected abstract double calcularAdicional();

	protected double calcularDescuentos() {
		return this.calcularSueldoBasico() * 0.13 + this.calcularAdicional() * 0.05;
	}
}
