package ar.edu.unlp.info.oo2.Ejercicio_14_Proxy;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class DatabaseRealAccess implements DatabaseAccess {
    private Map<String, List<String>> data;
    private int currentId;

    public DatabaseRealAccess() {
        super();
        this.data = new HashMap<>();
        this.currentId = 3;
        this.data.put("select * from comics where id=1", Arrays.asList("Spiderman", "Marvel"));
        this.data.put("select * from comics where id=2", Arrays.asList("Batman", "DC comics"));
    }

    @Override
    public Collection<String> getSearchResults(String queryString) {
    	Logger.getLogger("Database").log(Level.WARNING, "Realiza una busqueda");
        return this.data.getOrDefault(queryString, Collections.emptyList());
    }

    @Override
    public int insertNewRow(List<String> rowData) {
        this.data.put("select * from comics where id=" + this.currentId, rowData);
        this.currentId = this.currentId + 1;
        Logger.getLogger("Database").log(Level.INFO, "Ingresa una nueva linea");
        return this.currentId - 1;
    }
}