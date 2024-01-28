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

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestTriangle {
	public static void main(String[] args) {

		// call the method to create a triangle		
		// and display triangle's information
		System.out.println(createTriangle().toString());
	}
	
	// method to create the triangle

	public static Triangle createTriangle() {
		
		Scanner kbd = new Scanner(System.in);
		
		double side1, side2, side3;
		boolean filled, go;
		
		// prompts the user to enter three sides of the triangle, a
		// color, and a Boolean value to indicate whether the triangle
		// is filled.
		System.out.println("Enter three sides of the triangle: ");

		side1 = defineSide("Side 1: ", kbd);
		side2 = defineSide("Side 2: ", kbd);
		side3 = defineSide("Side 3: ", kbd);

		System.out.print("Enter filled color: ");
		String color = kbd.next();

		do {
			System.out.print("Is the triangle filled? Enter \"true\" for yes, \"false\" for no: ");
			while(!kbd.hasNextBoolean()) {
				System.out.println("Enter \"true\" or \"false\"");
				kbd.next();
			}
			filled = kbd.nextBoolean();
			go = false;
		} while(go);

		// create a Triangle object with the given input
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(filled);

		kbd.close();

		return triangle;
	}

	private static double defineSide(String message, Scanner scan) {
		boolean sideIsValid = false;
		double side = -1;

		while(!sideIsValid) {
			System.out.println(message);
			String input = scan.nextLine();
			try {
				side = Double.parseDouble(input);
				if (side <= 0) {
					System.err.printf("Side must be greater than 0.\n");
				} else {
					sideIsValid = true;
				}
			} catch (Exception e) {
				System.err.println("Invalid input. Please type in a positive number");
			}
		}
		return side;
	}
}


