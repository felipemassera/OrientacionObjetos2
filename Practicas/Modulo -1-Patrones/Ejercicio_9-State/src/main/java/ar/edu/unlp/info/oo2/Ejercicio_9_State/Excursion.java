package ar.edu.unlp.info.oo2.Ejercicio_9_State;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Excursion {
	private String nombre;
	private State estado;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoEncuentro;
	private double costo;
	private int cupoMin;
	private int cupoMax;
	private List<Usuario> inscriptos;
	private List<Usuario> enListaDeEspera;

	public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String puntoEncuentro, double costo,
			int cupoMin, int cupoMax) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.puntoEncuentro = puntoEncuentro;
		this.costo = costo;
		this.cupoMin = cupoMin;
		this.cupoMax = cupoMax;
		inscriptos = new ArrayList<>();
		enListaDeEspera = new ArrayList<>();
		this.estado = new InscripcionProvisoria(this);
	}

	public void anotarse(Usuario usuario) {
		estado.anotarse(usuario);
	}

	public void inscribirUsuario(Usuario usuario) {
		this.inscriptos.add(usuario);
	}

	public void inscribirUsuarioEnListaDeEspera(Usuario usuario) {
		this.enListaDeEspera.add(usuario);
	}

	public String getInfo() {
		return estado.getInfo();
	}

	public State getEstado() {
		return estado;
	}
	
	public List<Usuario> getEnListaDeEspera() {
		return enListaDeEspera;
	}

	public void cambiarEstado(State estado) {
		this.estado = estado;
	}

	public String getEmailsDeInscriptos() {
		return this.inscriptos.stream().map(usuario -> usuario.getEmail()).collect(Collectors.joining(", "));
	}

	public int cantidadFaltanteDeInscriptosParaMinimo() {
		return this.cupoMin - this.inscriptos.size();
	}

	public int cantidadFaltanteDeInscriptosParaMaximo() {
		return this.cupoMax - this.inscriptos.size();
	}

	public boolean hayLugarMinimo() {
		return this.cantidadFaltanteDeInscriptosParaMinimo() > 0;
	}

	public boolean hayLugarMaximo() {
		return this.cantidadFaltanteDeInscriptosParaMaximo() > 0;
	}

	public String toStringBasico() {
		return (" Excursion nombre" + this.nombre + ", costo: " + this.costo + ", Fecha Inicio " + this.fechaInicio
				+ ", Fecha fin " + this.fechaFin + ", Punto Encuentro : " + this.puntoEncuentro);
	}

}
