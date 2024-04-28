package adapter;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Rectangle
        Rectangle rectangle = new Rectangle(10, 20);

        // Представляем Rectangle как Square
        Square squareAdapter = new RectangleAdapter(rectangle);

        System.out.println("Side of square: " + squareAdapter.getSide());
        System.out.println("Area of square: " + squareAdapter.getArea());
    }
}
