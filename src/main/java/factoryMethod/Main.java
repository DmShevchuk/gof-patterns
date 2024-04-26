package factoryMethod;

import factoryMethod.factories.AmericanFoodFactory;
import factoryMethod.factories.FoodFactory;
import factoryMethod.factories.RussianFoodFactory;
import factoryMethod.products.FoodType;

public class Main {
    public static void main(String[] args) {
        FoodFactory russianFoodFactory = new RussianFoodFactory();
        System.out.println(russianFoodFactory.createFood(FoodType.BIG_MAC).getClass());
        System.out.println(russianFoodFactory.createFood(FoodType.FRIES).getClass());
        System.out.println(russianFoodFactory.createFood(FoodType.NUGGETS).getClass());
        System.out.println(russianFoodFactory.createFood(FoodType.COCA_COLA).getClass());


        FoodFactory americanFoodFactory = new AmericanFoodFactory();
        System.out.println(americanFoodFactory.createFood(FoodType.BIG_MAC).getClass());
        System.out.println(americanFoodFactory.createFood(FoodType.FRIES).getClass());
        System.out.println(americanFoodFactory.createFood(FoodType.NUGGETS).getClass());
        System.out.println(americanFoodFactory.createFood(FoodType.COCA_COLA).getClass());
    }
}
