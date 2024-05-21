package ar.edu.unlp.info.oo2.Ejercicio_12_Adapter_y_Strategy;

public class ConnectionAdapter implements Connection {

	public String sendData(String data, int crc) {
		FourGConnection gggg = new FourGConnection();
		return gggg.transmit(data, crc);
	}

	public String pict() {
		FourGConnection gggg = new FourGConnection();
		return gggg.symb();
	}
}
