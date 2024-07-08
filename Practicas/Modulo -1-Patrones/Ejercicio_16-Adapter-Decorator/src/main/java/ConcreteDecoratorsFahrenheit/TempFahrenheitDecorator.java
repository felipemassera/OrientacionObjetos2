package ConcreteDecoratorsFahrenheit;

import ar.edu.unlp.info.oo2.Ejercicio_16_Adapter_Decorator.Decorator;
import ar.edu.unlp.info.oo2.Ejercicio_16_Adapter_Decorator.WeatherData;

public class TempFahrenheitDecorator extends Decorator {

	public TempFahrenheitDecorator(WeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String displayData() {
		return super.displayData() + " Temperatura F: " + getTemperatura()+ ";";
	}
}
