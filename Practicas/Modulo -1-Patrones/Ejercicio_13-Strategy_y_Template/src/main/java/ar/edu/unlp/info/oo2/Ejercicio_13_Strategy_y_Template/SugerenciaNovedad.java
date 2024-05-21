package ar.edu.unlp.info.oo2.Ejercicio_13_Strategy_y_Template;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SugerenciaNovedad extends Estrategia {

	@Override
	public List<Pelicula> sugerencia(Decodificador deco) {

		return deco.getGrilla().stream().sorted(Comparator.comparingInt(Pelicula::getAnio).reversed())
				.collect(Collectors.toList());

	}

}
