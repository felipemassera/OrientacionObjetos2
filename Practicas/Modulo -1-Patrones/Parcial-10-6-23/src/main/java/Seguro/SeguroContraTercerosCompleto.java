package Seguro;

import ar.edu.unlp.info.oo2.Parcial_10_6_23.Persona;
import ar.edu.unlp.info.oo2.Parcial_10_6_23.Vehiculo;

public class SeguroContraTercerosCompleto extends Seguro {

	@Override
	protected double costoSeguroDeVida(Persona persona, Vehiculo vehiculo) {
		return costoSeguroDelConductor(persona) + 5000 * vehiculo.getCantOcupantes();
	}

	@Override
	protected double costoCoberturaDeDaños(Persona persona, Vehiculo vehiculo) {
		int antiguedad = vehiculo.calcularAntiguedad();
		if (antiguedad > 4) {
			return 4000 * antiguedad;
		}
		return 10000;
	}

	protected double costoCoberturaDestruccionTotal(Vehiculo vehiculo) {
		return super.costoCoberturaDestruccionTotal(vehiculo) + 1000;
	}

}
