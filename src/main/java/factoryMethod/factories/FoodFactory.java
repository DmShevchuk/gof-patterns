package factoryMethod.factories;

import factoryMethod.products.Food;
import factoryMethod.products.FoodType;

public interface FoodFactory {
    Food createFood(FoodType foodType);
}
