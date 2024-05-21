package ar.edu.unlp.info.oo2.Ejercicio_8_State;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {

	private String nombre;
	private List<String> comentarios;
	private State estado;
	private LocalDate startDate;
	private LocalDate endDate;

	/**
	 * Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
	 */
	public ToDoItem(String name) {
		this.nombre = name;
		this.comentarios = new ArrayList<>();
		this.estado = new Pending(this);
	}

	/**
	 * Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
	 * pending. Si se encuentra en otro estado, no hace nada.
	 */
	public void start() {
		this.estado.start();
	}

	/**
	 * Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
	 * estado es paused. Caso contrario (pending o finished) genera un error
	 * informando la causa específica del mismo.
	 */
	public void togglePause() {
		this.estado.togglePause();
	}

	/**
	 * Pasa el ToDoItem a finished, siempre y cuando su estado actual sea
	 * in-progress o paused. Si se encuentra en otro estado, no hace nada.
	 */
	public void finish() {
		this.estado.finish();
	}

	/**
	 * Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
	 * hasta que se finalizó. En caso de que no esté finalizado, el tiempo que haya
	 * transcurrido hasta el momento actual. Si el ToDoItem no se inició, genera un
	 * error informando la causa específica del mismo.
	 */
	public Duration workedTime() {
		return this.estado.workedTime();
	}

	/**
	 * Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
	 * contrario no hace nada."
	 */
	public void addComment(String comment) {
		this.estado.addComment(comment);
	}

	public void changeEstado(State estado) {
		this.estado = estado;
	}

	public State getEstado() {
		return estado;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate() {
		this.startDate = LocalDate.now();
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate() {
		this.endDate = LocalDate.now();
		;
	}

	/**
	 * agrega un comentario en la lista de comentarios.
	 */
	public void agregarComentario(String comentario) {
		this.comentarios.add(comentario);
	}

}
