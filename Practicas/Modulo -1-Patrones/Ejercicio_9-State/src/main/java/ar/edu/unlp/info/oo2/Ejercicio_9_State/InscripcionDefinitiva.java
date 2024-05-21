package ar.edu.unlp.info.oo2.Ejercicio_9_State;

public class InscripcionDefinitiva extends State {

	public InscripcionDefinitiva(Excursion excursion) {
		super(excursion);
	}

	@Override
	public String getInfo() {
		return (super.toString() + ", Espacio disponible " + this.excursion.cantidadFaltanteDeInscriptosParaMaximo()
				+ ", Emails usuarios: " + this.excursion.getEmailsDeInscriptos());
	}

	@Override
	public void anotarse(Usuario usuario) {
		this.excursion.inscribirUsuario(usuario);
		if (!this.excursion.hayLugarMaximo()) {
			State nuevoEstado = new InscripcionCompleta(this.excursion);
			this.excursion.cambiarEstado(nuevoEstado);
		}

	}

}
