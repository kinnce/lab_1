package Generic;

public class MainGeneric {
    public static void main(String[] args) {
        Cat cat = new Cat("Thomas", "Siamese");
        Class<Integer, Cat, Double> class1 = new Class<Integer, Cat, Double>(10, cat, 50.0);
        class1.print();
    }
}
