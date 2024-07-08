package ConcreteDecoratorsCelsius;

import java.util.Optional;

import ar.edu.unlp.info.oo2.Ejercicio_16_Adapter_Decorator.Decorator;
import ar.edu.unlp.info.oo2.Ejercicio_16_Adapter_Decorator.WeatherData;

public class MinCelsiusDecorator extends Decorator {

	public MinCelsiusDecorator(WeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String displayData() {
		Optional<Double> minTempOptional = getTemperaturas().stream().min(Double::compare);
        double minTempCelsius = minTempOptional.isPresent() ? (minTempOptional.get() - 32) / 1.8 : Double.NaN;

        return super.displayData() +" Minimo C: " + minTempCelsius + ";";
	}
}
