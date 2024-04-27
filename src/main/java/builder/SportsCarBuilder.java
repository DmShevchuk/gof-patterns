package builder;

public class SportsCarBuilder implements CarBuilder {
    private final Car car;

    public SportsCarBuilder() {
        this.car = new Car();
    }

    @Override
    public void buildEngine() {
        car.setEngine("V8");
    }

    @Override
    public void buildSeats() {
        car.setSeats(2);
    }

    @Override
    public void buildColor() {
        car.setColor("Red");
    }

    @Override
    public void buildTransmission() {
        car.setTransmission("Manual");
    }

    @Override
    public Car getCar() {
        return this.car;
    }
}
