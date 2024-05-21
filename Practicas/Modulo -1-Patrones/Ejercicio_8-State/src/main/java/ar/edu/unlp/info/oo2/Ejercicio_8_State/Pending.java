package ar.edu.unlp.info.oo2.Ejercicio_8_State;

import java.time.Duration;

public class Pending extends State {

	public Pending(ToDoItem toDoItem) {
		super(toDoItem);
	}

	@Override
	public void start() {
		State nuevoEstado = new InProgress(toDoItem);
		toDoItem.changeEstado(nuevoEstado);
		toDoItem.setStartDate();
	}

	
	@Override
	public Duration workedTime() {
		throw new RuntimeException("Aun no se presiono Start");
	}

}
