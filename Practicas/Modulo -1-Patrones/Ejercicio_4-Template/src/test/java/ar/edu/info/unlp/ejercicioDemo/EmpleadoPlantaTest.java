package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoPlantaTest {
	
	EmpleadoPlanta planta;
	
	@BeforeEach
	void setUp() throws Exception {
		planta = new EmpleadoPlanta(1, false, 10);
		
	}
	
    @Test
    public void testNombreCompleto() {
        assertEquals(22000, planta.calcularAdicional());
        assertEquals(50000, planta.calcularSueldoBasico());
        assertEquals(7600, planta.calcularDescuentos());
        assertEquals(64400, planta.sueldo());
    }
}
