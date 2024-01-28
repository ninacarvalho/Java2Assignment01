/**********************************************
Assignment 1
Course:Advanced Java Programming - Semester 2
Last Name: Zhu
First Name: Kexin
ID: n01621302
Section: 0NA
This assignment represents my own work in accordance with Humber Academic Policy.
Kexin Zhu
Date:<submission date>
**********************************************/

package task1;

public abstract class GeometricObject {
	
	// declare private fields color and filled
	private String color;
	private boolean filled;
		
	// no-arg constructor
	GeometricObject(){
		this.color = "white";
	}
		
	// protected overloaded constructor GeometricObject(String color, boolean filled)
	protected GeometricObject(String color, boolean filled) {
		this.setColor(color);
		this.setFilled(filled);
	}
		
	//  accessor and mutator methods for color and filled.
	public void setColor(String color) {
		this.color = color;
	}
		
	public String getColor() {
		return color;
	}
		
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
		
	public boolean getFilled() {
		return filled;
	}
		
	// abstract method getArea()
	public abstract double getArea();
		
	// abstract method getPerimeter()
	public abstract double getPerimeter();	
}
