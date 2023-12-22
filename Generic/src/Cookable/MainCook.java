package Cookable;

public class MainCook {
    public static void main(String[] args) {
        Food food =  new Food();
        Cookable cook = new Cookable() {
            @Override
            public void cook(String str) {
                System.out.println("I`m cooking " + str);
            }
        };
        food.prepare(cook, "meat");
    }
}
