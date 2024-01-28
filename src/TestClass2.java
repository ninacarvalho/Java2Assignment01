public class TestClass2 {
    public static void main(String[] args) throws TriangleException {
        Triangle2 validTriangle = new Triangle2(2,3,4);
        System.out.println(validTriangle.toString());
        Triangle2 invalidTriangle = new Triangle2(1,44,1);
    }
}
