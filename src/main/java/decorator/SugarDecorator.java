package decorator;

public class SugarDecorator extends DrinkDecorator {
    public SugarDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Sugar";
    }

    @Override
    public double cost() {
        return drink.cost() + 0.25;
    }
}