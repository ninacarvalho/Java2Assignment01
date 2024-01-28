public class Triangle2 extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;

    public Triangle2() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    public Triangle2(double side1, double side2, double side3) throws TriangleException {
        if (isSumOfSidesValid(side1, side2, side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new TriangleException("The sum of any two sides must greater than the other side");
        }
    }

    private boolean isSumOfSidesValid(double side1, double side2, double side3) {
        boolean side12Gtside3 = (side1 + side2) > side3;
        boolean side13Gtside2 = (side1 + side3) > side2;
        boolean side32Gtside1 = (side3 + side2) > side1;
        return side12Gtside3 && side13Gtside2 && side32Gtside1;
    }

    @Override
    public double getArea() {
        double s = (getPerimeter())/2;
        return Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    @Override
    public String toString() {
        return "Triangle" +
                "\nside1: " + side1 +
                "\nside2: " + side2 +
                "\nside3: " + side3 +
                "\ncolor: " + getColor() +
                "\nis filled: " + isFilled() +
                "\narea: " + String.format("%.2f",getArea()) +
                "\nperimeter: " + String.format("%.2f",getPerimeter());
    }
}
