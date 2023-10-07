package shape;

import colors.Color;

public class Rectangle extends Shape {
    private Point A;
    private Point C;

    public Rectangle() {
        A = new Point();
        C = new Point(10.0, 10.0);
    }

    public Rectangle(Point a, Point c) {
        A = a;
        C = c;
        validate();
    }
    public Rectangle(Point a, Point c, Color color) {
        A = a;
        C = c;
        setColor(color);
        validate();
    }

    public Rectangle(double x1, double y1, double x2, double y2) {
        A = new Point(x1, y1);
        C = new Point(x2, y2);
        validate();
    }
    public Rectangle(double x1, double y1, double x2, double y2, Color color) {
        A = new Point(x1, y1);
        C = new Point(x2, y2);
        setColor(color);
        validate();
    }

    private void validate() {
        if (A.getX() == C.getX() || A.getY() == C.getY()) {
            System.out.println("Точки лежат на одной прямой!");
            A = new Point();
            C = new Point(10,10);
        }
    }

    public Point getA() {
        return A;
    }

    public void setA(Point a) {
        A = a;
        validate();
    }

    public Point getC() {
        return C;
    }

    public void setC(Point c) {
        C = c;
        validate();
    }

    @Override
    public void move(double moveX, double moveY) {
        A.move(A.getX() + moveX, A.getY() + moveY);
        C.move(C.getX() + moveX, C.getY() + moveY);
    }

    @Override
    public double getSquare() {
        return Math.abs(C.getX() - A.getX()) * Math.abs(C.getY() - A.getY());
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.abs(C.getX() - A.getX()) + 2 * Math.abs(C.getY() - A.getY());
    }

    @Override
    public void draw() {
        System.out.println("Фигура: Прямоугольник");
        System.out.println("Координаты точки А: x == " + A.getX() + " y == " + A.getY());
        System.out.println("Координаты точки C: x == " + C.getX() + " y == " + C.getY());
        System.out.println("Площадь прямоугольника: " + this.getSquare());
        System.out.println("Периметр прямоугольника: " + this.getPerimeter());
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
}
