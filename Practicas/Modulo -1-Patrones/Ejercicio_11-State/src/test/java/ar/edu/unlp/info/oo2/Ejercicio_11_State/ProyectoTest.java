package ar.edu.unlp.info.oo2.Ejercicio_11_State;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProyectoTest {
	
	private Proyecto vacacionesDeInviernoConCosto;
	private Proyecto vacacionesDeInviernoSinCosto;
	
	
	@BeforeEach
	void setUp() throws Exception{
		vacacionesDeInviernoConCosto = new Proyecto(LocalDate.of(2024,4,15), LocalDate.of(2024,5, 14), "salir con amigos", 3, 1000);
		vacacionesDeInviernoSinCosto = new Proyecto(LocalDate.of(2024,4,15), LocalDate.of(2024,5, 14), "salir sin amigos", 1 , 0);
	}
	
	@Test
	void testAprobarEtapa() {
		assertTrue(vacacionesDeInviernoConCosto.getEstado() instanceof EnConstruccion);
		vacacionesDeInviernoConCosto.aprobarEtapa();
		assertTrue(vacacionesDeInviernoConCosto.getEstado() instanceof EnEvaluacion);
		vacacionesDeInviernoConCosto.aprobarEtapa();
		assertTrue(vacacionesDeInviernoConCosto.getEstado() instanceof Confirmado);
		
		
		RuntimeException excepcion = assertThrows(RuntimeException.class,  () -> {
			vacacionesDeInviernoConCosto.aprobarEtapa();
			});
        assertEquals(excepcion.getMessage(), "ERROR, el proyecto ya fue confirmado");
        
        vacacionesDeInviernoConCosto.cancelarProyecto();
        
        assertTrue(vacacionesDeInviernoConCosto.getEstado() instanceof Cancelado);
		
		RuntimeException excepcion2 = assertThrows(RuntimeException.class,  () -> {
			vacacionesDeInviernoSinCosto.aprobarEtapa();
			});
        assertEquals(excepcion2.getMessage(), "ERROR, Costo = 0");
        
	}
	
	@Test
	void testCostoDelProyecto() {
		assertEquals(87000, vacacionesDeInviernoConCosto.costoDelProyecto());
		assertEquals(0, vacacionesDeInviernoSinCosto.costoDelProyecto());
	}
	
	@Test
	void testPrecioDelProyecto() {
		assertEquals(0.07, vacacionesDeInviernoConCosto.getMargenDeGanancia());
		assertEquals(0, vacacionesDeInviernoSinCosto.precioDelProyecto());
		assertEquals(93090, vacacionesDeInviernoConCosto.precioDelProyecto());
	}
	
	@Test
	void testCambiarMargenDeGanancia() {
		int margen1 = 1;
		int margen2 = 8;
		int margen3 = 10;
		int margen4 = 11;
		
		assertEquals(0.07, vacacionesDeInviernoConCosto.getMargenDeGanancia());
		vacacionesDeInviernoConCosto.modificarMargenDeGanancia(margen2);
		assertEquals(8, vacacionesDeInviernoConCosto.getMargenDeGanancia());
		vacacionesDeInviernoConCosto.modificarMargenDeGanancia(margen4);
		assertEquals(11, vacacionesDeInviernoConCosto.getMargenDeGanancia());
		vacacionesDeInviernoConCosto.modificarMargenDeGanancia(margen1);
		assertEquals(1, vacacionesDeInviernoConCosto.getMargenDeGanancia());
		vacacionesDeInviernoConCosto.modificarMargenDeGanancia(margen3);
		assertEquals(10, vacacionesDeInviernoConCosto.getMargenDeGanancia());
        
	}
	
}
