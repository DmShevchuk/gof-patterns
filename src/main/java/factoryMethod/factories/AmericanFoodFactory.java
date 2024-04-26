package factoryMethod.factories;

import factoryMethod.products.AmericanBigMac;
import factoryMethod.products.AmericanCocaCola;
import factoryMethod.products.AmericanFries;
import factoryMethod.products.AmericanNuggets;
import factoryMethod.products.Food;
import factoryMethod.products.FoodType;

public class AmericanFoodFactory implements FoodFactory {
    @Override
    public Food createFood(FoodType foodType) {
        return switch (foodType) {
            case BIG_MAC -> new AmericanBigMac();
            case FRIES -> new AmericanFries();
            case COCA_COLA -> new AmericanCocaCola();
            case NUGGETS -> new AmericanNuggets();
        };
    }
}
