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

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create two Triangle class objects
		TriangleWithException triangle1;
		TriangleWithException triangle2;
		
		try {
				
			// test with legal sides
			triangle1 = new TriangleWithException(7, 8, 3);
			triangle1.setColor("red");
			triangle1.setFilled(true);
			System.out.println(triangle1.toString());
				
			// test with illegal sides
			triangle2 = new TriangleWithException(3, 6, 1);
			triangle2.setColor("yellow");
			triangle2.setFilled(true);
			System.out.println(triangle2.toString());
				
		}
		catch(TriangleException ex){
			System.out.print(ex.getMessage());
		}

		
	}	

}
