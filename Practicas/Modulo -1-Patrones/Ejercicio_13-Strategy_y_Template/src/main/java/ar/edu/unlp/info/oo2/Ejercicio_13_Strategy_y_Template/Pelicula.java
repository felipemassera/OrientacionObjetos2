package ar.edu.unlp.info.oo2.Ejercicio_13_Strategy_y_Template;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
	private String titulo;
	private int anioDeEstreno;
	private double puntaje;
	private List<Pelicula> similares;

	public Pelicula(String titulo, int anioDeEstreno, double puntaje) {
		this.titulo = titulo;
		this.anioDeEstreno = anioDeEstreno;
		this.puntaje = puntaje;
		this.similares = new ArrayList();
	}

	public void addSimilares(Pelicula peli) {
		if (!this.similares.contains(peli)) {
			this.similares.add(peli);
			peli.addSimilares(this);
		}
	}

	public List<Pelicula> getSimilares() {
		return this.similares;
	}

	public String getTitulo() {
		return this.titulo;
	}
	public int getAnio() {
		return this.anioDeEstreno;
	}
	
	public double getPuntaje() {
		return this.puntaje;
	}
}
