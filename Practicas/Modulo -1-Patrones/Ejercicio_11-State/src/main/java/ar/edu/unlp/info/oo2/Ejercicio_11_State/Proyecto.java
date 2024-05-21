package ar.edu.unlp.info.oo2.Ejercicio_11_State;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Proyecto {

	private LocalDate fechaDeInicio;
	private LocalDate fechaDeFin;
	private String objetivo;
	private int cantIntegrantes;
	private double montoDiario;
	private double margenDeGanancia;
	private Estado estado;

	public Proyecto(LocalDate fechaDeInicio, LocalDate fechaDeFin, String objetivo, int cantIntegrantes,
			double montoDiario) {
		this.fechaDeInicio = fechaDeInicio;
		this.fechaDeFin = fechaDeFin;
		this.objetivo = objetivo;
		this.cantIntegrantes = cantIntegrantes;
		this.montoDiario = montoDiario;
		this.margenDeGanancia = 0.07;
		this.estado = new EnConstruccion(this);
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public void cambiarEstado(Estado estado) {
		this.estado = estado;
	}
	public void modificarMargenDeGanancia(double ganancia) {
		this.margenDeGanancia = ganancia;
	}

	public int cantidadDeDiasTotales() {
		int diasTotales = (int) ChronoUnit.DAYS.between(this.fechaDeInicio, this.fechaDeFin);
		return diasTotales;
	}

	public double costoDelProyecto() {
		return (this.cantIntegrantes * this.montoDiario) * this.cantidadDeDiasTotales();
	}

	public double precioDelProyecto() {
		
		return costoDelProyecto()*(getMargenDeGanancia()+1);
	}
	
	public void aprobarEtapa() {
		this.estado.aprobarEtapa();
	}
	public void cancelarProyecto() {
		this.estado.cancelarProyecto();
	}
	
	public Estado getEstado() {
		return this.estado;
	}

	public double getMargenDeGanancia() {
		return margenDeGanancia;
	}
	
}
