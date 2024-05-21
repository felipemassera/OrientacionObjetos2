package ar.edu.unlp.info.oo2.Ejercicio_12_Adapter_y_Strategy;

public class FourGConnection {
	private String symb = "4g";

	public String transmit(String data, int crc) {
		return "mensaje transmitido 4g: " + data + " " + crc;
	}

	public String symb() {
		return this.symb;
	}

}
