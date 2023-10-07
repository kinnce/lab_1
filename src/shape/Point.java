package shape;
import colors.Color;


public class Point extends Shape{
    private double x;
    private double y;
    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(double x, double y, Color color) {
        this.x = x;
        this.y = y;
        setColor(color);
    }

    @Override
    public void move(double moveX, double moveY) {
        this.x += moveX;
        this.y += moveY;
    }

    @Override
    public void draw() {
        System.out.println("Фигура: точка");
        System.out.println("Координаты точки: x == " + x + " y == " + y);
        System.out.println("Площадь: 0" );
        System.out.println("Периметр: 0");
        System.out.println("Цвет точки: " + getColor());
        System.out.println();
    }

    @Override
    public Color getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(Color color) {
        super.setColor(color);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}