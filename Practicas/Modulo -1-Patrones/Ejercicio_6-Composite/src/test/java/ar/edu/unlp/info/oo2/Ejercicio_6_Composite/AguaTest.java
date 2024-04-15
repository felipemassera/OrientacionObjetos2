package ar.edu.unlp.info.oo2.Ejercicio_6_Composite;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AguaTest {
	Agua agua;

	@BeforeEach
	void setUp() throws Exception {
		agua = new Agua();
	}

	@Test 
	void testProporcionAgua() {
		assertEquals(1, agua.proporcionAgua());
	}

	@Test
	void testProporcionTierra() {
		assertEquals(0, agua.calcularProporcionDeTierra());
	}

	@Test
	void testIsEquals() {
		assertTrue(agua.esIgual(new Agua()));
		assertFalse(agua.esIgual(new Tierra()));
		assertFalse(agua.esIgual(new Pantano()));
	}

}
