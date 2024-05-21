package ar.edu.unlp.info.oo2.Ejercicio_8_State;

import java.time.Duration;

public class Finished extends State{
	
	public Finished(ToDoItem toDoItem) {
		super(toDoItem);
		toDoItem.setEndDate();
	}
	
	@Override
	public void addComment(String comment) {
		//nada
	}
	
	@Override
	public Duration workedTime() {
		return Duration.between(toDoItem.getStartDate(), toDoItem.getEndDate());
	}
	
}
