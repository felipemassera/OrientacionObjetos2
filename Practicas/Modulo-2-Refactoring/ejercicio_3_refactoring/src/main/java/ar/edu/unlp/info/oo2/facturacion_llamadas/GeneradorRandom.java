package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

public class GeneradorRandom extends TipoGenerador {
	@Override
	public String obtenerNumeroLibre(SortedSet<String> lineas) {
		return new ArrayList<>(lineas).get(new Random().nextInt(lineas.size()));
	}
}
