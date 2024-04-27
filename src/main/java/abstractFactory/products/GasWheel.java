package abstractFactory.products;

public class GasWheel implements Wheel {
    public void rotate() {
        System.out.println("Бензиновое колесо крутится...");
    }
}