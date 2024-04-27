package builder;

public class FamilyCarBuilder implements CarBuilder {
    private final Car car;

    public FamilyCarBuilder() {
        this.car = new Car();
    }

    @Override
    public void buildEngine() {
        car.setEngine("V6");
    }

    @Override
    public void buildSeats() {
        car.setSeats(5);
    }

    @Override
    public void buildColor() {
        car.setColor("Blue");
    }

    @Override
    public void buildTransmission() {
        car.setTransmission("Automatic");
    }

    @Override
    public Car getCar() {
        return this.car;
    }
}
