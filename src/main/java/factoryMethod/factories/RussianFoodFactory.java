package factoryMethod.factories;

import factoryMethod.products.Food;
import factoryMethod.products.FoodType;
import factoryMethod.products.RussianBigMac;
import factoryMethod.products.RussianCocaCola;
import factoryMethod.products.RussianFries;
import factoryMethod.products.RussianNuggets;

public class RussianFoodFactory implements FoodFactory {
    @Override
    public Food createFood(FoodType foodType) {
        return switch (foodType) {
            case BIG_MAC -> new RussianBigMac();
            case FRIES -> new RussianFries();
            case COCA_COLA -> new RussianCocaCola();
            case NUGGETS -> new RussianNuggets();
        };
    }
}
