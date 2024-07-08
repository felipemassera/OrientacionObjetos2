package ar.edu.unlp.oo1.ejercicio1.app;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

public class JSONFormatter extends Formatter {
	
	@Override
	public String format(LogRecord record) {		
		return "{ "+"\"Message\":"+ "\""+record.getMessage() +"\""+ ", \"level\": "+ "\""+record.getLevel()+"\""+" }"+"\n";
	}
}
