package ar.edu.unlp.info.oo2.Ejercicio_16_Adapter_Decorator;

import java.util.List;

public abstract class Decorator implements  WeatherData{
	 
	private WeatherData component;
		
	public Decorator(WeatherData component) {
		this.component = component;
	}

	public double getTemperatura() {
		return this.component.getTemperatura();
	}
	
	public double getPresion() {
		return this.component.getPresion();
	}

	public double getRadiacionSolar() {
		return this.component.getRadiacionSolar();
	}
	
	public List<Double> getTemperaturas(){
		return this.component.getTemperaturas();
	}
	
	public String displayData() {
		return this.component.displayData();
	}
	
}
