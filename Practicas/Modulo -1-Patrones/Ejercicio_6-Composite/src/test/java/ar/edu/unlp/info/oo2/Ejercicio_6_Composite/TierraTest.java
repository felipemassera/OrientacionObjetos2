package ar.edu.unlp.info.oo2.Ejercicio_6_Composite;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TierraTest {
	Tierra tierra;

	@BeforeEach
	void setUp() throws Exception {
		tierra = new Tierra();
	}

	@Test 
	void testProporcionAgua() {
		assertEquals(0, tierra.proporcionAgua());
	}

	@Test
	void testProporcionTierra() {
		assertEquals(1, tierra.calcularProporcionDeTierra());
	}

	@Test
	void testIsEquals() {
		assertFalse(tierra.esIgual(new Agua()));
		assertTrue(tierra.esIgual(new Tierra()));
		assertFalse(tierra.esIgual(new Pantano()));
	}
}
