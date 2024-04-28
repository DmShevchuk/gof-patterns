package bridge;

public class Main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(10, 100, 100, new VectorDrawApi());
        Shape blueCircle = new Circle(20, 200, 200, new RasterDrawApi());

        redCircle.draw();
        blueCircle.draw();
    }
}
