package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	private List<Llamada> llamadas;
	private String nombre;
	private String numeroTelefono;

	public Cliente(String nombre, String numeroTelefono) {
		this.llamadas = new ArrayList<Llamada>();
		this.nombre = nombre;
		this.numeroTelefono = numeroTelefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public Llamada registrarLlamadaNacional(Cliente destino, int duracion) {
		LlamadaNacional llamada = new LlamadaNacional(getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
		agregarLlamada(llamada);
		return llamada;
	}

	public Llamada registrarLlamadaInternacional(Cliente destino, int duracion) {
		Llamada llamada = new LlamadaInternacional(getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
		agregarLlamada(llamada);
		return llamada;
	}

	private void agregarLlamada(Llamada llamada) {
		this.llamadas.add(llamada);
	}

	protected abstract double getDescuento();

	protected abstract void setDescuento(double descuento);

	public double aplicarDescuento(double monto) {
		return monto * this.getDescuento();
	}

	public double calcularMontoTotalLlamadas() {
		return this.llamadas.stream().mapToDouble(
				llamada -> llamada.calcularPrecioLlamada() - this.aplicarDescuento(llamada.calcularPrecioLlamada()))
				.sum();
	}
}
