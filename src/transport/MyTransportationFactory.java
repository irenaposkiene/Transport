package transport;

import java.util.ArrayList;
import java.util.List;

import com.eisgroup.javaexam.factory.Color;
import com.eisgroup.javaexam.factory.Transportation;
import com.eisgroup.javaexam.factory.TransportationFactory;

public class MyTransportationFactory implements TransportationFactory {

	private List <Transportation> transport = new ArrayList ();
	private MyCar car;
	private MyBoat boat;
	
	@Override
	public Transportation produceBoat(String make, String model, double price, Color color, double length) {
		// TODO Auto-generated method stub
		boat = new MyBoat (make, model, price, color, length);
		transport.add(boat);
		return boat;
	}

	@Override
	public Transportation produceCar(String make, String model, double price, Color color) {
		// TODO Auto-generated method stub
		car = new MyCar (make, model, price, color);
		transport.add(car);
		return car;
	}

}
