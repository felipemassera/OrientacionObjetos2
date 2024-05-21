package ar.edu.unlp.info.oo2.Ejercicio_9_State;

public class InscripcionProvisoria extends State {

	public InscripcionProvisoria(Excursion excursion) {
		super(excursion);
	}

	@Override
	public String getInfo() {
		return (super.toString() + ", Espacio disponible " + this.excursion.cantidadFaltanteDeInscriptosParaMaximo());
	}

	@Override
	public void anotarse(Usuario usuario) {
		this.excursion.inscribirUsuario(usuario);
		if (!this.excursion.hayLugarMinimo()) {
			State nuevoEstado = new InscripcionDefinitiva(this.excursion);
			this.excursion.cambiarEstado(nuevoEstado);
		}
	}
}
