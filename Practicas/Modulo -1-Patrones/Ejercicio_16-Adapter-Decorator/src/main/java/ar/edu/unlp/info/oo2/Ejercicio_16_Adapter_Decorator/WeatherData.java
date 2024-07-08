package ar.edu.unlp.info.oo2.Ejercicio_16_Adapter_Decorator;

import java.util.List;

public interface WeatherData {
	
	public double getTemperatura();
	public double getPresion();
	public double getRadiacionSolar();
	public List<Double> getTemperaturas();
	public String displayData();
}
