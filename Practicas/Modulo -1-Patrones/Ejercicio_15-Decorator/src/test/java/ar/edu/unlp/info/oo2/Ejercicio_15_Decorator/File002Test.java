package ar.edu.unlp.info.oo2.Ejercicio_15_Decorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class File002Test {

    private File002 file;
    private File002 name;
    private File002 extension;
    private File002 creationDate;
    private File002 permissions;
    private File002 size;
    
    @BeforeEach
    void setUp() throws Exception {
        this.file = new Archivo("CaraLuna", ".mp4", 3, "-wx-r-x-w-", LocalDate.of(2024, 4, 29), 
                LocalDate.of(2024, 4, 29));
    }

    /**
	 * En este test debo imprimir los datos en el orden:  nombre - extensión
	 */
    @Test
    void testPrettyPrintOpcion1() {
        this.name = new DecoradorNombre(this.file);
        this.extension = new DecoradorExtension(this.name);
        String result = this.extension.prettyPrint();
        String expected = "Datos del Archivo:\n Nombre- CaraLuna\n Extension- .mp4\n";
        assertEquals(expected, result);
    }


	/**
	 * En este test debo imprimir los datos en el orden:  nombre - extensión - fecha de creación
	 */
	@Test
	void testPrettyPrintOpcion2() {
		this.name = new DecoradorNombre(this.file);
		this.extension = new DecoradorExtension(this.name);
		this.creationDate = new DecoradorFechaDeCreacion(this.extension);
		String result =creationDate.prettyPrint(); 
		String expected = "Datos del Archivo:\n Nombre- CaraLuna\n Extension- .mp4\n fecha de creacion- 2024-04-29\n";
		assertEquals(expected, result);
	}

	/**
	 * En este test debo imprimir los datos en el orden:  permisos - nombre - extensión - tamaño
	 */
	
	@Test
	void testPrettyPrintOption3() {
		this.permissions = new DecoradorPermisos(this.file);
		this.name = new DecoradorNombre(this.permissions);
		this.extension = new DecoradorExtension(this.name);
		this.size = new DecoradorTamanio(this.extension);
		String result =size.prettyPrint(); 
		String expected = "Datos del Archivo:\n Permisos- -wx-r-x-w-\n Nombre- CaraLuna\n Extension- .mp4\n Tamaño- 3MB\n";

		assertEquals(expected, result);
	}

}
