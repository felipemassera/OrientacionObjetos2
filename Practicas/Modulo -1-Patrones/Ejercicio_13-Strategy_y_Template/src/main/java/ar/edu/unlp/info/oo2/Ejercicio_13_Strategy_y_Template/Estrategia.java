package ar.edu.unlp.info.oo2.Ejercicio_13_Strategy_y_Template;

import java.util.List;

public abstract class Estrategia {

	Decodificador deco;

	/*
	 * filtro primero las peliculas por la estrategia y luego realizo el filtrado por no vistas y
	 *  muestro las 3 primeras
	 */
	
	public List<Pelicula> generarSugerencia(Decodificador deco) {
		List<Pelicula> pelisSugeridas = (this.sugerencia(deco)).stream()
				.filter(pelicula -> !deco.fueReproducida(pelicula)).limit(3).toList();

		return pelisSugeridas;
	}

	public abstract List<Pelicula> sugerencia(Decodificador deco);

}
