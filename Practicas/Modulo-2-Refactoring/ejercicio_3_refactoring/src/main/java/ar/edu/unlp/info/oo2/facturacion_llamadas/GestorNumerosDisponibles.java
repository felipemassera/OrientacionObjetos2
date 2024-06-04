package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

public class GestorNumerosDisponibles {
    private SortedSet<String> lineas = new TreeSet<>();
    private TipoGenerador tipoGenerador = new GeneradorUltimo();

    public SortedSet<String> getLineas() {
        return lineas;
    }

    public String obtenerNumeroLibre() {
    	String nuevaLinea = this.tipoGenerador.obtenerNumeroLibre(lineas);
    	lineas.remove(nuevaLinea);
        return nuevaLinea;
    }

    public void cambiarTipoGenerador(TipoGenerador tipoGenerador) {
        this.tipoGenerador = tipoGenerador;
    }
    
    public boolean agregarNumeroTelefono(String numeroTelefono) {
		if (!getLineas().contains(numeroTelefono)) {
			getLineas().add(numeroTelefono);
			return true;
		}
		else {
			return false;
		}
	}
    
}
