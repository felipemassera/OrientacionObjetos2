package ar.edu.unlp.info.oo2.Ejercicio_8_State;

import java.time.Duration;
import java.time.LocalDate;

public abstract class State {
	protected ToDoItem toDoItem;

	public State(ToDoItem toDoItem) {
		this.toDoItem = toDoItem;
	}

	public void start() {
		// nada
	}

	public void finish() {
		// nada
	}

	public void addComment(String comment) {
		toDoItem.agregarComentario(comment);
	}

	public void togglePause() {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en Pause o InProgress");
	}

	public Duration workedTime() {
		return Duration.between(toDoItem.getStartDate(), LocalDate.now());
	}

}
