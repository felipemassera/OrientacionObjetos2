package ar.edu.unlp.info.oo2.Ejercicio_7_Composite;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class FileSystem { // COMPONENT

	private String nombre;
	private LocalDate fechaDeCreacion;

	public FileSystem(String nombre) {
		this.nombre = "/" + nombre;
		this.fechaDeCreacion = LocalDate.now();
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaDeCreacion() {
		return fechaDeCreacion;
	}

	/**
	 * Retorna el espacio total ocupado, incluyendo todo su contenido.
	 */
	public abstract int tamanoTotalOcupado();

	/**
	 * Retorna el archivo con mayor cantidad de bytes en cualquier nivel del
	 * filesystem
	 */
	public abstract Archivo archivoMasGrande();

	/**
	 * Retorna el archivo con fecha de creación más reciente en cualquier nivel del
	 * filesystem
	 */
	public abstract Archivo archivoMasNuevo();

	/**
	 * Retorna el primer elemento con el nombre solicitado contenido en cualquier
	 * nivel del filesystem
	 */
	public abstract FileSystem buscar(String nombre);

	// Substring(1) indica desde que pos arranca a mostrar el string, en este caso
	// obvia el "/" de la pos "0";
	public boolean equalsNombre(String nombre) {
		return this.getNombre().substring(1).equals(nombre);
	}

	/**
	 * Retorna la lista con los elementos que coinciden con el nombre solicitado
	 * contenido en cualquier nivel del filesystem
	 */

	public List<FileSystem> buscarTodos(String nombre) {
		List<FileSystem> elementos = new ArrayList<FileSystem>();
		this.buscarTodos(nombre, elementos);
		return elementos;
	}

	public abstract void buscarTodos(String nombre, List<FileSystem> elementos);

	/**
	 * Retorna un String con los nombres de los elementos contenidos en todos los
	 * niveles del filesystem. De cada elemento debe retornar el path completo
	 * (similar al comando pwd de linux) siguiendo el modelo presentado a
	 * continuación 
	 * /Directorio A 
	 * /Directorio A/Directorio A.1 
	 * /Directorio A/Directorio A.1/Directorio A.1.1 
	 * /Directorio A/Directorio A.1/Directorio A.1.2 
	 * /Directorio A/Directorio A.2 /Directorio B
	 */
	public abstract String listarContenido(String nombre);

}
