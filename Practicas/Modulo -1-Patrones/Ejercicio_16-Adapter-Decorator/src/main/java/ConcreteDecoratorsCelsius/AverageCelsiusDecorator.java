package ConcreteDecoratorsCelsius;

import java.util.OptionalDouble;

import ar.edu.unlp.info.oo2.Ejercicio_16_Adapter_Decorator.Decorator;
import ar.edu.unlp.info.oo2.Ejercicio_16_Adapter_Decorator.WeatherData;

public class AverageCelsiusDecorator extends Decorator {

	public AverageCelsiusDecorator(WeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String displayData() {
		OptionalDouble averageTempOptional = getTemperaturas().stream().mapToDouble(Double::doubleValue).average();
        double averageTempCelsius = averageTempOptional.isPresent() ? (averageTempOptional.getAsDouble() - 32) / 1.8 : Double.NaN;

        return super.displayData() + " Promedio C: " + averageTempCelsius + ";";
	}
}
