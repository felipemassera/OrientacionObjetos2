package ar.edu.unlp.info.oo2.Ejercicio_13_Strategy_y_Template;

import java.util.List;
import java.util.stream.Collectors;

public class SugerenciaSimilaridad extends Estrategia {

	@Override
	public List<Pelicula> sugerencia(Decodificador deco) {
		return deco.getReproducidas().stream().flatMap(pelicula -> pelicula.getSimilares().stream()).distinct()
				.sorted((p1, p2) -> Integer.compare(p2.getAnio(), p1.getAnio())).collect(Collectors.toList());
	}

}
