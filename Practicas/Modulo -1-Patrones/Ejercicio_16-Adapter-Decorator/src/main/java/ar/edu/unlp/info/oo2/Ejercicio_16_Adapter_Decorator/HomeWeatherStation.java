package ar.edu.unlp.info.oo2.Ejercicio_16_Adapter_Decorator;

import java.util.List;

public class HomeWeatherStation implements WeatherData {

	private double temperatura;
	private double presion;
	private double radiacionSolar;
	private List<Double> temperaturas;
	
	public HomeWeatherStation(double temperatura, double presion, double radiacionSolar, List<Double> temperaturas) {
		this.temperatura = temperatura;
		this.presion = presion;
		this.radiacionSolar = radiacionSolar;
		this.temperaturas = temperaturas;
	}

	// retorna la temperatura en grados Fahrenheit.
	@Override
	public double getTemperatura() {
		return this.temperatura;
	}
	
	//retorna la presión atmosférica en hPa
	@Override
	public double getPresion() {
		return this.presion;
	}
	
	//retorna la radiación solar
	@Override
	public double getRadiacionSolar() {
		return this.radiacionSolar;
	}
	
	//retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
	@Override
	public List<Double> getTemperaturas(){
		return this.temperaturas;
	}
	
	//retorna un reporte de todos los datos: temperatura, presión, y radiación solar.
	@Override
	public String displayData() {
		return "Temperatura F: " + this.getTemperatura() + "Presión atmosf: " + this.getPresion() + "Radiación solar: "
				+ this.getRadiacionSolar();
	}
	
}
