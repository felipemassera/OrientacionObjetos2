package ar.edu.unlp.info.oo2.Ejercicio_8_State;

public class InProgress extends State {

	public InProgress(ToDoItem toDoItem) {
		super(toDoItem);
	}

	@Override
	public void togglePause() {
		State nuevoEstado = new Paused(toDoItem);
		toDoItem.changeEstado(nuevoEstado);
	}

	@Override
	public void finish() {
		State nuevoEstado = new Finished(toDoItem);
		toDoItem.changeEstado(nuevoEstado);

	}

}
