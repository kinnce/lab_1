package shape;

import colors.Color;

public class Triangle extends Shape {
    private Point A;
    private Point B;
    private Point C;
    private double sp(Point a, Point b, Point c) {
        return (b.getX() - a.getX()) * (c.getY() - b.getY()) - (c.getX() - b.getX()) * (b.getY() - a.getY());
    }
    public Triangle() {
        A = new Point();
        B = new Point(10.0, 10.0);
        C = new Point(20.0,0);
    }

    public Triangle(Point a, Point b, Point c) {
        A = a;
        B = b;
        C = c;
        validate();
    }
    public Triangle(Point a, Point b, Point c, Color color) {
        A = a;
        B = b;
        C = c;
        setColor(color);
        validate();
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        A = new Point(x1, y1);
        B = new Point(x2, y2);
        C = new Point(x3, y3);
        validate();
    }
    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3, Color color) {
        A = new Point(x1, y1);
        B = new Point(x2, y2);
        C = new Point(x3, y3);
        setColor(color);
        validate();
    }

    private void validate() {
        if (sp(A,B,C) == 0) {
            System.out.println("Все три точки лежат на одной прямой!");
            A = new Point();
            B = new Point(10.0, 10.0);
            C = new Point(20.0,0);
        }
    }

    public Point getA() {
        return A;
    }

    public void setA(Point a) {
        A = a;
        validate();
    }

    public Point getB() {
        return B;
    }

    public void setB(Point b) {
        B = b;
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
        B.move(B.getX() + moveX, B.getY() + moveY);
    }

    @Override
    public double getSquare() {
        double p = this.getPerimeter() / 2;
        return Math.sqrt(p * (p - getLengthAB()) * (p - getLengthBC()) * (p - getLengthAC()));
    }

    @Override
    public double getPerimeter() {
        return getLengthAB() + getLengthAC() + getLengthBC();
    }
    private double getLengthAB(){
        return Math.sqrt(Math.pow(B.getX() - A.getX(), 2) + Math.pow(B.getY() - A.getY(), 2));
    }
    private double getLengthBC(){
        return Math.sqrt(Math.pow(B.getX() - C.getX(), 2) + Math.pow(B.getY() - C.getY(), 2));
    }
    private double getLengthAC(){
        return Math.sqrt(Math.pow(C.getX() - A.getX(), 2) + Math.pow(C.getY() - A.getY(), 2));
    }

    @Override
    public void draw() {
        System.out.println("Фигура: Треугольник");
        System.out.println("Координаты точки А: x == " + A.getX() + " y == " + A.getY());
        System.out.println("Координаты точки B: x == " + B.getX() + " y == " + B.getY());
        System.out.println("Координаты точки C: x == " + C.getX() + " y == " + C.getY());
        System.out.println("Площадь треугольника: " + this.getSquare());
        System.out.println("Периметр треугольника: " + this.getPerimeter());
        System.out.println("Цвет треугольника: " + getColor());
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

