package assignment1Final;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestClass1 {

	public static void main(String[] args) {
		
		// call the method to create a triangle		
		// and display triangle's information
		System.out.println(createTriangle().toString());
	}
	
	// method to create the triangle
	public static Triangle createTriangle() {
			
		Scanner kbd = new Scanner(System.in);
			
		double side1, side2, side3;
		boolean filled;
		
		// prompts the user to enter information of triangle
		System.out.println("Enter three sides of the triangle: ");
		
		side1 = defineSide("Side 1: ", kbd);
		side2 = defineSide("Side 2: ", kbd);
		side3 = defineSide("Side 3: ", kbd);
			
		System.out.print("Enter filled color: ");
		String color = kbd.next();
			
		System.out.print("Is the triangle filled? Enter \"true\" for yes, \"false\" for no: ");
		while(!kbd.hasNextBoolean()) {
			System.err.println("Enter \"true\" or \"false\"");
			kbd.next();
		}
		filled = kbd.nextBoolean();

		// create a Triangle object with the given input
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(filled);
		
		kbd.close();
		
		return triangle;
	}
	
	// method to validate the input value of sides is positive double
	private static double defineSide(String message, Scanner scan) {
		boolean sideIsValid = true;
		double side = -1;

		do {
			System.out.println(message);
			try {	
				side = scan.nextDouble();
				if (side <= 0) {
					System.err.println("Side must be greater than 0.");
				} else {
					sideIsValid = false;
				}
			} catch (InputMismatchException e) {
				System.err.println("Invalid input. Please type in a positive number");
				scan.nextLine();
			}
		} while(sideIsValid);
		return side;
	}
}
