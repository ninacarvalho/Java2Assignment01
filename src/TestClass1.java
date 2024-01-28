import java.util.Scanner;

public class TestClass1 {
    public static void main(String[] args) {

        Scanner scanNum = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);

        System.out.println("### Triangle Generator ####");

        System.out.println("set the size of side 1");
        double side1 = scanNum.nextDouble();

        System.out.println("set the size of side 2");
        double side2 = scanNum.nextDouble();

        System.out.println("set the size of side 3");
        double side3 = scanNum.nextDouble();

        Triangle triangle = new Triangle(side1, side2, side3);

        System.out.println("set the color of the triangle");
        triangle.setColor(scanStr.nextLine());

        System.out.println("set true or false to indicate if triangle is filled or not");
        triangle.setFilled(scanStr.nextBoolean());

        System.out.println(triangle);
    }
}