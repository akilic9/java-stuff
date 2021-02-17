package proj2;

public class Circ extends TwoDim {
	private double radius;
	
	public Circ(double radius, String shapeName) {
		super(shapeName);
		this.radius=radius;
	}
	
	public double getRadius() {
		return radius;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(getRadius(), 2);
	}
	
	@Override
	public String toString() {
		return String.format("Shape:%s\tRadius:%.2f", super.toString(), getRadius());
	}
	

}
