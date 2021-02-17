package proj2;

public class Tri extends TwoDim {
	private double height, base;
	
	public Tri(double height, double base, String shapeName) {
		super(shapeName);
		this.base=base;
		this.height=height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getBase() {
		return base;
	}

	@Override
	public double getArea() {
		return getHeight()*getBase()/2;
	}
	
	public String toString() {
		return String.format("Shape:%s\tBase:%.2f\tHeight:%.2f", super.toString(), getBase(), getHeight());
	}

}
