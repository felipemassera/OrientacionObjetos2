package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameSystemTest {
	private GameSystem playing;
	
	
	@BeforeEach
	void setUp() throws Exception {
		playing = new GameSystem();
	}
	
    @Test
    public void testGame() {
    	Stone stone = new Stone();
    	Spock spock = new Spock();
        assertEquals("Spock", playing.game(stone,spock));
    }
}
