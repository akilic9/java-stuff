package proj2;

public class Cube extends ThreeDim {
	private double length;
	
	public Cube(double length, String shapeName) {
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
	public double getVolume() {
		return Math.pow(getLength(), 3);
	}
	
	@Override
	public String toString() {
		return String.format("Shape:%s\tLenght:%.2f", super.toString(), getLength());
	}

}
