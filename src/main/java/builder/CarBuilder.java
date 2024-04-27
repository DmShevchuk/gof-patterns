package builder;

public interface CarBuilder {
    void buildEngine();
    void buildSeats();
    void buildColor();
    void buildTransmission();
    Car getCar();
}
