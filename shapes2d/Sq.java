package proj1;

public class Sq extends Rect {
	
	public Sq(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
	}
	
	public String toString() {
		return String.format("The area for square is: %f", getArea());
	}

}
