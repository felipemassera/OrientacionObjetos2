package ConcreteDecoratorsFahrenheit;

import ar.edu.unlp.info.oo2.Ejercicio_16_Adapter_Decorator.Decorator;
import ar.edu.unlp.info.oo2.Ejercicio_16_Adapter_Decorator.WeatherData;

public class MaxFahrenheitDecorator extends Decorator {

	public MaxFahrenheitDecorator(WeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String displayData() {
		
		return super.displayData() + " Maximo F: " + getTemperaturas().stream().max(Double::compare) + ";";
	}

}
