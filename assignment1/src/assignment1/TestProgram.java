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

package assignment1;

import java.util.Scanner;

public class TestProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("Enter three sides of the triangle: ");
		System.out.print("Side 1: ");
		double side1 = kbd.nextDouble();
		System.out.print("Side 2: ");
		double side2 = kbd.nextDouble();
		System.out.print("Side 3: ");
		double side3 = kbd.nextDouble();
		
		System.out.println("Enter filled color: ");
		String color = kbd.next();
		kbd.nextLine();
		
		System.out.println("Is the triangle filled? Enter \"true\" for yes, \"false\" for no.");
		boolean filled = kbd.nextBoolean();
		
		Triangle triangle = new Triangle(side1, side2, side3, color, filled);
		
		System.out.println(triangle.toString());
	}

}
