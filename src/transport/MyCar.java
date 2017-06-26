package transport;

import com.eisgroup.javaexam.factory.Color;
import com.eisgroup.javaexam.factory.Transportation;

public class MyCar extends Transportation {

	
	
	public MyCar(String make, String model, double price, Color color) {
		super(make, model, price, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getFinalPrice() {
		// TODO Auto-generated method stub
		double vat=0.21;
		
		double total = (super.getPrice()*vat)+super.getPrice();
		return total;
	}

}
