package ar.edu.unlp.info.oo2.examen_8_6_24;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BancoTest {

	private Banco banco;
	private Prestamo prestamoSimple;
	private Cliente cliente;
	
	@BeforeEach
	void setUp() {
		cliente = new Cliente("joaco", 5000);
		banco = new Banco();
		banco.registrarCliente(cliente);
		prestamoSimple = cliente.agregarPrestamoSimple(10, 100, 0.05);
	}
	
	@Test
	void TestPrestamoSimple() {
		assertEquals(0,prestamoSimple.montoTotalPagado());
		prestamoSimple.pagarCuota();
		assertEquals(10.5, prestamoSimple.montoTotalPagado());
	}
	
}
