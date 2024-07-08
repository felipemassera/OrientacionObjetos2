package ConcreteDecoratorsCelsius;

import java.util.Optional;

import ar.edu.unlp.info.oo2.Ejercicio_16_Adapter_Decorator.Decorator;
import ar.edu.unlp.info.oo2.Ejercicio_16_Adapter_Decorator.WeatherData;

public class MaxCelsiusDecorator extends Decorator {

	public MaxCelsiusDecorator(WeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String displayData() {
		Optional<Double> maxTempOptional = getTemperaturas().stream().max(Double::compare);
        double maxTempCelsius = maxTempOptional.isPresent() ? (maxTempOptional.get() - 32) / 1.8 : Double.NaN;
        return super.displayData() + " Maximo C: " + maxTempCelsius + ";";
	}
}
