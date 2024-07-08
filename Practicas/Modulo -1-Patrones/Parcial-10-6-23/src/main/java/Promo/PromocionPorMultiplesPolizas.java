package Promo;

import ar.edu.unlp.info.oo2.Parcial_10_6_23.Persona;

public class PromocionPorMultiplesPolizas implements Promocion {

	public double calcularDescuento(Persona persona) {
		if (persona.cantPolizas()>=2){
			return (0.1 * persona.calcularCostoSeguros());		
		}
		return 0;
	}

}
