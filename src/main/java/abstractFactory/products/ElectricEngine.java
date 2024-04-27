package abstractFactory.products;

public class ElectricEngine implements Engine {
    public void start() {
        System.out.println("Запустили электрический двигатель...");
    }
}