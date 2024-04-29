package flyweight;

public class Point {
    private final int x;
    private final int y;
    private final Color color;

    public Point(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void draw() {
        System.out.println("Drawing point at (" + x + ", " + y + ") with color " + color.getName());
    }
}

