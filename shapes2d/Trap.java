package proj1;

public class Trap extends Quad {
	private double area;
	
	public Trap(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
	}
	
	public double getArea() {
		area = Math.abs(((getCor1().getX()*getCor2().getY()-getCor1().getY()*getCor2().getX())+
				(getCor2().getX()*getCor3().getY()-getCor2().getY()*getCor3().getX())+
				(getCor3().getX()*getCor4().getY()-getCor3().getY()*getCor4().getX())+
				(getCor4().getX()*getCor1().getY()-getCor4().getY()*getCor1().getX()))/2.0);
		return area;
	}
	
	public String toString() {
		return String.format("The area for trapezoid is: %f\n", getArea());
	}
	
}
