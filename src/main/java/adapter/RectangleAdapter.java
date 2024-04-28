package adapter;

public class RectangleAdapter implements Square {
    private final Rectangle rectangle;

    public RectangleAdapter(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public double getSide() {
        return (rectangle.getLength() + rectangle.getWidth()) / 2;
    }

    @Override
    public double getArea() {
        return rectangle.getArea();
    }
}
