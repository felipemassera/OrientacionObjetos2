package ar.edu.unlp.info.oo2.Ejercicio_16_Adapter_Decorator;

import java.util.List;

public class HomeWeatherStationAdapter implements WeatherData {

	private HomeWeatherStation adaptee;

	
	public HomeWeatherStationAdapter(HomeWeatherStation adaptee) {
		this.adaptee = adaptee;
	}

	// retorna la temperatura en grados Fahrenheit.
	@Override
	public double getTemperatura() {
		return this.adaptee.getTemperatura();
	}

	// retorna la presión atmosférica en hPa
	@Override
	public double getPresion() {
		return this.adaptee.getPresion();
	}

	// retorna la radiación solar
	@Override
	public double getRadiacionSolar() {
		return this.adaptee.getRadiacionSolar();
	}

	// retorna una lista con todas las temperaturas sensadas hasta el momento, en
	// grados Fahrenheit
	@Override
	public List<Double> getTemperaturas() {
		return this.adaptee.getTemperaturas();
	}

	// metodo en blanco para poder realizar el 
	@Override
	public String displayData() {
		return "";
	}

}
