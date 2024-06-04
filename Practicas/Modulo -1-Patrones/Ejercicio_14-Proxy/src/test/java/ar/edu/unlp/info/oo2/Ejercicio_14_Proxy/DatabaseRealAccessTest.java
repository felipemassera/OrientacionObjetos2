package ar.edu.unlp.info.oo2.Ejercicio_14_Proxy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseRealAccessTest {
    private DatabaseAccess database;
    private DatabaseAccessProxy databaseProxy;

    @BeforeEach
    void setUp() throws Exception {
        this.database = new DatabaseRealAccess();
        this.databaseProxy =  new DatabaseAccessProxy("eureka", database);
    }

    @Test
    void accessDatabaseProxy() {
    	RuntimeException error = assertThrows(RuntimeException.class, ()-> { databaseProxy.getSearchResults("algo");});
    	assertEquals("Please log in first.", error.getMessage());
      	assertTrue(databaseProxy.login("eureka"));
      	assertFalse(databaseProxy.logout());
    }
    
    @Test
    void testGetSearchResults() {
    	databaseProxy.login("eureka");
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.databaseProxy.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.databaseProxy.getSearchResults("select * from comics where id=10"));
    }

    @Test
    void testInsertNewRow() {
    	databaseProxy.login("eureka");
        assertEquals(3, this.databaseProxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.databaseProxy.getSearchResults("select * from comics where id=3"));
    }
}