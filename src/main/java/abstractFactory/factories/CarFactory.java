package abstractFactory.factories;

import abstractFactory.products.Engine;
import abstractFactory.products.Wheel;

public interface CarFactory {
    Engine createEngine();
    Wheel createWheel();
}
