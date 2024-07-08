package Seguro;

import ar.edu.unlp.info.oo2.Parcial_10_6_23.Persona;
import ar.edu.unlp.info.oo2.Parcial_10_6_23.Vehiculo;

public abstract class Seguro {

	public double calcularCostoSeguro(Persona persona, Vehiculo vehiculo) {
		return this.costoSeguroDeVida(persona, vehiculo) + this.costoCoberturaDeDaños(persona, vehiculo)
				+ this.costoCoberturaDestruccionTotal(vehiculo);
	}

	protected int costoSeguroDelConductor(Persona persona) {
		return 100 * persona.getEdad();
	}

	protected abstract double costoSeguroDeVida(Persona persona, Vehiculo vehiculo);

	protected abstract double costoCoberturaDeDaños(Persona persona, Vehiculo vehiculo);

	protected double costoCoberturaDestruccionTotal(Vehiculo vehiculo) {
		return 0.005 * vehiculo.getValor();
	}
}
