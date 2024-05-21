package ar.edu.unlp.info.oo2.Ejercicio_13_Strategy_y_Template;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {

	private Estrategia estrategia;
	private List<Pelicula> grilla;
	private List<Pelicula> reproducidas;

	public Decodificador() {
		this.estrategia = new SugerenciaNovedad();
		this.grilla = new ArrayList();
		this.reproducidas = new ArrayList();
	}

	public void nuevaPeliculaEnGrilla(Pelicula peli) {
		this.grilla.add(peli);
	}

	public void reproducirPelicula(Pelicula pelicula) {
		this.reproducidas.add(pelicula);
	}

	public void cambiarDeEstrategia(Estrategia newEstrategia) {
		this.estrategia = newEstrategia;
	}

	public List<Pelicula> generarSugerencia() {
		return this.estrategia.generarSugerencia(this);
	}

	public boolean fueReproducida(Pelicula pelicula) {
		return this.reproducidas.contains(pelicula);
	}

	public List<Pelicula> getGrilla() {
		return this.grilla;
	}

	public List<Pelicula> getReproducidas() {
		return reproducidas;
	}

	
}
