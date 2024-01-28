public class TriangleException extends  Exception {

    public TriangleException() {
        super("The sum of any two sides must greater than the other side");
    }
    public TriangleException(String errorMessage) {
        super(errorMessage);
    }
}
