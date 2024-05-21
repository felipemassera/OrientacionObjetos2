package ar.edu.unlp.info.oo2.Ejercicio_12_Adapter_y_Strategy;

import java.util.zip.CRC32;

public class CRC32_Calculator implements EstrategiaCRC{

	
	@Override
	public int crcFor(String datos) {
		CRC32 crc = new CRC32();
		crc.update(datos.getBytes());
		long result = crc.getValue();
		return (int) result;
	}

	
	
	
}
