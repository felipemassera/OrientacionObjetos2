package ar.edu.unlp.info.oo2.Ejercicio_9_State;

public class InscripcionCompleta extends State {

	public InscripcionCompleta(Excursion excursion) {
		super(excursion);
	}

	@Override
	public String getInfo() {
		return super.toString();
	}

	@Override
	public void anotarse(Usuario usuario) {
		this.excursion.inscribirUsuarioEnListaDeEspera(usuario);
	}

}
