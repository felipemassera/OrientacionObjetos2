package ar.edu.unlp.info.oo2.Ejercicio_7_Composite;

import java.util.ArrayList;
import java.util.List;

public class Directorio extends FileSystem { // Composite

	private List<FileSystem> contenido;

	public Directorio(String nombre) {
		super(nombre);
		this.contenido = new ArrayList<>();
	}

	public List<FileSystem> getContenido() {
		return new ArrayList<FileSystem>(this.contenido);
	}

	@Override
	public int tamanoTotalOcupado() {
		return 32 + this.getContenido().stream().mapToInt(archivo -> archivo.tamanoTotalOcupado()).sum();
	}

	@Override
	public Archivo archivoMasGrande() {
		return (Archivo) this.getContenido().stream().map(componente1 -> componente1.archivoMasGrande())
				.max((a1, a2) -> Integer.compare(a1.tamanoTotalOcupado(), a2.tamanoTotalOcupado())).orElse(null);
	}

	@Override
	public Archivo archivoMasNuevo() {
		return (Archivo) this.getContenido().stream().map(componente1 -> componente1.archivoMasNuevo())
				.max((a1, a2) -> a1.getFechaDeCreacion().compareTo(a2.getFechaDeCreacion())).orElse(null);
	}

	@Override
	public FileSystem buscar(String nombre) {
		if (this.equalsNombre(nombre)) {
			return this;
		}
		//de forma recursiva cada objeto del directorio consulta si es o no = nombre
		return this.getContenido().stream().filter(elemento->elemento.buscar(nombre) != null).findFirst().orElse(null);
	}

	@Override
	public void buscarTodos(String nombre, List<FileSystem> elementos) {
		if (this.equalsNombre(nombre)) {
			elementos.add(this);
		}
		this.getContenido().stream().forEach(componente -> componente.buscarTodos(nombre, elementos));
	}

	
	public String listarContenido() {
		StringBuilder listado = new StringBuilder();
		listado.append(this.getNombre()).append("\n");
		this.getContenido().stream()
		.forEach(componente -> listado.append(componente.listarContenido(this.getNombre())));
		String resultado = listado.toString();
		return resultado;
	}
	
	@Override
	public String listarContenido(String nombre) {
		String pathActual = nombre + this.getNombre();
		StringBuilder listado = new StringBuilder();
		listado.append(pathActual).append("\n");
		this.getContenido().stream()
		.forEach(componente -> listado.append(componente.listarContenido(pathActual)));
		String resultado = listado.toString();
		return resultado;
	}
	
	public void addComponente(FileSystem componente) {
		this.contenido.add(componente);
	}
}
