package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTemporarioTest {
	
	EmpleadoTemporario temporario;
	
	@BeforeEach
	void setUp() throws Exception {
		temporario = new EmpleadoTemporario(3,true,10);
		
	}
	
    @Test
    public void testNombreCompleto() {
        assertEquals(11000, temporario.calcularAdicional());
        assertEquals(23000, temporario.calcularSueldoBasico());
        assertEquals(3540, temporario.calcularDescuentos());
        assertEquals(30460, temporario.sueldo());
    }
}
