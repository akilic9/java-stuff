package proj2;

public class Sq extends TwoDim {
	private double length;
	
	public Sq(double length, String shapeName) {
		super(shapeName);
		this.length=length;
	}
	
	public double getLength() {
		return length;
	}
	

	@Override
	public double getArea() {
		return Math.pow(getLength(), 2);
	}
	
	@Override
	public String toString() {
		return String.format("Shape:%s\tLength:%.2f", super.toString(), getLength());
	}

}
