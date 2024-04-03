package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BibliotecaTest {
	
	Biblioteca biblioteca;
	Socio socio1;
	Socio socio2;
	JSONParser parser;

	@BeforeEach
	void setUp() throws Exception {
		biblioteca = new Biblioteca();
		socio1 = new Socio("Arya Stark", "needle@stark.com", "5234-5");
		socio2 = new Socio("Tyron Lannister", "tyron@thelannisters.com", "2345-2");
		biblioteca.agregarSocio(socio1);
		biblioteca.agregarSocio(socio2);
		parser = new JSONParser();
	}

	@Test
	void testJSONSimple() throws ParseException {
		VoorheesExporter adapter = new JSONSimpleAdapter();
		String salida = "[\n"
				+ "	{\n"
				+ "		\"nombre\": \"Arya Stark\",\n"
				+ "		\"email\": \"needle@stark.com\",\n"
				+ "		\"legajo\": \"5234-5\"\n"
				+ "	},\n"
				+ "	{\n"
				+ "		\"nombre\": \"Tyron Lannister\",\n"
				+ "		\"email\": \"tyron@thelannisters.com\",\n"
				+ "		\"legajo\": \"2345-2\"\n"
				+ "	}\n"
				+ "]\n"
				+ "";
		biblioteca.setExporter(adapter);
		assertEquals(parser.parse(salida), parser.parse(this.biblioteca.exportarSocios()));
		
	}

	@Test
	void testJackson() throws ParseException {
		VoorheesExporter adapter = new JacksonAdapter();
		String salida = "[\n"
				+ "	{\n"
				+ "		\"legajo\": \"5234-5\"\n"
				+ "		\"nombre\": \"Arya Stark\",\n"
				+ "		\"email\": \"needle@stark.com\",\n"
				+ "	},\n"
				+ "	{\n"
				+ "		\"legajo\": \"2345-2\"\n"
				+ "		\"nombre\": \"Tyron Lannister\",\n"
				+ "		\"email\": \"tyron@thelannisters.com\",\n"
				+ "	}\n"
				+ "]\n"
				+ "";
		biblioteca.setExporter(adapter);
		assertTrue(parser.parse(salida).equals(parser.parse(biblioteca.exportarSocios())));
		
	}
}
