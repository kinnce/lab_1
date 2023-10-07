package shape;

import colors.Color;

public class Circle extends Shape {
    private Point point;
    private double radius;

    public Circle() {
        point = new Point(0, 0);
        radius = 1;
    }

    public Circle(Point point, double radius) {
        this.point = point;
        this.radius = radius;
        validate();
    }
    public Circle(Point point, double radius, Color color) {
        this.point = point;
        this.radius = radius;
        setColor(color);
        validate();
    }

    public Circle(double x, double y, double radius) {
        point = new Point(x, y);
        this.radius = radius;
        validate();
    }
    public Circle(double x, double y, double radius, Color color) {
        point = new Point(x, y);
        this.radius = radius;
        setColor(color);
        validate();
    }

    private void validate() {
        if (radius <= 0) System.out.println("Радиус должен быть больше нуля !");
        radius = 1;
    }

    @Override
    public void move(double moveX, double moveY) {
        point.move(moveX,moveY);
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.println("Фигура: Круг");
        System.out.println("Координаты центра: x == " + point.getX() + " y == " + point.getY());
        System.out.println("Площадь круга: " + this.getSquare());
        System.out.println("Периметр круга: " + this.getPerimeter());
        System.out.println("Цвет Круга: " + getColor());
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

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        validate();
    }
}