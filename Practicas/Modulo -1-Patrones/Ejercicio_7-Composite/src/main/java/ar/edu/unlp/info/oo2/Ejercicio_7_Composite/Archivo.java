package ar.edu.unlp.info.oo2.Ejercicio_7_Composite;

import java.util.List;

public class Archivo extends FileSystem{   //LEAF

	private int tamanio;
	
	public Archivo (String nombre, int tamanio) {
		super(nombre);
		this.tamanio = tamanio;
	}
	
	@Override
	public int tamanoTotalOcupado() {
		return this.tamanio;
	}

	@Override
	public Archivo archivoMasGrande() {
		return this;
	}

	@Override
	public Archivo archivoMasNuevo() {
		
		return this;
	}

	/**  Retorna el primer elemento con el nombre solicitado contenido en
	cualquier nivel del filesystem	*/
	
	@Override
	public FileSystem buscar(String nombre) {
		if (!this.equalsNombre(nombre)) {
			return null;
		} else {
			return this;
		}
	}

	/** Si el nombre del archivo mio es  = al buscado me agrego a la lista, delego la busqueda*/
	
	@Override
	public void buscarTodos(String nombre, List<FileSystem> elementos) {
		if (this.equalsNombre(nombre)) {
			elementos.add(this);
		}		
	}

	
	@Override
	public String listarContenido(String nombre) {
		return nombre + this.getNombre() + "\n";
	}


}
