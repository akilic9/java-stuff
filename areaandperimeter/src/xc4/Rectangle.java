package xc4;

public class Rectangle {
	double width=1,heigth=1;
	Rectangle (){
	}
	
	Rectangle(double width, double heigth){
		this.width=width;
		this.heigth=heigth;
	}
	
	double getArea() {
		double area = width*heigth;
		return area;
	}
	
	double getPer() {
		double perimeter = (width+heigth)*2;
		return perimeter;
	}
	
	

}
