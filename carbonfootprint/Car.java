package oopp;

public class Car implements CarbonFootprint {
	
	private double fuelAmt;
	private String fuelType;
	
	public Car(double fuelAmt, String fuelType) {
		this.fuelAmt=fuelAmt;
		this.fuelType=fuelType;
	}
	public void setfuelAmt(double fuelAmt) {
		this.fuelAmt=fuelAmt;
	}
	public void setfuelType(String fuelType) {
		this.fuelType=fuelType;
	}
	public double getfuelAmt() {
		return fuelAmt;
	}
	public String getfuelType() {
		return fuelType;
	}
	
	@Override
	public String toString() {
		return String.format("Car\nFuel type: %s\t Amount of fuel used: %.2f litres", getfuelType(), getfuelAmt());
	}

	@Override
	public double getCarbonFootprint() {
		if(getfuelType() == "Diesel") {
			return (getfuelAmt()*2.62);	
		}
		else if(getfuelType() == "Petrol") {
			return(getfuelAmt()*2.39);
		}
		else {
			return 101010101;
		}
	}

}
