package Clotheslab.Clothes;
import Clotheslab.Enums.Size;
import Clotheslab.Interfaces.WomenClothing;

public class skirt extends Cloth implements WomenClothing {
    public skirt(Size size, double price, Clotheslab.Enums.Color color) {
        super(size, price, color);
    }
    @Override
    public void clothWomen() {
        System.out.println("Женщина надела юбку размера " + getSize().name() + ", цвета " + getColor() + ", за " + getPrice());
    }
}