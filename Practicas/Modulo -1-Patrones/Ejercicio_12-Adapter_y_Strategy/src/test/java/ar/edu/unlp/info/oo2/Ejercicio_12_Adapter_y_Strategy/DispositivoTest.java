package ar.edu.unlp.info.oo2.Ejercicio_12_Adapter_y_Strategy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DispositivoTest {

	private Dispositivo dispositivo;
	
	@BeforeEach
	void setUp() throws Exception {
		dispositivo = new Dispositivo();
		
	}

	@Test
	void testSendCRC16Wifi() {
		assertEquals("mensaje transmitido wifi: Todo lo que sube tiene que bajar 51159", this.dispositivo.send("Todo lo que sube tiene que bajar"));
	}
	
	@Test
	void testSendCRC32Wifi() {
		this.dispositivo.configurarCRC(new CRC32_Calculator());
		assertEquals("mensaje transmitido wifi: A caballo regalado no se le miran los dientes 1164093407", this.dispositivo.send("A caballo regalado no se le miran los dientes"));
	}
	
	@Test
	void testSendCRC164G() {
		this.dispositivo.conectarCon(new ConnectionAdapter());
		assertEquals("mensaje transmitido 4g: Siempre que llovió paró 24564", this.dispositivo.send("Siempre que llovió paró"));
	}
	
	@Test
	void testSendCRC324G() {
		this.dispositivo.conectarCon(new ConnectionAdapter());
		this.dispositivo.configurarCRC(new CRC32_Calculator());
		assertEquals("mensaje transmitido 4g: Visteme despacio que estoy apurado 1925576702", this.dispositivo.send("Visteme despacio que estoy apurado"));
	}
	
	@Test
	void testConectarCon() {
		assertEquals("Connection changed", this.dispositivo.conectarCon(new ConnectionAdapter()));
		assertEquals("Connection changed", this.dispositivo.conectarCon(new WifiConn()));
	}
	
	@Test
	void testConfigurarCRC() {
		assertEquals("CRC calculator changed", this.dispositivo.configurarCRC(new CRC32_Calculator()));
		assertEquals("CRC calculator changed", this.dispositivo.configurarCRC(new CRC16_Calculator()));
	}
	
}
