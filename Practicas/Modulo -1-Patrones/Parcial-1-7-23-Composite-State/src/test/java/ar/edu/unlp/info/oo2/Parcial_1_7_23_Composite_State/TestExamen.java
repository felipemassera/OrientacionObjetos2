package ar.edu.unlp.info.oo2.Parcial_1_7_23_Composite_State;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestExamen {

	private TareaCompleja prepararAlmuerzo;
	
	
	@BeforeEach
	void setUp() {
		prepararAlmuerzo = new TareaCompleja("preparar almuerzo", "muchos pasos");
		TareaCompleja realizarCompras = new TareaCompleja("realizar compras", "por todos lados");
		TareaSimple irAlSuper = new TareaSimple("ir al supermercado", "vea", 3);
		TareaSimple irAlaVerdu = new TareaSimple("ir a la verdulería", "la de los paraguayos de  la vuelta", 1);
		TareaSimple cocinar = new TareaSimple("cocinar", "alto guiso", 2);
		TareaSimple prepararMesa = new TareaSimple("preparar mesa", "alta mesa", 1);
		
		realizarCompras.agregarTarea(irAlSuper);
		realizarCompras.agregarTarea(irAlaVerdu);
		prepararAlmuerzo.agregarTarea(realizarCompras);
		prepararAlmuerzo.agregarTarea(cocinar);
		prepararAlmuerzo.agregarTarea(prepararMesa);
		realizarCompras.iniciarTarea();
		realizarCompras.completarTarea();
		irAlSuper.setInicio(9);
		irAlSuper.setFin(11);
		irAlaVerdu.setInicio(11);
		irAlaVerdu.setFin(12);
		
		cocinar.iniciarTarea();
		cocinar.setInicio(12);
	}
	
	@Test
	void testExamen() {
		assertEquals(0.42857142857142855, prepararAlmuerzo.avanceDeTarea());
		assertEquals(3, prepararAlmuerzo.tiempoUtilizadoEnTarea());
		assertEquals(7, prepararAlmuerzo.estimacionTotalDeTarea());
	}
	
	
}
