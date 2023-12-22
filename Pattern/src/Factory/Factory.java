package Factory;

public class Factory {

    public static Food getFood(FoodType type) {
        switch (type) {
            case BURGER:
                return new Burger();
            case NUGGETS:
                return new Naggets();
            case WINGS:
                return new Wigs();
            case FRENCHFRIES:
                return new FrenchFries();
            default:
                return new Food();
        }
    }
}
