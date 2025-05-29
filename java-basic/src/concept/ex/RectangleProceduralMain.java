package concept.ex;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        int area = rectangle.calculate();
        System.out.println(area);
        int perimeter = rectangle.calculatePerimeter();
        System.out.println(perimeter);
        boolean square = rectangle.isSquare();
        System.out.println(square);
    }
}
