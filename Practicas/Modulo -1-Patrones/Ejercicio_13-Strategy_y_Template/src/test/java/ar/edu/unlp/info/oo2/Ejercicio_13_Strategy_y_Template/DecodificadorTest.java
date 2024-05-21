/**
 * 
 */
package ar.edu.unlp.info.oo2.Ejercicio_13_Strategy_y_Template;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecodificadorTest {
	
	private Decodificador deco;
	Pelicula thor ;
	Pelicula capitan ;
	Pelicula ironman ;
	Pelicula dunkirk ;
	Pelicula rocky ;
	Pelicula rambo;
	
	@BeforeEach
	void setUp() throws Exception {
		deco = new Decodificador();
		thor =new Pelicula("Thor", 2007, 7.9);
		capitan =new Pelicula("Capitan America", 2016,7.8);
		ironman =new Pelicula("IronMan", 2010, 7.9);
		dunkirk =new Pelicula("Dunkirk", 2017, 7.9);
		rocky =new Pelicula("Rocky", 1976, 8.1);
		rambo =new Pelicula("Rambo", 1979, 7.8);
		thor.addSimilares(capitan);
		thor.addSimilares(ironman);
		capitan.addSimilares(ironman);
		rocky.addSimilares(rambo);
		
		deco.nuevaPeliculaEnGrilla(thor);
		deco.nuevaPeliculaEnGrilla(capitan);
		deco.nuevaPeliculaEnGrilla(ironman);
		deco.nuevaPeliculaEnGrilla(dunkirk);
		deco.nuevaPeliculaEnGrilla(rocky);
		deco.nuevaPeliculaEnGrilla(rambo);
		
		deco.reproducirPelicula(thor);
		deco.reproducirPelicula(rambo);
	}
    @Test
    public void testNovedad() {
        List<Pelicula> recomendaciones = deco.generarSugerencia();
        assertTrue(recomendaciones.contains(dunkirk));
        assertTrue(recomendaciones.contains(capitan));
        assertTrue(recomendaciones.contains(ironman));
    }
    @Test
    public void testSimilares() {
    	deco.cambiarDeEstrategia(new SugerenciaSimilaridad());
    	List<Pelicula> recomendaciones = deco.generarSugerencia();
    	assertTrue(recomendaciones.contains(capitan));
    	assertTrue(recomendaciones.contains(ironman));
    	assertTrue(recomendaciones.contains(rocky));
    }
    @Test
    public void testPuntaje() {
    	deco.cambiarDeEstrategia(new SugerenciaPuntaje());
    	List<Pelicula> recomendaciones = deco.generarSugerencia();
    	assertTrue(recomendaciones.contains(capitan));
    	assertTrue(recomendaciones.contains(ironman));
    	assertTrue(recomendaciones.contains(dunkirk));
    }
}
