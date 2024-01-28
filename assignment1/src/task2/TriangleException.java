package task2;

public class TriangleException extends Exception {
	
	// no-arg constructor, change the error message
	public TriangleException() {		
		super("Invaild sides: the sum of any two sides must be greater than the other side.");
	}
}

