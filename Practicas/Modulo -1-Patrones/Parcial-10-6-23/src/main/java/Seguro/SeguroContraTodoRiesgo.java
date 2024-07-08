package Seguro;

import ar.edu.unlp.info.oo2.Parcial_10_6_23.Persona;
import ar.edu.unlp.info.oo2.Parcial_10_6_23.Vehiculo;

public class SeguroContraTodoRiesgo extends Seguro{

	@Override
	protected double costoSeguroDeVida(Persona persona, Vehiculo vehiculo) {
 		return costoSeguroDelConductor(persona)+9000*vehiculo.calcularAntiguedad();
	}

	@Override
	protected double costoCoberturaDeDaños(Persona persona, Vehiculo vehiculo) {
		return 100000/persona.getEdad();
	}
	protected double costoCoberturaDestruccionTotal(Vehiculo vehiculo) {
		return super.costoCoberturaDestruccionTotal(vehiculo)+1000*vehiculo.calcularAntiguedad();
	}
}
