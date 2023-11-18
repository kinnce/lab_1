package Clotheslab.Clothes;
import Clotheslab.Enums.Color;
import Clotheslab.Enums.Size;
import Clotheslab.Interfaces.MenСlothing;
import Clotheslab.Interfaces.WomenClothing;

public class tshirt extends Cloth implements MenСlothing, WomenClothing {
    public tshirt(Size size, double price, Color color) {
        super(size, price, color);
    }

    @Override
    public void clothMen() {
        System.out.println("Мужчина надел футболку размера " + getSize().name() + ", цвета " + getColor() + ", за " + getPrice());
    }

    @Override
    public void clothWomen() {
        System.out.println("Женщина надела футболку размера " + getSize().name() + ", цвета " + getColor() + ", за " + getPrice());
    }
}