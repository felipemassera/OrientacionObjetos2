package ar.edu.unlp.info.oo2.Ejercicio_8_State;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToDoItemTest {

	private ToDoItem toDoPending;
	private ToDoItem toDoInProgress;
	private ToDoItem toDoPaused;
	private ToDoItem toDoFinish;
	
	@BeforeEach
	void setUp() throws Exception {
		toDoPending = new ToDoItem("pendiente");
		toDoInProgress = new ToDoItem("enProgreso");
		toDoPaused = new ToDoItem("pause");
		toDoFinish = new ToDoItem("finish");
		
		toDoInProgress.start();
		toDoPaused.start();
		toDoPaused.togglePause();
		toDoFinish.start();
		toDoFinish.finish();
	}

	
	@Test
	void PendingStart() {
		toDoPending.start();
		assertTrue(toDoPending.getEstado() instanceof InProgress);
	}
		
	@Test
	void PendingWorkedTimeError() {
		RuntimeException excepcion = assertThrows(RuntimeException.class,  () -> {toDoPending.workedTime();});
		assertEquals(excepcion.getMessage(), "Aun no se presiono Start");
	}
	
	@Test
	void PendingTogglePausedError() {
		RuntimeException excepcion = assertThrows(RuntimeException.class,  () -> {toDoPending.togglePause();});
		assertEquals(excepcion.getMessage(), "El objeto ToDoItem no se encuentra en Pause o InProgress");
	}
	
	@Test
	void PendingNoChangeState() {
		toDoPending.finish();
		assertTrue(toDoPending.getEstado() instanceof Pending);
	}
	
	@Test
	void inProgressChangeEstate() {
		toDoInProgress.togglePause();
		assertTrue(toDoInProgress.getEstado() instanceof Paused);
		toDoInProgress.togglePause();
		toDoInProgress.finish();
		assertTrue(toDoInProgress.getEstado() instanceof Finished);
	}
	
}
