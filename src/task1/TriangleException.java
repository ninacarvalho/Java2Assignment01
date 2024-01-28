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

public class TriangleException extends Exception {
	
	// no-arg constructor, change the error message
	public TriangleException() {		
		super("Invaild sides: the sum of any two sides must be greater than the other side.");
	}
}
