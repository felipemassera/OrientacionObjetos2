package ar.edu.unlp.info.oo2.Ejercicio_12_Adapter_y_Strategy;

public class WifiConn implements Connection {

	private String pict;

	@Override
	public String sendData(String data, int crc) {
		return "mensaje transmitido wifi: " + data + " " + crc;
	}

	@Override
	public String pict() {
		return this.pict;
	}
}
