package Clotheslab.Clothes;
import Clotheslab.Enums.Color;
import Clotheslab.Enums.Size;
import Clotheslab.Interfaces.MenСlothing;

public class tie extends Cloth implements MenСlothing {
    public tie(Size size, double price, Color color) {
        super(size, price, color);
    }
    @Override
    public void clothMen() {
        System.out.println("Мужчина надел галстук размера " + getSize().name() + ", цвета " + getColor() + ", за " + getPrice());
    }

}
