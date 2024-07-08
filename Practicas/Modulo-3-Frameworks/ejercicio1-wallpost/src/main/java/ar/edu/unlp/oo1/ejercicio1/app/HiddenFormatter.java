package ar.edu.unlp.oo1.ejercicio1.app;

import java.util.List;
import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

public class HiddenFormatter extends SimpleFormatter {
	List<String> words;
	public HiddenFormatter(List<String> words) {
		super();
		this.words = words; 
	}

	public String format(LogRecord record) {
		
		for (String string : words) {
			record.setMessage(record.getMessage().replace(string, "***"));
		}
		return super.format(record) ;
	}
	
}
