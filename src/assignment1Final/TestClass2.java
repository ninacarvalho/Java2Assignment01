package assignment1Final;

public class TestClass2 {
	public static void main(String[] args) {
		try {
			// test with legal sides
			Triangle2 triangle1 = new Triangle2(3, 3, 3);
			System.out.println(triangle1.toString());
				
			// test with illegal sides
			Triangle2 triangle2 = new Triangle2(1, 2, 44);
			System.out.println(triangle2.toString());
		}
		catch(TriangleException ex) {
			System.err.print(ex.getMessage());
		}
	}	
}