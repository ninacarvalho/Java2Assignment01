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
		
		do {
			System.out.print("Side 1: ");
			while(!kbd.hasNextDouble()) {
				System.out.println("Sides have to be a positive number");
				kbd.next();
			}
			side1 = kbd.nextDouble();
		}while(side1 <= 0);
		
		do {
			System.out.print("Side 2: ");
			while(!kbd.hasNextDouble()) {
				System.out.println("Sides have to be a positive number");
				kbd.next();
			}
			side2 = kbd.nextDouble();
		}while(side2 <= 0);
		
		do {
			System.out.print("Side 3: ");
			while(!kbd.hasNextDouble()) {
				System.out.println("Sides have to be a positive number");
				kbd.next();
			}
			side3 = kbd.nextDouble();
		}while(side3 <= 0);
				
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
		}while(go);
				
		// create a Triangle object with the given input
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(filled);
		
		kbd.close();
		
		return triangle;
	}
	
}


