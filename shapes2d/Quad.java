package proj1;

public class Quad {
	private Point cor1, cor2, cor3, cor4;
	
	public Quad (int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		cor1 = new Point(x1,y1);
		cor2 = new Point(x2,y2);
		cor3 = new Point(x3,y3);
		cor4 = new Point(x4,y4);
	}
	
	public Point getCor1() {
		return cor1;
	}
	
	public Point getCor2() {
		return cor2;
	}
	
	public Point getCor3() {
		return cor3;
	}
	
	public Point getCor4() {
		return cor4;
	}
	
	public String toString() {
		return String.format(" Coordinates for the quadliteral are: (%d,%d) (%d,%d) (%d,%d) (%d,%d)\n", getCor1().getX(), getCor1().getY(), 
				getCor2().getX(), getCor2().getY(), getCor3().getX(), getCor3().getY(), getCor4().getX(), getCor4().getY());
	}
}
