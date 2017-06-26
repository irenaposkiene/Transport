package transport;

import com.eisgroup.javaexam.factory.Color;
import com.eisgroup.javaexam.factory.Transportation;

public class MyBoat extends Transportation {
	
	private double length;

	public MyBoat(String make, String model, double price, Color color, double l) {
		super(make, model, price, color);
		this.length=l;
		// TODO Auto-generated constructor stub
	}
	public double getLength() {
		return this.length;
	}

	@Override
	public double getFinalPrice() {
		double vat=0.21;
		
		double total = (super.getPrice()*vat)+super.getPrice();
		return total;
	}

}
