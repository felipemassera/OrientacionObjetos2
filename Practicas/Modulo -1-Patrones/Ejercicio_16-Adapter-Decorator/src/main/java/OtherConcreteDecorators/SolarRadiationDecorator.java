package OtherConcreteDecorators;

import ar.edu.unlp.info.oo2.Ejercicio_16_Adapter_Decorator.Decorator;
import ar.edu.unlp.info.oo2.Ejercicio_16_Adapter_Decorator.WeatherData;

public class SolarRadiationDecorator extends Decorator {

	public SolarRadiationDecorator(WeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String displayData() {
		return super.displayData() + " Radiación solar: " + getRadiacionSolar()+ ";";
	}
}
