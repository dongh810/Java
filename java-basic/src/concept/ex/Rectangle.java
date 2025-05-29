package concept.ex;

public class Rectangle {
    int width = 5;
    int height = 8;

    int calculate() {
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return this.width == this.height;
    }

}
