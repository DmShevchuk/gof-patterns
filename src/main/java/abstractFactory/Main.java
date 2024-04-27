package abstractFactory;

import abstractFactory.factories.CarFactory;
import abstractFactory.factories.ElectricCarFactory;
import abstractFactory.factories.GasCarFactory;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new ElectricCarFactory();
        CarAssembly carAssembly = new CarAssembly(carFactory);
        carAssembly.assembleCar();

        System.out.println("=============");

        carFactory = new GasCarFactory();
        carAssembly = new CarAssembly(carFactory);
        carAssembly.assembleCar();
    }
}
