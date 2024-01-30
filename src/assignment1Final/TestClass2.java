package assignment1Final;

public class TestClass2 {
//	public static void main(String[] args) throws TriangleException {
//        Triangle2 validTriangle = new Triangle2(2,3,4);
//        System.out.println(validTriangle.toString());
//        Triangle2 invalidTriangle = new Triangle2(1,44,1);
//  }	
	
	public static void main(String[] args) {		

		try {
				
			// test with legal sides
			Triangle2 triangle1 = new Triangle2(3, 3, 3);
			System.out.println(triangle1.toString());
				
			// test with illegal sides
			Triangle2 triangle2 = new Triangle2(1, 2, 44);
			System.out.println(triangle2.toString());
				
		}
		catch(TriangleException ex){
			System.err.print(ex.getMessage());
		}

		
	}	
}
