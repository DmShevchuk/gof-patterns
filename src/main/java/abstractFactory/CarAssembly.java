package abstractFactory;

import abstractFactory.factories.CarFactory;
import abstractFactory.products.Engine;
import abstractFactory.products.Wheel;

public class CarAssembly {
    private final CarFactory factory;

    public CarAssembly(CarFactory factory) {
        this.factory = factory;
    }

    public void assembleCar() {
        Engine engine = factory.createEngine();
        Wheel wheel = factory.createWheel();

        engine.start();
        wheel.rotate();
    }
}