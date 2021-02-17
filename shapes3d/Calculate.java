package proj2;

public class Calculate {

	public static void main(String[] args) {
		Shape shapes[] = new Shape[6];
		shapes[0] = new Circ(7.0, "Circle");
		shapes[1] = new Sq(10.0, "Square");
		shapes[2] = new Tri(6.5, 5.0, "Triangle");
		shapes[3] = new Sphere(5.0, "Sphere");
		shapes[4] = new Cube(5.0, "Cube");
		shapes[5] = new Tetra(8.0, "Tetrahedron");
		
		for (Shape currentShape : shapes) {
			if(currentShape instanceof TwoDim) {
				TwoDim twoDim = (TwoDim) currentShape;
				System.out.printf("%s\tArea:%.2f\n", twoDim.toString(), twoDim.getArea());
			}
			
			else if (currentShape instanceof ThreeDim) {
				ThreeDim threeDim = (ThreeDim) currentShape;
				System.out.printf("%s\tArea:%.2f\tVolume:%.2f\n", threeDim.toString(), threeDim.getArea(), threeDim.getVolume());
			}
		}

	}

}
