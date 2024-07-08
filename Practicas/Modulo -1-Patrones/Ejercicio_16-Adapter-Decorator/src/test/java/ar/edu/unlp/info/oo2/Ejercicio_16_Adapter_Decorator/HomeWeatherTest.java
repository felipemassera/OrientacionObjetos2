package ar.edu.unlp.info.oo2.Ejercicio_16_Adapter_Decorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ConcreteDecoratorsCelsius.AverageCelsiusDecorator;
import ConcreteDecoratorsCelsius.MaxCelsiusDecorator;
import ConcreteDecoratorsCelsius.MinCelsiusDecorator;
import ConcreteDecoratorsCelsius.TempCelsiusDecorator;
import OtherConcreteDecorators.AtmosphericPressureDecorator;
import OtherConcreteDecorators.SolarRadiationDecorator;

public class HomeWeatherTest {

	//Ej 5: “Temperatura C: 30; Presión atmosf: 1008; Radiación solar: 200; Promedio: 30; Mínimo: 27 Máximo: 32;”
	private HomeWeatherStation adaptee;
	private HomeWeatherStationAdapter adapter;
	private TempCelsiusDecorator temp;
	private AtmosphericPressureDecorator presion;
	private SolarRadiationDecorator radiacionSolar;
	private AverageCelsiusDecorator promedio;
	private MinCelsiusDecorator min;
	private MaxCelsiusDecorator max;
	
	@BeforeEach
	public void setUp() {
		List<Double> listaTemperatura =  new ArrayList<>();
		listaTemperatura.add(87.8);
		listaTemperatura.add(86.0);
		listaTemperatura.add(80.6);
		listaTemperatura.add(89.6);
		adaptee =  new HomeWeatherStation(86.0, 1008,200,listaTemperatura);
		
		adapter = new HomeWeatherStationAdapter(adaptee);
		temp =  new TempCelsiusDecorator(adapter);
		presion = new AtmosphericPressureDecorator(temp);
		radiacionSolar = new SolarRadiationDecorator(presion);
		promedio = new AverageCelsiusDecorator(radiacionSolar);
		min = new MinCelsiusDecorator(promedio);
		max = new MaxCelsiusDecorator(min);
	}
	
	@Test
	public void testDisplayData() {
		
		assertEquals(" Temperatura C: 30.0; Presión Atmosf : 1008.0; Radiación solar: 200.0; Promedio C: 30.0; Minimo C: 26.999999999999996; Maximo C: 31.999999999999996;", max.displayData());
	}
	
	
}
