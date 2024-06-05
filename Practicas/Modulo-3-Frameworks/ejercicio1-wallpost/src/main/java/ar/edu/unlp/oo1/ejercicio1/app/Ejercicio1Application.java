package ar.edu.unlp.oo1.ejercicio1.app;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import javax.swing.SwingUtilities;

import ar.edu.unlp.oo1.ejercicio1.ui.WallPostUI;

public class Ejercicio1Application {

	
	
	public static void main(String[] args) throws SecurityException, IOException {
		Logger.getLogger("WallPostImp").addHandler(new FileHandler("/home/felipao/Escritorio/models.log"));
		Logger.getLogger("WallPostUI").addHandler(new ConsoleHandler());

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new WallPostUI();
			}
		});
	}

}
