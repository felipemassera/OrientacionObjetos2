package ar.edu.unlp.info.oo2.Ejercicio_14_Proxy;

import java.util.Collection;
import java.util.List;

public class DatabaseAccessProxy implements DatabaseAccess{
	private boolean isLogged;
	private String password;
	private DatabaseAccess realAccess;
	
	
	public DatabaseAccessProxy(String password, DatabaseAccess database) {
		this.isLogged = false;
		this.password = password;
		this.realAccess = database;
	}

	@Override
	public Collection<String> getSearchResults(String queryString) {
		if(this.isLogged) {
			return this.getRealAccess().getSearchResults(queryString);
		} else {
			throw new RuntimeException("Please log in first.");
		}
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if(this.isLogged) {
			return this.getRealAccess().insertNewRow(rowData);
		} else {
			throw new RuntimeException("Please log in first.");
		}
	}

	public boolean login(String password) {
		if (!isLogged()) {				
			if (password.equals(getPassword())){
				this.isLogged = true;
			}else {
				throw new RuntimeException("Wrong password. try again");
			}
		}else {
			throw new RuntimeException("you're already loggin");
		}
		return isLogged();
	}
	
	public boolean logout() {
		if (isLogged()) {
			this.isLogged= false;
		}else {
			throw new RuntimeException("You haven't logged"); 
		}
		return isLogged();
	}
	
	
	public DatabaseAccess getRealAccess() {
		return realAccess;
	}

	public String getPassword() {
		return password;
	}

	public boolean isLogged() {
		return isLogged;
	}
	
	
}
