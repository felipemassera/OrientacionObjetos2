package ar.edu.unlp.info.oo2.Parcial_10_6_23;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	List<Persona> usuarios;
	
	
	public Empresa() {
		
		this.usuarios = new ArrayList<>();
	}


	public void agregarUsuario(Persona persona) {
		usuarios.add(persona);
	}
}
