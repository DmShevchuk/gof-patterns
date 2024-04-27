package abstractFactory.factories;

import abstractFactory.products.Engine;
import abstractFactory.products.GasEngine;
import abstractFactory.products.GasWheel;
import abstractFactory.products.Wheel;

public class GasCarFactory implements CarFactory {
    public Engine createEngine() {
        return new GasEngine();
    }

    public Wheel createWheel() {
        return new GasWheel();
    }
}