package flyweight;

public class Main {
    public static void main(String[] args) {
        ColorFactory colorFactory = new ColorFactory();

        Color red = colorFactory.getColor("Red");
        Color blue = colorFactory.getColor("Blue");

        Point point1 = new Point(1, 2, red);
        Point point2 = new Point(3, 4, blue);
        Point point3 = new Point(5, 6, red);

        point1.draw();
        point2.draw();
        point3.draw();
    }
}
