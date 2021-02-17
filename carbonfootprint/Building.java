package oopp;

public class Building implements CarbonFootprint {
	
	private double elUsage, gasUsage; //monthly
	
	public Building(double elUsage, double gasUsage) {
		this.elUsage=elUsage;
		this.gasUsage=gasUsage;
	}
	public void setelUsage(double elUsage) {
		this.elUsage=elUsage;
	}
	public double getelUsage() {
		return elUsage;
	}
	public void selgasUsage(double gasUsage) {
		this.gasUsage=gasUsage;
	}
	public double getgasUsage() {
		return gasUsage;
	}
	
	@Override
	public String toString() {
		return String.format("Building\nMonthly electricity usage: %.2f\t Monthly gas usage: %.2f", getelUsage(), getgasUsage());
	}

	@Override
	public double getCarbonFootprint() {
		return (((elUsage*0.5434)+(gasUsage*0.00018385)));
	}

}
