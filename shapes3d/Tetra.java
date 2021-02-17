package proj2;

public class Tetra extends ThreeDim {
	private double length;
	
	public Tetra(double length, String shapeName) {
		super(shapeName);
		this.length=length;
	}
	
	public double getLength() {
		return length;
	}


	@Override
	public double getArea() {
		return Math.sqrt(3)*Math.pow(getLength(), 2);
	}

	@Override
	public double getVolume() {
		return Math.pow(getLength(), 3)/(6*Math.sqrt(2));
	}
	
	@Override
	public String toString() {
		return String.format("Shape:%s\tLenght:%.2f", super.toString(), getLength());
	}

}
