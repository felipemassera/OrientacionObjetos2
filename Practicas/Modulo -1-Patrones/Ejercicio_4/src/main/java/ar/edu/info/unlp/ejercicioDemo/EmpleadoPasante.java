package ar.edu.info.unlp.ejercicioDemo;

public class EmpleadoPasante extends Empleado {

	private int cantidadExamenes;

	public EmpleadoPasante(int examenes) {
		this.cantidadExamenes = examenes;
	}

	@Override
	protected double calcularSueldoBasico() {
		return 20000;
	}

	@Override
	protected double calcularAdicional() {
		return this.cantidadExamenes * 2000;
	}

}