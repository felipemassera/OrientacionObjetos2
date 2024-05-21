package ar.edu.unlp.info.oo2.Ejercicio_13_Strategy_y_Template;

import java.util.Comparator;
import java.util.List;

public class SugerenciaPuntaje extends Estrategia {

	@Override
	public List<Pelicula> sugerencia(Decodificador deco) {
		return deco.getGrilla().stream().sorted(Comparator.comparingDouble(Pelicula::getPuntaje)
				.thenComparing(Comparator.comparingInt(Pelicula::getAnio).reversed())).toList();
	}

}
