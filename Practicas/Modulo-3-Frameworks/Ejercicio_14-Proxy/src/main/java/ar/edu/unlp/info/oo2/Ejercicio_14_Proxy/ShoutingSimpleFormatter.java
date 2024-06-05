package ar.edu.unlp.info.oo2.Ejercicio_14_Proxy;

import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

public class ShoutingSimpleFormatter extends SimpleFormatter{
	
	public String format(LogRecord record) {
		return super.format(record).toUpperCase();
	}
}