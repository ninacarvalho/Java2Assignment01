package assignment1Final;

public abstract class GeometricObject {
	
	// declare private fields color and filled
	private String color;
	private boolean filled;
			
	// no-arg constructor
	public GeometricObject(){
		this.color = "white";
	}
			
	// protected overloaded constructor
	protected GeometricObject(String color, boolean filled) {
		this.setColor(color);
		this.setFilled(filled);
	}
			
	// accessor and mutator methods for color and filled
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


