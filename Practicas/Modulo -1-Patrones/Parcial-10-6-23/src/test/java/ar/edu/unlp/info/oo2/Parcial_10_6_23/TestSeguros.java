package ar.edu.unlp.info.oo2.Parcial_10_6_23;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Year;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Promo.SinPromocion;
import Seguro.SeguroContraTerceros;

public class TestSeguros {
	
	private Persona persona;
	
	@BeforeEach
	void setUp() {
		Vehiculo renault11 = new Vehiculo(680000, 4, Year.of(1988), new SeguroContraTerceros());
		Vehiculo renaultClio = new Vehiculo(1200000, 5, Year.of(2001), new SeguroContraTerceros()); 			
		persona = new Persona(new ArrayList<Vehiculo>(), new SinPromocion(), 50);
		persona.agregarVehiculo(renault11);
		persona.agregarVehiculo(renaultClio);	 
	}
	
	@Test
	void testCalcularCostoTotal() {
		assertEquals(40200.0, persona.costoTotal());
	}
}
