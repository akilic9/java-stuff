package proj2;

public abstract class ThreeDim extends Shape {
	
	public ThreeDim(String shapeName) {
		super(shapeName);
	}
	
	public abstract double getArea();
	public abstract double getVolume();
	
}
