package Promo;

import ar.edu.unlp.info.oo2.Parcial_10_6_23.Persona;

public class PromocionPorCampanaExcepcional implements Promocion {

	public double calcularDescuento(Persona persona) {
		return persona.polizaMasChica()*0.5;
	}

}
