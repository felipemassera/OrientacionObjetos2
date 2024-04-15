package ar.edu.unlp.info.oo2.Ejercicio_6_Composite;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MixtaTest {
	
	Agua agua1;
	Agua agua2;
	Tierra tierra1;
	Tierra tierra2;
	Pantano pantano1;
	Pantano pantano2;
	Mixta mixtaAguaYTierra;
	Mixta mixtaSoloAguaTierraYMixta;
	Mixta mixtaPantanos;
	Mixta mixtaPantanosYMixta;
	
	@BeforeEach
	void setUp() throws Exception {
		agua1 = new Agua();
		tierra1 = new Tierra();
		agua2 = new Agua();
		tierra2 = new Tierra();
		pantano1 = new Pantano();
		pantano2 = new Pantano();
		mixtaAguaYTierra = new Mixta(agua1, tierra1, agua2, tierra2);
		mixtaSoloAguaTierraYMixta = new Mixta(agua1, tierra1, tierra2, mixtaAguaYTierra);
		mixtaPantanos = new Mixta(agua1, pantano1, tierra1, pantano2);
		mixtaPantanosYMixta = new Mixta(agua1, tierra1, tierra2, mixtaPantanos);
	}

	@Test
	void testProporcionDeAguaMixtaDeAguaYTierra() {
		assertEquals(0.5, mixtaAguaYTierra.proporcionAgua());
	}
	
	@Test
	void testProporcionDeAguaMixtaDeAguaTierraYMixta() {
		assertEquals(0.375, mixtaSoloAguaTierraYMixta.proporcionAgua());
	}
	
	@Test
	void testProporcionDeAguaMixtaDePantanos() {
		assertEquals(0.6, mixtaPantanos.proporcionAgua());
	}
	
	@Test
	void testProporcionDeAguaMixtaDePantanosYMixta() {
		assertEquals(0.4, mixtaPantanosYMixta.proporcionAgua());
	}

	@Test
	void testProporcionDeTierraMixtaDeAguaYTierra() {
		assertEquals(0.5, mixtaAguaYTierra.calcularProporcionDeTierra());
	}
	
	@Test
	void testProporcionDeTierraMixtaDeAguaTierraYMixta() {
		assertEquals(0.625, mixtaSoloAguaTierraYMixta.calcularProporcionDeTierra());
	}
	
	@Test
	void testProporcionDeTierraMixtaDePantanos() {
		assertEquals(0.4, mixtaPantanos.calcularProporcionDeTierra());
	}
	
	@Test
	void testProporcionDeTierraMixtaDePantanosYMixta() {
		assertEquals(0.6, mixtaPantanosYMixta.calcularProporcionDeTierra());
	}
	
	@Test
	void testIsEquals() {
		assertTrue(mixtaAguaYTierra.esIgual(new Mixta(agua2, tierra2, agua1, tierra1)));
		assertFalse(mixtaAguaYTierra.esIgual(mixtaSoloAguaTierraYMixta));
		assertFalse(mixtaAguaYTierra.esIgual(mixtaPantanos));
		assertFalse(mixtaAguaYTierra.esIgual(mixtaPantanosYMixta));
		assertFalse(mixtaAguaYTierra.esIgual(agua1));
		assertFalse(mixtaAguaYTierra.esIgual(tierra1));
		assertFalse(mixtaAguaYTierra.esIgual(pantano1));
	}

}
