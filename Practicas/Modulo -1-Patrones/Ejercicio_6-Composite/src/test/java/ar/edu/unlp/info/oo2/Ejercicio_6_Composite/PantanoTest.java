package ar.edu.unlp.info.oo2.Ejercicio_6_Composite;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PantanoTest {
	Pantano pantano;

	@BeforeEach
	void setUp() throws Exception {
		pantano = new Pantano();
	}

	@Test 
	void testProporcionAgua() {
		assertEquals(0.7, pantano.proporcionAgua());
	}

	@Test
	void testProporcionTierra() {
		assertEquals(0.30000000000000004, pantano.calcularProporcionDeTierra());
	}

	@Test
	void testIsEquals() {
		assertFalse(pantano.esIgual(new Agua()));
		assertFalse(pantano.esIgual(new Tierra()));
		assertTrue(pantano.esIgual(new Pantano()));
	}
}
