package oopp;

public class Bike implements CarbonFootprint {
	private double time;
	
	public Bike(double time) {
		this.time=time;
	}
	public void setTime(int time) {
		this.time=time;
	}
	public double getTime() {
		return time;
	}
	
	@Override
	public String toString() {
		return String.format("Bike\nTime spent biking: %.2f hours", getTime());
	}

	@Override
	public double getCarbonFootprint() {
		return (getTime()*600); //averagely 600 calories needed for an hour of biking.
	}

}
