package abstractFactory.products;

public class GasEngine implements Engine {
    public void start() {
        System.out.println("Запустили бензиновый двигатель...");
    }
}
