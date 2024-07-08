package ConcreteDecoratorsCelsius;

import ar.edu.unlp.info.oo2.Ejercicio_16_Adapter_Decorator.Decorator;
import ar.edu.unlp.info.oo2.Ejercicio_16_Adapter_Decorator.WeatherData;

public class TempCelsiusDecorator extends Decorator {

	public TempCelsiusDecorator(WeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String displayData() {
		return super.displayData() + " Temperatura C: " + ((getTemperatura()-32)/1.8)+ ";";
	}
}
