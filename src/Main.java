import colors.Color;
import service.ShapesService;
import service.impl.ShapeServiceImpl;
import shape.*;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        /*printPoint();
        printCircle();
        printRectangle();
        printTriangle();*/
        printInteface();

    }
    private static void printInteface(){
        List<Shape> list = new ArrayList<>();
        list.add(new Triangle(0,2,0,2,2,0, Color.RED));
        list.add(new Circle(3,3,2,Color.GREEN));
        list.add(new Rectangle(1,1,5,2));
        list.add(new Rectangle(6,5,1, 10));
        list.add(new Point(100,100));
        list.add(new Triangle(-2,3,-4,3,2,5));
        ShapeServiceImpl Interface = new ShapeServiceImpl();
        System.out.println(Interface.getMaxPerimeters(list));
        System.out.println(Interface.getSquares(list));
        System.out.println(Interface.getColors(list));

    }

    private static void printPoint() {
        System.out.println("---------------------------------");
        Point point = new Point(10, 10);
        point.setColor(Color.RED);
        point.move(10, 15);
        point.draw();
    }

    private static void printCircle() {
        System.out.println("----------------------------------");
        Circle circle = new Circle(10, 10, 1);
        circle.setRadius(10);
        circle.setColor(Color.BLACK);
        circle.move(5, 12);
        circle.draw();
    }

    private static void printRectangle() {
        System.out.println("----------------------------------");
        Rectangle rectangle = new Rectangle();
        rectangle.move(12, 3);
        rectangle.setColor(Color.BLUE);
        rectangle.draw();
    }

    private static void printTriangle() {
        System.out.println("----------------------------------");
        Triangle triangle = new Triangle();
        triangle.move(10, 16);
        triangle.setColor(Color.RED);
        triangle.draw();
    }

}