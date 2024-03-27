package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoPasanteTest {
	
	EmpleadoPasante pasante;
	
	@BeforeEach
	void setUp() throws Exception {
		pasante = new EmpleadoPasante(4);
		
	}
	
    @Test
    public void testNombreCompleto() {
        assertEquals(8000, pasante.calcularAdicional());
        assertEquals(3000, pasante.calcularDescuentos());
        assertEquals(25000, pasante.sueldo());
    }
    
}
