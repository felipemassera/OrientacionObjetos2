package ar.edu.info.unlp.ejercicioDemo;

public class EmpleadoPasante extends Empleado{
	
	private int cantidadExamenesRendidos;
	
	public EmpleadoPasante(int cantidadExamenesRendidos) {
		this.cantidadExamenesRendidos = cantidadExamenesRendidos;
	}
	@Override
	protected double calcularSueldoBasico() {
		return 20000;
	}

	@Override
	protected double calcularAdicional() {
		return this.cantidadExamenesRendidos * 2000;
	}
		
}
