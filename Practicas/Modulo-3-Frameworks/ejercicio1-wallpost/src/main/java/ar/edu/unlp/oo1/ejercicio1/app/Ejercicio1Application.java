package ar.edu.unlp.oo1.ejercicio1.app;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import javax.swing.SwingUtilities;

import ar.edu.unlp.oo1.ejercicio1.ui.WallPostUI;

public class Ejercicio1Application {

	public static void main(String[] args) throws SecurityException, IOException {
		//FileHandler handler = new FileHandler("models.txt");
		//ConsoleHandler handler = new ConsoleHandler();
		EmailHandler handler = new EmailHandler();
		//handler.setFormatter(new JSONFormatter());
		Logger.getLogger("WallPostImp").addHandler(handler);
		FileHandler handler2 = new FileHandler("ui.txt");
		handler2.setFormatter(new JSONFormatter());
		Logger.getLogger("WallPostUI").addHandler(handler2);

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new WallPostUI();
			}
		});
	}

}
