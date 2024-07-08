package Seguro;

import ar.edu.unlp.info.oo2.Parcial_10_6_23.Persona;
import ar.edu.unlp.info.oo2.Parcial_10_6_23.Vehiculo;

public class SeguroContraTerceros extends Seguro{

	@Override
	protected double costoSeguroDeVida(Persona persona, Vehiculo vehiculo) {
		return costoSeguroDelConductor(persona);
	}

	@Override
	protected double costoCoberturaDeDaños(Persona persona, Vehiculo vehiculo) {
		return 1000 + 0.01 * vehiculo.getValor();
	}
}
