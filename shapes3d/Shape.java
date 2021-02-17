package proj2;

public class Shape {
	private final String shapeName;
	
	public Shape(String shapeName) {
		this.shapeName=shapeName;
	}
	
	public String getShapeName() {
		return shapeName;
	}
	
	@Override
	public String toString() {
		return String.format("%s", getShapeName());
	}

}
