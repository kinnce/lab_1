package Generic;

import java.sql.SQLOutput;

public class Cat extends Animal implements Serializable{
    private String breed;
    public Cat(String name, String bread) {
        super(name);
        this.breed = bread;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void print() {
        System.out.println("Print!");
    }
}
