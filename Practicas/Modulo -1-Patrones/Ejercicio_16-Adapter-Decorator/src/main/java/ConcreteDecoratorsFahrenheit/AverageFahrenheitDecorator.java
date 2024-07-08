package ConcreteDecoratorsFahrenheit;

import java.util.OptionalDouble;

import ar.edu.unlp.info.oo2.Ejercicio_16_Adapter_Decorator.Decorator;
import ar.edu.unlp.info.oo2.Ejercicio_16_Adapter_Decorator.WeatherData;

public class AverageFahrenheitDecorator extends Decorator {

	public AverageFahrenheitDecorator(WeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String displayData() {
	    OptionalDouble averageTempOptional = getTemperaturas().stream().mapToDouble(Double::doubleValue).average();
        double averageTempF = averageTempOptional.isPresent() ? averageTempOptional.getAsDouble() : Double.NaN;

        return super.displayData() + " Promedio F: " + averageTempF + ";";
	}

}
