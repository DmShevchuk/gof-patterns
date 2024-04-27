package builder;

public class Main {
    public static void main(String[] args) {
        CarBuilder sportsBuilder = new SportsCarBuilder();
        CarDirector director = new CarDirector(sportsBuilder);
        Car sportsCar = director.constructCar();
        System.out.println("Спортивная машина: " + sportsCar);

        CarBuilder familyBuilder = new FamilyCarBuilder();
        director.setBuilder(familyBuilder);
        Car familyCar = director.constructCar();
        System.out.println("Семейная машина: " + familyCar);
    }
}
