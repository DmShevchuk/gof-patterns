package abstractFactory.factories;

import abstractFactory.products.ElectricEngine;
import abstractFactory.products.ElectricWheel;
import abstractFactory.products.Engine;
import abstractFactory.products.Wheel;

public class ElectricCarFactory implements CarFactory {
    public Engine createEngine() {
        return new ElectricEngine();
    }

    public Wheel createWheel() {
        return new ElectricWheel();
    }
}