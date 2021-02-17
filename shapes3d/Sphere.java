package proj2;

public class Sphere extends ThreeDim {
	private double radius;
	
	public Sphere(double radius, String shapeName) {
		super(shapeName);
		this.radius=radius;
	}
	
	public double getRadius() {
		return radius;
	}

	@Override
	public double getArea() {
		return Math.PI*Math.pow(getRadius(), 2)*4;
	}

	@Override
	public double getVolume() {
		return Math.PI*Math.pow(getRadius(), 3)*4/3;
	}
	
	@Override
	public String toString() {
		return String.format("Shape:%s\tRadius:%.2f", super.toString(), getRadius());
	}

}
