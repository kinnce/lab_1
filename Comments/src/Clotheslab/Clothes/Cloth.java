package Clotheslab.Clothes;
import Clotheslab.Enums.Color;
import Clotheslab.Enums.Size;
public abstract class Cloth {
    private Size size;
    private double price;
    private Color Color;

    public Cloth(Size size, double price, Color color) {
        this.size = size;
        this.price = price;
        Color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Color getColor() {
        return Color;
    }

    public void setColor(Color color) {
        Color = color;
    }
}
