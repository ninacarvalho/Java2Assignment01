package assignment1Final;

public class Triangle extends GeometricObject{
	
	// fields named side1, side2, and side3 with default
	// values 1.0 to denote three sides of the triangle
	private double side1, side2, side3;
			
	// no-arg constructor that creates a default triangle
	public Triangle(){
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
			
	// constructor that creates a triangle with the specified
	// side1, side2, and side3.
	public Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
			
	// accessor methods for all three data fields
	public double getSide1() {
		return side1;
	}
			
	public double getSide2() {
		return side2;
	}
			
	public double getSide3() {
		return side3;
	}
			
	// method named getArea() that returns the area of this triangle
	@Override
	public double getArea() {
		double s = (getPerimeter()) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
			
	// method named getPerimeter() that returns the perimeter
	// of this triangle
	@Override
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
			
	//  method named toString() that returns a string description for
	// the triangle
	@Override
	public String toString() {
			
		return "Triangle" +
				"\nSide1: " + String.format("%.2f", getSide1()) + 
				"\nSide2: " + String.format("%.2f", getSide2()) + 
				"\nSide3: " + String.format("%.2f", getSide3()) +
				"\nArea: " + String.format("%.2f", getArea()) +
				"\nPerimeter: " + String.format("%.2f", getPerimeter()) +
				"\nColor: " + getColor() +
				"\nIs filled: " + getFilled();			
	}			
}
