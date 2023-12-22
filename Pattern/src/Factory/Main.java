package Factory;

public class Main {
    public static void main(String[] args) {
        Food food1 = Factory.getFood(FoodType.NUGGETS);
        System.out.println(food1 instanceof Naggets);
        Food food2 = Factory.getFood(FoodType.BURGER);
        System.out.println(food2 instanceof Burger);
        Food food3 = Factory.getFood(FoodType.FRENCHFRIES);
        System.out.println(food3 instanceof FrenchFries);
        Food food4 = Factory.getFood(FoodType.WINGS);
        System.out.println(food4 instanceof Wigs);
    }
}
