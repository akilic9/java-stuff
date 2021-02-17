package oopp;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<CarbonFootprint> list = new ArrayList<CarbonFootprint>();
		
		list.add(new Car(89.74, "Diesel"));
		list.add(new Bike(3));
		list.add(new Building(394, 400));
		
		for (CarbonFootprint temp : list) {
			System.out.printf("%s\nCarbon Emission: %.2f\n\n", temp.toString(), temp.getCarbonFootprint());
		}

	}

}
