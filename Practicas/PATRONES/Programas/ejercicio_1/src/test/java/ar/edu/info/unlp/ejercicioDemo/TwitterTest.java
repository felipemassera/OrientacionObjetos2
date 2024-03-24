package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwitterTest {
	
	private Twitter twitter;
	
	@BeforeEach
	void setUp() throws Exception {
		twitter = new Twitter();
		User user1 = new User("Ivan");
		User user2 = new User("Fran");
		User user3 = new User("Ivan");
	}
	
    @Test
    public void testNewUser() {
        assertTrue(twitter.newUser("ivan"));
        assertTrue(twitter.newUser("paco"));
        assertFalse(twitter.newUser("ivan"));
    }
    @Test
    public void testDeleteUser() {
    	twitter.newUser("a1");
    	twitter.newUser("a2");
    	twitter.newUser("a3");
    	assertTrue(twitter.deleteUser("a2"));
    	assertFalse(twitter.deleteUser("a4"));
    }
    @Test
    public void testCreateTweet() {
    	twitter.newUser("a1");
    	twitter.newUser("a2");
    	twitter.newUser("a3");
    	assertNotNull(twitter.createTweet("soy un tweet","a2"));
    	assertNull(twitter.createTweet("soy un tweet","a4"));
    }
}
