package ar.edu.unlp.info.oo2.Ejercicio_14_Proxy;

import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

public class JSONFormatter extends SimpleFormatter {
	public String formater(LogRecord record) {
		System.out.print(record.toString());
		
		return record.toString();
	}
}
